/**
 * 从数据库获取区域等信息并填充到前端页面
 * 将表单信息提交至后台注册店铺
 */
$(function () {
    // 获取店铺分类以及初始信息
    var initUrl='/o2o/shop/getshopinitinfo';
    var registerShopUrl='/o2o/shopadmin/registershop';
    //js文件被加载时就运行方法

    getShopInitInfo();
    //获取店铺基本信息
    function getShopInitInfo() {
        //获取信息的方法     获取信息的url  回调的方法
        $.getJSON(initUrl,function (data) {
            if(data.success){
                //获取区域信息
                var tempHtml='';
                var tempAreaHtml='';
                //data里面是从后台获取到的数据  店铺分类的列表  使用map进行遍历
                data.shopCategoryList.map(function (item, index) {
                    tempHtml+='<option data-id="'+item.shopCategoryId+'">'
                    +item.shopCategoryName+'</option>';
                });
                data.areaList.map(function (item, index) {
                    tempAreaHtml+='<option data-id="'+item.areaId+'">'
                    +item.areaName+'</option>';
                });
                //将获取到的数据放到前端页面 ${'xxx'} 分别对应前端页面内设置的id
                $('#shop-category').html(tempHtml);
                $('#area').html(tempAreaHtml);
            }
        });
    $('#submit').click(function () {
       var shop={};
       //从前端页面定义好的控件获取输入的数据  并设置到shop中
       shop.shopName=$('#shop-name').val();
       shop.shopAddr=$('#shop-addr').val();
       shop.phone=$('#shop-phone').val();
       shop.shopDesc=$('#shop-desc').val();
       shop.shopCategory={
           shopCategoryId:$('#shop-category').find('option').not(function () {
              return !this.selected;
           }).data('id')
       };
       shop.area={
           areaId:$('#area').find('option').not(function () {
               return !this.selected;
           }).data('id')
       };
       // var shopImg=$('#shop-img')[0].files[0];
       var formData=new FormData;
       // formData.append('shopImg',shopImg);
        formData.append('shopStr',JSON.stringify(shop));

       $.ajax({
          url:registerShopUrl,
          type:'POST',
          data:formData,
          contentType:false,
          proceesData:false,
          cache:false,
          success:function (data) {
              if(data.success){
              }else {
                  $.toast('提交失败'+data.errMsg);
              }
          }
       });
    });
    }
})
package com.jzx.o2o.util;

import com.google.code.kaptcha.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * 判断验证码是否输入正确
 * @ClassName: CodeUtil
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/9 0009下午 4:27
 */
public class CodeUtil {
    public static boolean checkVerifyCode(HttpServletRequest request){
        //先获取去系统生成的验证码
        String verifyCodeExpected=(String)request.getSession().getAttribute(
                Constants.KAPTCHA_SESSION_KEY);
        //获取实际输入的验证码
        String verifyCodeActual=HttpServletRequsetUtil.getSpring(request,"verifyCodeActual");
        //进行对比
        if(verifyCodeActual==null||!verifyCodeActual.equals(verifyCodeExpected)){
            return false;
        }
        return true;

    }
}

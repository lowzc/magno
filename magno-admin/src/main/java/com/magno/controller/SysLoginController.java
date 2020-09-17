package com.magno.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.magno.config.KaptchaConfig;
import com.magno.utils.CommonUtil;
import com.magno.utils.R;
import com.magno.utils.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 登录相关
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2016年11月10日 下午1:15:31
 */
@Controller
public class SysLoginController {

    @Autowired
    private DefaultKaptcha captchaProducer;

    @RequestMapping("captcha.jpg")
    public void captcha(HttpServletResponse response) throws Exception {
        CommonUtil.validateCode(response,captchaProducer);
    }

//    /**
//     * 登录
//     */
//    @SysLog("登录")
//    @ResponseBody
//    @RequestMapping(value = "/sys/login", method = RequestMethod.POST)
//    public R login(String username, String password, String captcha) throws IOException {
//      //  String kaptcha="1111";
//        String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
//        if(null == kaptcha){
//            return R.error("验证码已失效");
//        }
//        if (!captcha.equalsIgnoreCase(kaptcha)) {
//            return R.error("验证码不正确");
//        }
//
//        try {
//            Subject subject = ShiroUtils.getSubject();
//            //sha256加密
//            password = new Sha256Hash(password).toHex();
//            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//            subject.login(token);
//        } catch (UnknownAccountException e) {
//            return R.error(e.getMessage());
//        } catch (IncorrectCredentialsException e) {
//            return R.error(e.getMessage());
//        } catch (LockedAccountException e) {
//            return R.error(e.getMessage());
//        } catch (AuthenticationException e) {
//            return R.error("账户验证失败");
//        }
//
//        return R.ok();
//    }
//
//    /**
//     * 退出
//     */
//    @RequestMapping(value = "logout", method = RequestMethod.GET)
//    public String logout() {
//        ShiroUtils.logout();
//        return "redirect:/";
//    }

}

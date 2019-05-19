package com.demo.Controllers;

import com.demo.Entity.User;
import com.demo.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.*;
import java.io.IOException;

@Controller
    @RequestMapping("/user")

    //这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
    //这样保证了session中存在user这个对象
    @SessionAttributes("user")


public class UserController {

    @Autowired
    private IUserService IUserService;

    //正常访问login页面
        @RequestMapping("/login")
        public String login(){
            return "login";
        }

    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user, Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
            //调用service方法
        user = IUserService.checkLogin(user.getUsername(),user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if (user != null){
            Cookie name = new Cookie("user_name",user.getUsername());
            name.setMaxAge(24*60*60);
            response.addCookie(name);
            HttpSession session = request.getSession();
            session.setAttribute("user_name",user.getUsername());
            String sessionID = session.getId();
            if (session.isNew()){
                System.out.println("session创建成功，session的ID是:"+sessionID);
                response.getWriter().print("session创建成功，session的ID是:"+sessionID);
            }else {
                System.out.println("服务器已存在该session，session的ID是:"+sessionID);
                response.getWriter().print("服务器已存在该session，session的ID是:"+sessionID);
            }
            model.addAttribute("user",user);
            model.addAttribute("user_name",user.getUsername());
            return  "success";
        }
        return "fail";
    }

    //测试超链接跳转到另一个页面是否可以取到session值
    @RequestMapping("/anotherpage")
    public String hrefpage(HttpServletRequest request){
            HttpSession session = request.getSession();
            String name = (String) session.getAttribute("user_name");
        System.out.println(session.getId());
        System.out.println(name);
            return "anotherpage";
    }

    //注销方法
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "login";
    }

    @RequestMapping("/register")
    public String regist(){
            return "register";
    }

    @RequestMapping("/doRegister")
    public String doRegist(User user,Model model){
        System.out.println(user.getUsername());
        IUserService.Register(user);
        return "success";
    }
}

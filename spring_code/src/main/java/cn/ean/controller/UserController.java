package cn.ean.controller;


import cn.ean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/{variable1}/usertest", method = RequestMethod.POST)
    public String controllerMethod(@PathVariable String variable1){
        System.out.println("=========run controller =========");
        userService.serviceMethod();
        System.out.println("=========controller method stop ========");
        return "success2";
    }
}

package cn.ean.test;


import cn.ean.controller.UserController;
import cn.ean.service.UserService;
import cn.ean.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;


public class SpringTest {


    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void testSpring(){
        System.out.println("test https sslVerify: \" false \" ");
    }

    @Test
    public void testBean(){
        UserService userService = new UserServiceImpl();
        setUserService(userService);
        userService.serviceMethod();
    }
}

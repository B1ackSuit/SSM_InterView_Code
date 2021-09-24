package cn.ean.service.impl;

import cn.ean.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void serviceMethod() {
        System.out.println("service method");
    }
}

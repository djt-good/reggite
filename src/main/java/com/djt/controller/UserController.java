package com.djt.controller;

import com.djt.common.R;
import com.djt.domain.User;
import com.djt.service.UserService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("/login")
    public R<User> login(@RequestBody Map user,HttpServletRequest request) {
        String phone = (String) user.get("phone");
        User byPhone = userService.findByPhone(phone);
        User user1 =null;
        if (byPhone == null) {
            user1 = new User();
            user1.setPhone(phone);
            userService.add(user1);

            request.getSession().setAttribute("user",user1.getId());
            return new R<User>(1, "success", user1, null);
        }
        request.getSession().setAttribute("user",byPhone.getId());
        return new R<User>(1, "success", user1, null);
    }
}

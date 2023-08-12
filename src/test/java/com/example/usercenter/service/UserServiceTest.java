package com.example.usercenter.service;

import com.example.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author qingzhu
 */

@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("qingzhu");
        user.setUserAccount("123");
        user.setAvatarUrl("https://i2.hdslb.com/bfs/face/ab4ae9ab59d1c112bdf4840497fb0152bd7f2e26.jpg@240w_240h_1c_1s_!web-avatar-space-header.avif");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("123");
        user.setEmail("123");
        user.setUserStatus(0);
        user.setUserCode("123");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

//    @Test
//    void userRegister() {
//        // 测试非空
//        String userAccount = "qingzhu1";
//        String userPassword = "";
//        String checkPassword = "123456";
//        String userCode = "1";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        // 账户昵称不小于4位
//        userAccount = "zhu";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        // 密码小于8位
//        userAccount = "qingzhu1";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        // 不能有特殊符号
//        userAccount = "qing zhu";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        // 密码和校验密码相同
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        // 账户不能重复
//        userAccount = "qingzhuo";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "qingzhu8";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertTrue(result > 0);
//    }
}
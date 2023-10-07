package com.example.usercenter.service;

import com.kang.usercenter.model.domain.User;
import com.kang.usercenter.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(0L);
        user.setUsername("Testyk2");
        user.setUserAccount("123");
        user.setAvatarUrl("https://cn.bing.com/images/search?view=detailV2&ccid=U%2f0Of2ht&id=39F41E9AB0B3E8BC4686D5651D5AB47A796D694B&thid=OIP.U_0Of2ht_UFjabtOpE2JZwHaD4&mediaurl=https%3a%2f%2ftechnofaq.org%2fwp-content%2fuploads%2f2020%2f10%2fnode-js.jpg&exph=1260&expw=2400&q=nodejs+16&simid=608031713147501754&FORM=IRPRST&ck=F299E2BB0D58E5E8E88C10934FE4A7C2&selectedIndex=2&ajaxhist=0&ajaxserp=0");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setEmail("123");
        user.setPhone("123");
        user.setPlanetCode("1");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }
    @Test
    public void userRegister() {
        String userAccount = "Testlzy2";
        String userPassword = "11111111";
        String checkPassword = "11111111";
        String planetCode="1234";
        long result = userService.userRegister(userAccount, userPassword,checkPassword,planetCode);
        Assertions.assertEquals(1, result);
    }

}
package cn.enjoy;

import cn.enjoy.dao.UsersMapper;
import cn.enjoy.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;

@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class UserTest {

    @Resource
    private UsersMapper usersMapper;

    @Test
    public void testAdd() {
        Users user = new Users();
        user.setPasswd("1234");
        user.setUsername("enjoy111");
        usersMapper.insertSelective(user);
    }

    @Test
    public void testFindUser() {
        Users enjoy = usersMapper.findByUsernameAndPasswd("enjoy", "123");
        System.out.println(enjoy);
    }

}

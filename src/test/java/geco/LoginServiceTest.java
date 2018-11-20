package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    private  LoginService loginService;

    @Before
    public void setUp() throws Exception {
        String[] tmp = new String[3];
        tmp[0] = "test";
        tmp[1] = "truc";
        tmp[2] = "foo";
        loginService = new LoginService(tmp);
    }

    @Test
    public void testLoginExists() {
        assertTrue("erreur",loginService.loginExists("test"));
    }

    @Test
    public void testAddLogin() {
        loginService.addLogin("bidule");
        assertTrue("login introuvable",loginService.loginExists("bidule"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        assertTrue(loginService.findAllLoginsStartingWith("tru").contains("truc"));
    }

    @Test
    public void findAllLogins() {
        List<String> tmp;
        tmp = loginService.findAllLogins();
        assertTrue(tmp.contains("test"));
        assertTrue(tmp.contains("truc"));
        assertTrue(tmp.contains("foo"));

    }
}
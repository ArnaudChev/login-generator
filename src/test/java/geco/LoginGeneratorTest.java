package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {

        LoginService loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForPaulAndDurand() {
        assertEquals("PDUR",loginGenerator.generateLoginForNomAndPrenom("Durand","Paul"));
    }

    @Test
    public void testGenerateLoginForNameWithSpecialCaracter() {
        assertEquals("PDUR",loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul"));
    }

    @Test
    public void testGenerateLoginForJeanAndRolling() {
        assertEquals("JROL1",loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean"));
    }

    @Test
    public void testGenerateLoginForAnExistantUser() {
        assertEquals("JRAL2",loginGenerator.generateLoginForNomAndPrenom("Ralling","John"));
    }
}
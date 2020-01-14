/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aparkin1
 */
public class UserTest {
    private User testUser = new User();
    
    
    
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        testUser.address = "test adress";
        testUser.email = "test email";
        testUser.id = "U0";
        testUser.name = "test name";
        testUser.password = "test password";
        testUser.phoneNumber = "test phoneno";
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        fail("Test not yet implemented");
    }

    @Test
    public void testGetAddress() {
        fail("Test not yet implemented");
    }

    @Test
    public void testGetEmail() {
        fail("Test not yet implemented");
    }

    @Test
    public void testGetPhoneNumber() {
        fail("Test not yet implemented");
    }

    @Test
    public void testGetId() {
        fail("Test not yet implemented");
    }

    @Test
    public void testGetPassword() {
        fail("Test not yet implemented");
    }

    @Test
    public void testSetName() {
        fail("Test not yet implemented");
    }

    @Test
    public void testSetAddress() {
        fail("Test not yet implemented");
    }

    @Test
    public void testSetEmail() {
        fail("Test not yet implemented");
    }

    @Test
    public void testSetPhoneNumber() {
        fail("Test not yet implemented");
    }

    @Test
    public void testSetId() {
        fail("Test not yet implemented");
    }

    @Test
    public void testSetPassword() {
        fail("Test not yet implemented");
    }

    @Test
    public void testIsValid() {
        assertTrue(testUser.isValid());
    }
    
}

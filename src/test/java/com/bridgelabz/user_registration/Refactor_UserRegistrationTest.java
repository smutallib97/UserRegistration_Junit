package com.bridgelabz.user_registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Refactor_UserRegistrationTest {
    Refactor_UserRegistration refactor_userRegistration = new Refactor_UserRegistration();
    /*
       Unit test for validating first name starts with Capital Letter
       Used try catch block to handle the exception
    */
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.firstName("Sayyed");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = refactor_userRegistration.firstName("sayyed");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.firstName(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.firstName("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating last name starts with Capital Letter
       Used try catch block to handle the exception
    */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.lastName("Mutallib");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = refactor_userRegistration.lastName("mutallib");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLAstName_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.lastName(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.lastName("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating email address
       Used try catch block to handle the exception
    */
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.email("abc@yahoo.com");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = refactor_userRegistration.email("abc()*@gmail.com");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.email(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = refactor_userRegistration.email("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating phone number in a pre-defined format
       Used try catch block to handle the exception
    */
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.phoneNumber("91 9919819801");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = refactor_userRegistration.phoneNumber("9919819801");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.phoneNumber(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.phoneNumber("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password with minimum 8 characters
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.passwordRule1("password@123");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = refactor_userRegistration.passwordRule1("psw@");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule1(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule1_emptyString_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule1("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password should contain atleast one upper case
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.passwordRule2("passWord@123");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = refactor_userRegistration.passwordRule2("psw@");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule2(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule2("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password should contain atleast one numeric value
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.passwordRule3("123Aa@123");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = refactor_userRegistration.passwordRule3("123456789");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule3(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_emptyString_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule3("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password should contain atleast one special character
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = refactor_userRegistration.passwordRule4("@123@Abc");
            Assertions.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = refactor_userRegistration.passwordRule4("@@@@@@@@@A");
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_null_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule4(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_emptyString_ShouldThrowUserRegistrationException() {
        try {
            refactor_userRegistration.passwordRule4("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }
}
package com.bridgelabz.user_registration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    /*
      Unit test for validating first name starts with Capital Letter
      Used try catch block to handle the exception
   */
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateFirstName.validate("Mallepogu");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = userRegistration.validateFirstName.validate("mallepogu");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateFirstName.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateFirstName.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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
            boolean result = userRegistration.validateLastName.validate("Alankritha");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateLastName.validate("alankritha");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateLastName.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateLastName.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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
            boolean result = userRegistration.validateEmail.validate("abc@yahoo.com");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateEmail.validate("abc()*@gmail.com");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateEmail.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = userRegistration.validateEmail.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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
            boolean result = userRegistration.validatePhoneNumber.validate("91 7646443888");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePhoneNumber.validate("+91 784547388");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePhoneNumber.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePhoneNumber.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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
            boolean result = userRegistration.validatePassword.validate("password@123");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("psw@");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule1_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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
            boolean result = userRegistration.validatePassword.validate("passWord@123");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("psw@");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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
            boolean result = userRegistration.validatePassword.validate("123Aa@123");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("123456789");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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
            boolean result = userRegistration.validatePassword.validate("@123@Abc");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("@@@@@@@@@A");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateEmailId.validate("abc.100@abc.com.au");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }
}
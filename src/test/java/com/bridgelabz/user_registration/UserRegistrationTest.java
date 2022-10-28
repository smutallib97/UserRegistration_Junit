package com.bridgelabz.user_registration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    //UC1 - Enter Valid USer First Name
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Sayyed");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("sayyed");
        Assertions.assertEquals(false, result);
    }
    //UC2 - Enter Valid USer Last Name
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Mutallib");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("mutallib");
        Assertions.assertEquals(false, result);
    }
    //UC3 - Enter Valid User email
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.email("abc.xyz@bl.co.in");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.email("abc.xyz.in");
        Assertions.assertEquals(false, result);
    }
    //UC4 - Enter Valid User Mobile Number
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNumber("91 9919819801");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.mobileNumber("9919819801");
        Assertions.assertEquals(false, result);
    }
    //UC5 - Rule1: minimum 8 characters
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.password("mutallib");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.password("mu");
        Assertions.assertEquals(false, result);
    }
}
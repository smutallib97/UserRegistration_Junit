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
}
package com.trangmai;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordComplexityTest {

    @Test
    public void isPasswordHaveAtLeastSixCharactersTest(){
        //Setup
        PasswordComplexity passwordComplexity = new PasswordComplexity();

        //Assert True
        Boolean output1 = passwordComplexity.isPasswordComplex("Hellohanoi123");
        assertTrue(output1);

        //Assert False
        Boolean output2 = passwordComplexity.isPasswordComplex("Hell1");
        assertFalse(output2);

    }



    @Test
    public void isPasswordHaveOneUppercaseLetterTest(){
        PasswordComplexity passwordComplexity = new PasswordComplexity();
        Boolean output1 = passwordComplexity.isPasswordComplex("Cafe123");

        assertTrue(output1);

        //Assert false
        Boolean output2 = passwordComplexity.isPasswordComplex("cafe123");
        assertFalse(output2);

    }


    @Test
    public void isPasswordHaveOneLowercaseLetterTest(){
        PasswordComplexity passwordComplexity = new PasswordComplexity();
        Boolean output1 = passwordComplexity.isPasswordComplex("Cc12345");

        assertTrue(output1);

        //Assert false
        Boolean output2 = passwordComplexity.isPasswordComplex("CC12345");
        assertFalse(output2);

    }

    @Test
    public void isPasswordHaveOneNumberTest(){
        PasswordComplexity passwordComplexity = new PasswordComplexity();
        Boolean output1 = passwordComplexity.isPasswordComplex("Vietnam1");

        assertTrue(output1);

        //Assert false
        Boolean output2 = passwordComplexity.isPasswordComplex("Vietnam");
        assertFalse(output2);

    }
}

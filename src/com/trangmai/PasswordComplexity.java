package com.trangmai;

public class PasswordComplexity {
    public Boolean isPasswordComplex(String password) {
//        boolean isUpperCase = false;
//        boolean isLowerCase = false;
//        boolean isNumber = false;
//
//        if (password.length() < 6) return false;
//
//        for(int i = 0; i < password.length(); i++){
//            if(Character.isUpperCase(password.charAt(i))){
//                isUpperCase = true;
//            }
//            if(Character.isLowerCase(password.charAt(i))){
//                isLowerCase = true;
//            }
//            if(Character.isDigit(password.charAt(i))){
//                isNumber = true;
//            }
//        }
//        return  isLowerCase && isUpperCase && isNumber;

        return (password.length() >= 6) &&
                password.matches(".*\\d.*") &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*");

    }
}

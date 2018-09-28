package com.codefights.palindrone;

/**
 * Created by intel on 9/28/2018.
 */
public class Palindrone {

    public boolean checkPalindrome(String inputString) {
        if(inputString == null || inputString.length() == 0 || inputString.length() >= 11){
            return false;
        }

        String[] checkPalindrome = inputString.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = checkPalindrome.length - 1; i >= 0; i--){
            sb.append(checkPalindrome[i]);
        }
        return (inputString.equals(sb.toString()));
    }

}

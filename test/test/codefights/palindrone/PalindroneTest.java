package test.codefights.palindrone;

import com.codefights.palindrone.Palindrone;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by intel on 9/28/2018.
 */
public class PalindroneTest {

    @Test
    public void test1(){
        String test = "aabaa";
        Boolean result = true;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }

    @Test
    public void test2(){
        String test = "abac";
        Boolean result = false;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }

    @Test
    public void test3(){
        String test = "a";
        Boolean result = true;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }

    @Test
    public void test4(){
        String test = "az";
        Boolean result = false;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }

    @Test
    public void test5(){
        String test = "abacaba";
        Boolean result = true;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }

    @Test
    public void test6(){
        String test = "z";
        Boolean result = true;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }


    @Test
    public void test7(){
        String test = "aaabaaaa";
        Boolean result = false;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }


    @Test
    public void test8(){
        String test = "zzzazzazz";
        Boolean result = false;

        Palindrone palindrone = new Palindrone();
        Assert.assertEquals(palindrone.checkPalindrome(test), result);
    }

}

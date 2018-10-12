package test.codefights.sums;

import com.codefights.sums.Sums;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mvargas  on 9/28/2018.
 */
public class SumsTests {

    @Test
    public void test1(){
        int a = 1;
        int b = 2;

        Sums sums = new Sums();
        int result = sums.add(a,b);

        Assert.assertEquals(result, a + b);
    }

    @Test
    public void test2(){
        int a = 0;
        int b = 1000;

        Sums sums = new Sums();
        int result = sums.add(a,b);

        Assert.assertEquals(result, a + b);
    }

    @Test
    public void test3(){
        int a = 2;
        int b = -39;

        Sums sums = new Sums();
        int result = sums.add(a,b);

        Assert.assertEquals(result, a + b);
    }

    @Test
    public void test4(){
        int a = 99;
        int b = 100;

        Sums sums = new Sums();
        int result = sums.add(a,b);

        Assert.assertEquals(result, a + b);
    }

    @Test
    public void test5(){
        int a = 100;
        int b = -100;

        Sums sums = new Sums();
        int result = sums.add(a,b);

        Assert.assertEquals(result, a + b);
    }

    @Test
    public void test6(){
        int a = -1000;
        int b = -1000;

        Sums sums = new Sums();
        int result = sums.add(a,b);

        Assert.assertEquals(result, a + b);
    }
}

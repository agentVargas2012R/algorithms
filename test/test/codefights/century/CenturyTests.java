package test.codefights.century;

import com.codefights.century.Century;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by intel on 9/28/2018.
 */
public class CenturyTests {

    @Test
    public void test1(){

        int year = 1905;
        int pass = 20;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }


    @Test
    public void test2(){

        int year = 1700;
        int pass = 17;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }


    @Test
    public void test3(){

        int year = 1988;
        int pass = 20;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }

    @Test
    public void test4(){

        int year = 2000;
        int pass = 20;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }

    @Test
    public void test5(){

        int year = 200;
        int pass = 2;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }

    @Test
    public void test6(){

        int year = 374;
        int pass = 4;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }

    @Test
    public void test7(){

        int year = 45;
        int pass = 1;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }

    @Test
    public void test9(){

        int year = 8;
        int pass = 1;

        Century century = new Century();
        int result = century.centuryFromYear(year);

        Assert.assertEquals(result, pass);
    }
}

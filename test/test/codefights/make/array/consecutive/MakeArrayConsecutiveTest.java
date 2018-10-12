package test.codefights.make.array.consecutive;

import com.codefights.make.array.consecutive.MakeArrayConsecutive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mvargas  on 10/12/2018.
 */
public class MakeArrayConsecutiveTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    /**
     * Input:
     * statues: [6, 2, 3, 8]
     *
     * Output:
     * Run the code to see output
     * Expected Output:
     * 3
     *
     * Console Output:
     * Empty
     */
    @Test
    public void test1(){
        MakeArrayConsecutive makeArrayConsecutive = new MakeArrayConsecutive();

        int[] statues = new int[4];
        statues[0] = 6;
        statues[1] = 2;
        statues[2] = 3;
        statues[3] = 8;

        int pass = 3;
        int result =  makeArrayConsecutive.makeArrayConsecutive2(statues);

        assert(pass == result);

    }


    @Test
    public void test2(){
        MakeArrayConsecutive makeArrayConsecutive = new MakeArrayConsecutive();

        int[] statues = new int[2];
        statues[0] = 0;
        statues[1] = 3;

        int pass = 2;
        int result =  makeArrayConsecutive.makeArrayConsecutive2(statues);

        assert(pass == result);

    }

    @Test
    public void test3(){
        MakeArrayConsecutive makeArrayConsecutive = new MakeArrayConsecutive();

        int[] statues = new int[3];
        statues[0] = 5;
        statues[1] = 4;
        statues[2] = 6;

        int pass = 0;
        int result =  makeArrayConsecutive.makeArrayConsecutive2(statues);

        assert(pass == result);

    }

    @Test
    public void test4(){
        MakeArrayConsecutive makeArrayConsecutive = new MakeArrayConsecutive();

        int[] statues = new int[2];
        statues[0] = 6;
        statues[1] = 3;

        int pass = 2;
        int result =  makeArrayConsecutive.makeArrayConsecutive2(statues);

        assert(pass == result);

    }

    @Test
    public void test5(){
        MakeArrayConsecutive makeArrayConsecutive = new MakeArrayConsecutive();

        int[] statues = new int[1];
        statues[0] = 1;

        int pass = 0;
        int result =  makeArrayConsecutive.makeArrayConsecutive2(statues);

        assert(pass == result);

    }
}

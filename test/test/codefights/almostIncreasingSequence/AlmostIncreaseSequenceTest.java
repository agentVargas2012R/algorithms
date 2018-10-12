package test.codefights.almostIncreasingSequence;

import com.codefights.almostIncreasingSequence.AlmostIncreasingSequence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mvargas on 10/12/2018.
 *
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
 *
 * Example
 *
 * For sequence = [1, 3, 2, 1], the output should be
 * almostIncreasingSequence(sequence) = false.
 *
 * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
 *
 * For sequence = [1, 3, 2], the output should be
 * almostIncreasingSequence(sequence) = true.
 * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
 *
 * Input/Output
 * [execution time limit] 3 seconds (java)
 *
 * [input] array.integer sequence
 *
 * Guaranteed constraints:
 * 2 ≤ sequence.length ≤ 105,
 * -105 ≤ sequence[i] ≤ 105.
 *
 * [output] boolean
 * Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
 */
public class AlmostIncreaseSequenceTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    //sequence: [1, 3, 2, 1]
    @Test
    public void test1(){
        int[] sequence = new int[4];
        sequence[0] = 1;
        sequence[1] = 3;
        sequence[2] = 2;
        sequence[3] = 1;

        boolean pass = false;

        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        boolean result = almostIncreasingSequence.almostIncreasingSequence(sequence);

        assert(pass == result);
    }

    //sequence: [1, 3, 2]
    @Test
    public void test2(){
        int[] sequence = new int[3];
        sequence[0] = 1;
        sequence[1] = 3;
        sequence[2] = 2;

        boolean pass = true;

        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        boolean result = almostIncreasingSequence.almostIncreasingSequence(sequence);

        assert(pass == result);
    }

    //sequence: [1, 4, 10, 4, 2]
    @Test
    public void test3(){
        int[] sequence = new int[5];
        sequence[0] = 1;
        sequence[1] = 4;
        sequence[2] = 10;
        sequence[3] = 4;
        sequence[4] = 2;

        boolean pass = false;

        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        boolean result = almostIncreasingSequence.almostIncreasingSequence(sequence);

        assert(pass == result);
    }

    //sequence: [10, 1, 2, 3, 4, 5]
    @Test
    public void test4(){
        int[] sequence = new int[6];
        sequence[0] = 10;
        sequence[1] = 1;
        sequence[2] = 2;
        sequence[3] = 3;
        sequence[4] = 4;
        sequence[5] = 5;

        boolean pass = true;

        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        boolean result = almostIncreasingSequence.almostIncreasingSequence(sequence);

        assert(pass == result);
    }

    //sequence: [1, 1, 1, 2, 3]
    @Test
    public void test5(){
        int[] sequence = new int[5];
        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;
        sequence[3] = 2;
        sequence[4] = 3;

        boolean pass = false;

        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        boolean result = almostIncreasingSequence.almostIncreasingSequence(sequence);

        assert(pass == result);
    }


    //sequence: [1, 2, 3, 4, 5, 3, 5, 6]
    @Test
    public void test6(){
        int[] sequence = new int[8];
        sequence[0] = 1;
        sequence[1] = 2;
        sequence[2] = 3;
        sequence[3] = 4;
        sequence[4] = 5;
        sequence[5] = 3;
        sequence[6] = 5;
        sequence[7] = 6;

        boolean pass = true;

        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        boolean result = almostIncreasingSequence.almostIncreasingSequence(sequence);

        assert(pass == result);
    }
}

package test.codefights.adjacent;

import com.codefights.adjacent.AdjacentElements;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mvargas  on 10/12/2018.
 *
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 * Example
 *
 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
 * adjacentElementsProduct(inputArray) = 21.
 * 7 and 3 produce the largest product.
 *
 * Input/Output
 * [execution time limit] 3 seconds (java)
 *
 * [input] array.integer inputArray
 * An array of integers containing at least two elements.
 *
 * Guaranteed constraints:
 * 2 ≤ inputArray.length ≤ 10,
 * -1000 ≤ inputArray[i] ≤ 1000.
 *
 * [output] integer
 *
 * The largest product of adjacent elements
 */
public class AdjacentElementTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    @Test
    public void test1(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[6];
        list[0] = 3;
        list[1] = 6;
        list[2] = -2;
        list[3] = -5;
        list[4] = 7;
        list[5] =3;


        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 21;

        assert(result == pass);
    }

    @Test
    public void test2(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[2];
        list[0] = -1;
        list[1] = -2;


        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 2;

        assert(result == pass);
    }

    @Test
    public void test3(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[6];
        list[0] = 5;
        list[1] = 1;
        list[2] = 2;
        list[3] = 3;
        list[4] = 1;
        list[5] = 4;

        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 6;

        assert(result == pass);
    }

    //[1, 2, 3, 0]
    @Test
    public void test4(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[4];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 0;

        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 6;

        assert(result == pass);
    }

    @Test
    public void test5(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[7];
        list[0] = 9;
        list[1] = 5;
        list[2] = 10;
        list[3] = 2;
        list[4] = 24;
        list[5] = -1;
        list[6] = -48;

        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 50;

        assert(result == pass);
    }

    //[5, 6, -4, 2, 3, 2, -23]
    @Test
    public void test6(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[7];
        list[0] = 5;
        list[1] = 6;
        list[2] = -4;
        list[3] = 2;
        list[4] = 3;
        list[5] = 2;
        list[6] = -23;

        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 30;

        assert(result == pass);
    }

    //[4, 1, 2, 3, 1, 5]
    @Test
    public void test7(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[6];
        list[0] = 4;
        list[1] = 1;
        list[2] = 2;
        list[3] = 3;
        list[4] = 1;
        list[5] = 5;

        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 6;

        assert(result == pass);
    }

    //[1, 0, 1, 0, 1000]
    @Test
    public void test8(){
        AdjacentElements adjacentElements = new AdjacentElements();
        int[] list = new int[5];
        list[0] = 1;
        list[1] = 0;
        list[2] = 1;
        list[3] = 0;
        list[4] = 1000;

        int result = adjacentElements.adjacentElementsProduct(list);
        int pass = 0;

        assert(result == pass);
    }

}

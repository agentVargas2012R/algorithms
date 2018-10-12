package test.codefights.matrixElement;

import com.codefights.matrixElement.MatrixElementSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mvargas on 10/12/2018.
 */
public class MatrixElementSumTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    /**
     * Input:
     * matrix: [[0,1,1,2],
     *          [0,5,0,0],
     *          [2,0,3,3]]
     *
     * Expected Output:   9
     */
    @Test
    public void test1(){
        int[][] matrix = new int[3][4];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 2;

        matrix[1][0] = 0;
        matrix[1][1] = 5;
        matrix[1][2] = 0;
        matrix[1][3] = 0;

        matrix[2][0] = 2;
        matrix[2][1] = 0;
        matrix[2][2] = 3;
        matrix[2][3] = 3;

        MatrixElementSum matrixElementSum = new MatrixElementSum();

        int result = matrixElementSum.matrixElementsSum(matrix);
        int pass = 9;

        assert( result == pass);

    }

    /**
     * Input:
     * matrix: [[1,1,1,0],
     *          [0,5,0,1],
     *          [2,1,3,10]]
     *
     * Expected Output:  9
     */
    @Test
    public void test2(){

        int[][] matrix = new int[3][4];

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 0;

        matrix[1][0] = 0;
        matrix[1][1] = 5;
        matrix[1][2] = 0;
        matrix[1][3] = 1;

        matrix[2][0] = 2;
        matrix[2][1] = 1;
        matrix[2][2] = 3;
        matrix[2][3] = 10;

        MatrixElementSum matrixElementSum = new MatrixElementSum();

        int result = matrixElementSum.matrixElementsSum(matrix);
        int pass = 9;

        assert( result == pass);
    }

    /**
     *
     * matrix: [[1,1,1],
     *          [2,2,2],
     *          [3,3,3]]
     *
     * Expected Output:  18
     */
    @Test
    public void test3(){
        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;


        matrix[1][0] = 2;
        matrix[1][1] = 2;
        matrix[1][2] = 2;


        matrix[2][0] = 3;
        matrix[2][1] = 3;
        matrix[2][2] = 3;


        MatrixElementSum matrixElementSum = new MatrixElementSum();

        int result = matrixElementSum.matrixElementsSum(matrix);
        int pass = 18;

        assert( result == pass);
    }

    /**
     * matrix: [[0]]
     */
    @Test
    public void test4(){
        int[][] matrix = new int[1][1];
        matrix[0][0] = 0;

        MatrixElementSum matrixElementSum = new MatrixElementSum();

        int result = matrixElementSum.matrixElementsSum(matrix);
        int pass = 0;

        assert( result == pass);
    }
}

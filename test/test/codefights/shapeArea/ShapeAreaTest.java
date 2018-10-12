package test.codefights.shapeArea;

import com.codefights.shapeArea.ShapeArea;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mvargas  on 10/12/2018.
 */
public class ShapeAreaTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    @Test
    public void test1(){
        ShapeArea shapeArea = new ShapeArea();

        int n = 2;
        int pass = 5;

        int result = shapeArea.shapeArea(n);

        assert(result == pass);
    }

    @Test
    public void test2(){
        ShapeArea shapeArea = new ShapeArea();

        int n = 3;
        int pass = 13;

        int result = shapeArea.shapeArea(n);

        assert(result == pass);
    }

    @Test
    public void test3(){
        ShapeArea shapeArea = new ShapeArea();

        int n = 3;
        int pass = 13;

        int result = shapeArea.shapeArea(n);

        assert(result == pass);
    }

    @Test
    public void test4(){
        ShapeArea shapeArea = new ShapeArea();

        int n = 5;
        int pass = 41;

        int result = shapeArea.shapeArea(n);

        assert(result == pass);
    }
}

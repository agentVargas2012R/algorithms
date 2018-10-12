package com.codefights.shapeArea;

/**
 * Created by mvargas  on 10/12/2018.
 */
public class ShapeArea {

    /**
     * FORMULA 1
     * f(1) = 1;
     * f(2) = f(1) + 4*1 = 5;
     * f(3) = f(2) + 4*2 = 13;
     * f(4) = f(3) + 4*3 = 25;
     */
    public int shapeArea(int n) {

        if(n == 0){
            return 0;
        }

        if(n==1){
            return 1;
        }else{
            return shapeArea(n-1) + (n-1)*4;
        }

    }
}

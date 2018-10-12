package com.codefights.adjacent;

/**
 * Created by mvargas  on 10/12/2018.
 */
public class AdjacentElements {

    public int adjacentElementsProduct(int[] inputArray) {

        if(inputArray.length == 1){
            return 0;
        }
        int product = inputArray[0] * inputArray[1];
        for(int i = 0; i < inputArray.length - 1; i++){
            if((inputArray[i] * inputArray[i+1]) > product){
                product = inputArray[i] * inputArray[i+1];
            }
        }

        return product;
    }

}

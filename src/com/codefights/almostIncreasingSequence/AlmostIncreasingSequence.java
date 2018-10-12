package com.codefights.almostIncreasingSequence;

/**
 * Created by mvargas  on 10/12/2018.
 */
public class AlmostIncreasingSequence {

    public boolean almostIncreasingSequence(int[] sequence) {

        //[1] && []
        if(sequence.length == 0 || sequence.length == 1 ){
            return false;
        }

        //[1,2] == true
        if(sequence.length == 2){
            return true;
        }

        int ltCounter = 0;
        int gtCounter = 0;
        int eqCounter = 0;
        for(int i = sequence.length - 1; i >= 1; i--){
            if(sequence[i] > sequence[i-1]){
                ltCounter++;
            }else if (sequence[i] == sequence[i-1]){
                eqCounter++;
            }else{
                gtCounter++;
            }
        }

        //[1,3,2]
        if(ltCounter == 1 && gtCounter == 1){
            return true;
        }

        //[1,3,2,1]
        if(ltCounter == 1 && gtCounter > 1){
            return false;
        }


        //[6,5,4]
        if(gtCounter > 1 && ltCounter == 0 ){
            return false;
        }

        //[1,1,1,2,3]
        if(eqCounter > 1 && ltCounter == 2 || ltCounter > 1 && gtCounter == 2){
            return false;
        }

        //[1,2,3]
        if(gtCounter == 0 && ltCounter > 1){
            return true;
        }

        //[3,1,2,3]
        if(gtCounter == 1 && ltCounter > 1){
            return true;
        }

        return false;
    }

}

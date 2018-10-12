package com.codefights.make.array.consecutive;

/**
 * Created by mvargas  on 10/12/2018.
 */
public class MakeArrayConsecutive {

    /**
     * For statues = [6,2,3,8], the output should be 3
     * makeArrayConsecutive2(statues) = 3
     */
    public int makeArrayConsecutive2(int[] statues) {
        int temp;
        for(int i = 0; i < statues.length; i++){
            for(int j = 1; j < statues.length - i; j++){
                if(statues[j-1] > statues[j]){
                    temp = statues[j-1];
                    statues[j-1] = statues[j];
                    statues[j] = temp;
                }
            }
        }

        int statuesCount = 0;
        for(int k = 0; k < statues.length-1; k++){
            int firstStatue = statues[k];
            int secondStatue = statues[k+1];
            statuesCount = statuesCount + (secondStatue-(firstStatue+1));
        }

        return statuesCount;
    }
}

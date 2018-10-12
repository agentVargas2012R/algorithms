package com.codefights.matrixElement;

/**
 * Created by mvargas on 10/12/2018.
 *
 * After they became famous, the CodeBots all decided to move to a new building and live together.
 * The building is represented by a rectangular matrix of rooms. Each cell in the matrix contains an integer that represents
 * the price of the room. Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are
 * afraid of them. That is why any room that is free or is located anywhere below a free room in the same column is not considered suitable for the bots to live in.
 *
 * Help the bots calculate the total price of all the rooms that are suitable for them.
 * Example
 *
 * For
 * matrix = [[0, 1, 1, 2],
 *           [0, 5, 0, 0],
 *           [2, 0, 3, 3]]
 *
 * the output should be
 *           matrixElementsSum(matrix) = 9.
 */
public class MatrixElementSum {

    /**
     * Help the bots calculate the total price of all the rooms that are suitable for them.
     *
     * If A is above B, and B is above C && A is haunted, your algorithm will mark B as haunted, and then mark C is
     * haunted (which it shouldn't). The room below a haunted room is not haunted, simply uninhabitable
     **/
    public int matrixElementsSum(int[][] matrix) {
        int result = 0;
        int x = matrix.length - 1;
        int y = (x == 0) ? matrix[x].length - 1 : matrix[x-1].length - 1;
        for(int column = 0; column <= y; column++){
            for(int row = 0; row <= x; row++){
                if(matrix[row].length > column){
                    int determinent = matrix[row][column];
                    if(determinent == 0 || determinent > 10){
                        break;
                    }else{
                        result += determinent;
                    }
                }
            }
        }

        return result;
    }
}

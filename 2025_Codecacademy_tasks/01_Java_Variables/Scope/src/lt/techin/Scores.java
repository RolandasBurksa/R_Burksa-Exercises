package lt.techin;

import java.util.Arrays;

public class Scores {

    public static void main(String[] args) {

        //Declare and initialize a 4x3 2D array of doubles called `scores` below
        double[][] scores = new double[4][3];
        scores[0][0] = 80.4;
        scores[1][0] = 96.2;
        scores[2][0] = 100.0;
        scores[3][0] = 78.9;

        System.out.println(Arrays.deepToString(scores));

        for(int i = 0; i < scores.length; i ++) {
            for(int j = 0; j < scores[i].length; j++){
                if(scores[i][j] == 0) {
                    scores[i][j] = -1;
                }
            }
        }

        System.out.println(Arrays.deepToString(scores));

        double[][] newScores = new double[4][2];

        //Use `for` loops to copy the scores below
        for(int i = 0; i < newScores.length; i++) {
            for(int j = 0; j < newScores[i].length; j++){
                newScores[i][j] = scores[i][j];
            }
        }

        System.out.println(Arrays.deepToString(newScores));
        //Iterate through the `newScores` 2D array and use `if` statement to add 2 additional points below
        for(int i = 0; i < newScores.length; i++) {
            for(int j = 0; j < newScores[i].length; j++){
                if(newScores[i][j] < 90) {
                    newScores[i][j] += 2;
                }
            }
        }

        System.out.println(Arrays.deepToString(newScores));
    }
}

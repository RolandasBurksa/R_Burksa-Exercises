package lt.techin;

import java.util.Arrays;

public class TraversingLoops {

    public static void main(String[] args) {
        int[][] imageData={
                {100,90,255,80,70,255,60,50},
                {255,10,5,255,10,5,255,255},
                {255,255,255,0,255,255,255,75},
                {255,60,30,0,30,60,255,255}
        };
        // Declare and initialize the 2D array newImage
        int[][] newImage = new int[4][6];

        // Add a nested `for` loop and copy the data of `imagedata` to `newImage`
//        for(int i = 0; i < imageData.length; i++) {
//            for(int j = 0; j < imageData[i].length - 2; j++) {
//                newImage[i][j] = imageData[i][j];
//            }
//        }

        for(int i = 0; i < newImage.length; i++) {
            for(int j = 0; j < newImage[i].length; j++) {
                newImage[i][j] = imageData[i][j];
            }
        }


        System.out.println(Arrays.deepToString(newImage));

        for(int i=0; i<newImage.length; i++){
            for(int j=0; j<newImage[i].length; j++){
                // Add the if-else statement here
                int difference = 0;
                difference  = newImage[i][j] - 50;
                if (difference < 0) {
                    newImage[i][j] = 0;
                } else {
                    newImage[i][j] = difference;
                }

            }
        }
        System.out.println(Arrays.deepToString(newImage));
    }
}

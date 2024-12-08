public class MainWhileChallenge {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int countTotal = 0;
        int countEven = 0;

        while (number <= finishNumber){
            number++;
            countTotal++;
            if (!isEvenNumber(number))
                continue;
            countEven++;
                System.out.println("Even number - " + number);
//            countTotal++;
        }

        System.out.println("Even count =" + countEven);
        System.out.println("The Count = " + countTotal);
    }

    public static boolean isEvenNumber(int number) {

//        if (number % 2 == 0){
//            return true;
//        }
//        return false;
        return number % 2 == 0;
    }

}

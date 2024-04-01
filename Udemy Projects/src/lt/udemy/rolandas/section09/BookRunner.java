package lt.udemy.rolandas.section09;

public class BookRunner {

    public static void main(String[] args) {


    Book artOfComputerPrograming = new Book();
    Book effectiveJava = new Book();
    Book cleanCode = new Book();

    artOfComputerPrograming.sold();
    effectiveJava.sold();
    cleanCode.sold();

    artOfComputerPrograming.setNumberOfCopies(100);
    effectiveJava.setNumberOfCopies(200);
    cleanCode.setNumberOfCopies(50);

//       System.out.println("Art of programing number of copies : " + artOfComputerPrograming.sold();)

//        artOfComputerPrograming.inNoCopies(50);
        artOfComputerPrograming.dcNoOfCopies(80);

        System.out.println("Art of programing number of copies : " +artOfComputerPrograming.getNumberOfCopies());
        System.out.println("Effective Java number of copies : " + effectiveJava.getNumberOfCopies());
        System.out.println("Clean code number of copies : " + cleanCode.getNumberOfCopies());


    }
}

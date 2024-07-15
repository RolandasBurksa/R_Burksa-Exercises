package section_09;

public class BookRunner {

    public static void main(String[] args) {

    Book artOfComputerPrograming = new Book(1000);
    Book effectiveJava = new Book(0);
    Book cleanCode = new Book(0);
        System.out.println(artOfComputerPrograming.getNumberOfCopies());

    artOfComputerPrograming.sold();
    effectiveJava.sold();
    cleanCode.sold();

    artOfComputerPrograming.setNumberOfCopies(100);
        System.out.println(artOfComputerPrograming.getNumberOfCopies());
    effectiveJava.setNumberOfCopies(200);
    cleanCode.setNumberOfCopies(50);

//       System.out.println("Art of programing number of copies : " + artOfComputerPrograming.sold();)

//        artOfComputerPrograming.inNoCopies(50);
        artOfComputerPrograming.dcNoOfCopies(80);

        effectiveJava.inNoCopies(20);

        System.out.println("Art of programing number of copies: " +artOfComputerPrograming.getNumberOfCopies());
        System.out.println("Effective Java number of copies: " + effectiveJava.getNumberOfCopies());
        System.out.println("Clean code number of copies: " + cleanCode.getNumberOfCopies());


    }
}

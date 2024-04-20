package lt.udemy.rolandas.section09;

public class Book {

    private int numberOfCopies;

    public Book(int numberOfCopies){
        this.numberOfCopies = numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies){
        if(numberOfCopies > 0)
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void inNoCopies(int howMuch){
        this.numberOfCopies = this.numberOfCopies + howMuch;
    }

    public void dcNoOfCopies(int howMuch){
       setNumberOfCopies(this.numberOfCopies - howMuch);
    }

    void sold(){
        System.out.println("The book is sold!");
    }
}

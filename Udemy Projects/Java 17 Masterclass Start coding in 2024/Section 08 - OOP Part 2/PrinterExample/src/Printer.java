public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
    }

    public int addToner(int tonerAmount){

//        int tempAmount = tonerAmount + tonerLevel;
//        if (tempAmount > 100 || tempAmount < 0){
//            return -1;
//        }
//        tonerLevel += tonerAmount;
//        return tonerLevel;

        if (tonerAmount <= 0 || tonerAmount > 100){
            return -1;
        }

        if (this.tonerLevel + tonerAmount > 100){
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages){

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

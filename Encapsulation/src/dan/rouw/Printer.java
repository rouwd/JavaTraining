package dan.rouw;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount <= 100) {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(isDuplex()) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public void fillToner() {
        this.tonerLevel = 100;
        System.out.println("Toner is now full!");
    }

    public void print(int pages) {
        if(isDuplex()) {
            System.out.println("Printing in duplex mode!");
        }
        for(var i = 0; i < pages; i++) {
            if(this.tonerLevel > 0) {
                this.tonerLevel--;
                this.pagesPrinted++;
            } else {
                System.out.println("Ran out of toner on page " + i);
                break;
            }
        }
        System.out.println("Total pages printed is now " + this.pagesPrinted);
        System.out.println("The current toner level is " + this.tonerLevel);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}

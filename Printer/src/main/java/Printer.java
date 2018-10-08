public class Printer {

    private String name;
    private int sheetsNumber;
    private int toner;
    private int maximumCapacity;

   public Printer(String name, int sheetsNumber, int toner, int maximumCapacity){
       this.name = name;
       this.sheetsNumber = sheetsNumber;
       this.toner = toner;
       this.maximumCapacity = maximumCapacity;
   }

    public String getName() {
        return this.name;
    }

    public int getSheetsNumber() {
        return this.sheetsNumber;
    }

    public int getToner() {
        return this.toner;
    }

    public void reduceToner(int number) {
        this.toner = this.toner - number;
    }

    public void reduceSheetsNumber(int number) {
        this.sheetsNumber = this.sheetsNumber - number;
    }

    public boolean hasEnoughPaper() {
        if (this.sheetsNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String print(int pages, int copies) {
        int number = pages * copies;
       if (hasEnoughPaper() == true) {
           reduceSheetsNumber(number);
           reduceToner(number);
       }
           return ("There is no paper!");
//           thereIsNoPaper();

    }

    public String thereIsNoPaper() {
        return ("There is no paper!");
        }

    public int getMaximumCapacity() {
        return this.maximumCapacity;
    }

    public void refill() {
        this.sheetsNumber = this.maximumCapacity;
    }

}

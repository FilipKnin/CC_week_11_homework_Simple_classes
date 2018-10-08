public class Printer {

    private String name;
    private int sheetsNumber;
    private int toner;

   public Printer(String name, int sheetsNumber, int toner){
       this.name = name;
       this.sheetsNumber = sheetsNumber;
       this.toner = toner;
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

    public void reduceToner() {
        this.toner = this.toner -1;
    }
}

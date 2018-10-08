public class Printer {

    private String name;
    private int sheetsNumber;

   public Printer(String name, int sheetsNumber){
       this.name = name;
       this.sheetsNumber = sheetsNumber;
   }

    public String getName() {
        return this.name;
    }

    public int getSheetsNumber() {
        return this.sheetsNumber;
    }
}

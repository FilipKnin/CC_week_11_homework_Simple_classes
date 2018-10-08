import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    Printer printer2;

    @Before
    public void before(){
        printer = new Printer("printer1", 100, 200, 250);
    }

    @Test
    public void hasName(){
        assertEquals("printer1", printer.getName());
    }

    @Test
    public void hasNumberOfSheetsPaperLeft(){
        assertEquals(100, printer.getSheetsNumber());
    }

    @Test
    public void hasToner(){
        assertEquals(200, printer.getToner());
    }

    @Test
    public void hasReduceTonerMethod(){
        printer.reduceToner(1);
        printer.reduceToner(1);
        assertEquals(198, printer.getToner());
    }

    @Test
    public void hasReduceSheetsNumberMethod(){
        printer.reduceSheetsNumber(1);
        printer.reduceSheetsNumber(1);
        assertEquals(98, printer.getSheetsNumber());
    }

    @Test
    public void hasEnoughPaperMethodReturnsFalse(){
        printer2 = new Printer("printer2", 0, 200, 250);
        assertEquals(false, printer2.hasEnoughPaper());
    }

    @Test
    public void hasEnoughPaperMethodReturnsTrue(){
        assertEquals(true, printer.hasEnoughPaper());
    }

    @Test
    public void hasPrintMethodEnoughPaper(){
        printer.print(2,2);
        assertEquals(96, printer.getSheetsNumber());
        assertEquals(196, printer.getToner());
    }

    @Test
    public void hasThereIsNoEnoughPaperMethod(){
        assertEquals("There is no paper!", printer.thereIsNoPaper());
    }

    @Test
    public void hasPrintMethodNotEnoughPaper() {
        assertEquals("There is no paper!", printer.print(10, 100));
    }

    @Test
    public void hasPaperMaximumCapacity() {
        assertEquals(250, printer.getMaximumCapacity());
    }

    @Test
    public void hasRefillMethod() {
        printer.refill();
        assertEquals(250, printer.getSheetsNumber());
    }



}

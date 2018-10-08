import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    Printer printer2;

    @Before
    public void before(){
        printer = new Printer("printer1", 100, 200);
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
        printer.reduceToner();
        printer.reduceToner();
        assertEquals(198, printer.getToner());
    }

    @Test
    public void hasReduceSheetsNumberMethod(){
        printer.reduceSheetsNumber();
        printer.reduceSheetsNumber();
        assertEquals(98, printer.getSheetsNumber());
    }

    @Test
    public void hasEnoughPaperMethodReturnsFalse(){
        printer2 = new Printer("printer2", 0, 200);
        assertEquals(false, printer2.hasEnoughPaper());
    }

    @Test
    public void hasEnoughPaperMethodReturnsTrue(){
        assertEquals(true, printer.hasEnoughPaper());
    }




}

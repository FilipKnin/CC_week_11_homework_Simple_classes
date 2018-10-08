import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer("printer1", 100);
    }

    @Test
    public void hasName(){
        assertEquals("printer1", printer.getName());
    }

    @Test
    public void hasNumberOfSheetsPaperLeft(){
        assertEquals(100, printer.getSheetsNumber());
    }



}

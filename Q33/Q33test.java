import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class Q33test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
private final PrintStream originalOut = System.out;
private final PrintStream originalErr = System.err;

@Before
public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
}

@After
public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
}



@Test
public void printsCorrectPattern() {
    String[] args = new String[1];
    args[0] = "5";
    
    String expected ="Enter Number of Rows: 1 2 3 4 5\n10 9 8 7 6\n11 12 13 14 15\n20 19 18 17 16\n21 22 23 24 25\r\n";
    
    Q33.main(args);

    assertEquals(expected, outContent.toString());
}   

@Test
public void emptyStringProvided(){
    String[] args = new String[1];
    args[0]="";
    
    assertThrows(NoSuchElementException.class,
    () -> {Q33.main(args);}
    );


}

@Test
public void nullArgs(){
    String[] args=null;

    assertThrows(IllegalArgumentException.class, 
    () -> {Q33.main(args);}
    );


}

@Test
public void nonIntegerProvided(){
    String[] args = new String[1];
    args[0]="1.5";
    assertThrows(InputMismatchException.class,
     () -> {Q33.main(args);}
    );


}



}

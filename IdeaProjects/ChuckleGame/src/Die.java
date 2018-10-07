/*
 public void roll () {value = chooser.nextInt(6) + 1; } Azeem
https://stackoverflow.com/questions/363681/how-to-generate-random-integers-within-a-specific-range-in-java/363692#363692
 */
import java.util.*;

public class Die {
    private int value;
    private Random chooser;
    public Die () {
        value = 1;
        chooser = new Random ();
    }
    public int getValue () {return value; }
    public void roll () {value = chooser.nextInt(6) + 1; }

    public void print() { System.out.println(value);}
}


import java.util.*;

public class Die {
    private int value;
    private random chooser;
    public dice () {
        value = 1;
        chooser = new random ();
    }
    public int getValue () {
        return value;
    }
    public voild roll () {
        value = chooser.nextInt(6) + 1;
    }

    publicvoidprint() {
        system.out.prtln(value);
    }
}

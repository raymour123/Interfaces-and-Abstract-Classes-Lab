import java.util.ArrayList;
import java.util.List;

/**
 * Created by raymour on 6/28/16.
 */
public class Main {
    public static void main(String[] args) {
        List<Remote> phones = new ArrayList<Remote>();
        phones.add(new Motorolla());
        phones.add(new Google());
        phones.add(new Nokia());

        for (Remote p : phones){
            p.powerButtonPressed();
            p.numberButtonPressed(47);
            p.channelDown();
            p.channelUp();
            p.volumeDown();
            p.volumeUp();
        }
    }
}

package item18;

import java.util.HashSet;
import java.util.List;

public class item18 {

    public static void main(String[] args) {
        List<String> list = List.of("Snap", "Crackle", "Pop");

        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();

        s.addAll(list);
        // Expecting 3, but get 6!
        IO.println(s.getAddCount());

        InstrumentedSet<String> s2 = new InstrumentedSet<String>(new HashSet<>());

        s2.addAll(list);

        // Expecting 3, and get 3!
        IO.println(s2.getAddCount());


        InstrumentedGoogleSet<String> s3 = new InstrumentedGoogleSet<String>(new HashSet<>());

        s3.addAll(list);

        // Expecting 3, and get 3!
        IO.println(s3.getAddCount());

    }
}


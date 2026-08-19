package item19;

import java.time.Instant;

public class Sub extends Super{
    private final Instant instant;

    public Sub() {
        instant = Instant.now();
    }

    @Override
    void overrideMe() {
        IO.println(instant);
    }
}

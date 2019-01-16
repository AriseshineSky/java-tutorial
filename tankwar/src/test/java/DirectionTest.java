import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DirectionTest {
    private final String[] objectTypes = {"tank", "missile"};

    @Test
    void get() {
        for (Direction d : Direction.values()) {
            for (String objType : objectTypes) {
                assertNotNull(d.get(objType));
            }
        }
    }
}
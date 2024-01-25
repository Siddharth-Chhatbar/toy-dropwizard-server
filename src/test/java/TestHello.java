import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {

    @Test
    public void testFoo() {
        int result = 5 + 5 * 3;
        assertEquals(result, 20);
    }

}
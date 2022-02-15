import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise03Test {

    @Test
    void hasAllVowelsTest() {
        assertEquals(true, Exercise03.hasAllVowels("abecidofu"));
        assertEquals(false, Exercise03.hasAllVowels(null));
        assertEquals(false, Exercise03.hasAllVowels(""));
        assertEquals(false, Exercise03.hasAllVowels("abode"));
    }
}
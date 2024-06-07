package org.kfc;

import org.junit.jupiter.api.Test;
import org.kfc.affirmation.Verité;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeritéTest {
    @Test
    void test_getAffirmationStatus() {
        String affirmation = "il va bien" ;
        Verité verite = new Verité(affirmation);
        assertEquals("vrai", verite.getAffirmationStatus());
    }
}

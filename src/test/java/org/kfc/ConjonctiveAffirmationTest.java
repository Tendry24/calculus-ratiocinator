package org.kfc;

import org.junit.jupiter.api.Test;
import org.kfc.affirmation.Affirmation;
import org.kfc.affirmation.Mensonge;
import org.kfc.affirmation.Verité;
import org.kfc.conjonctiveAffirmation.ConjonctiveAffirmation;
import org.kfc.conjonctiveAffirmation.Donc;
import org.kfc.conjonctiveAffirmation.Et;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjonctiveAffirmationTest {
    @Test
    void lou_est_pauvre_et_lou_est_genereux() {

        Affirmation louEstPauvre = new Mensonge("Lou est pauvre");
        Affirmation louEstGenereux = new Verité("Lou est généreux");

        ConjonctiveAffirmation et = new Et(louEstPauvre, louEstGenereux);

        String resultatAttendu = "faux";
        assertEquals(resultatAttendu, et.getStatus(louEstPauvre, louEstGenereux));
    }

    void lou_est_beau_donc_lou_est_pauvre(){
        Affirmation louEstBeau = new Verité("Lou est beau");
        Affirmation louEstPauvre = new Mensonge("Lou est pauvre");

        ConjonctiveAffirmation donc = new Donc(louEstBeau,louEstPauvre);

        String resultatAttendu = "jenesaispas";
        assertEquals(resultatAttendu, donc.getStatus(louEstBeau,louEstPauvre));
    }
}



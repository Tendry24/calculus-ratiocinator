package org.kfc.conjonctiveAffirmation;

import org.kfc.affirmation.Affirmation;

public final class Ou extends ConjonctiveAffirmation {
    public Ou(Affirmation affirmationpremier, Affirmation affirmationdeuxieme) {
        super(affirmationpremier, affirmationdeuxieme);
    }

    @Override
    public String getStatus(Affirmation affirmation1, Affirmation affirmation2) {
        if(affirmation1.getStatus().equals("faux") && affirmation2.getStatus().equals("faux")) {
            return "faux";
        } else if (affirmation1.getStatus().equals("vrai") && affirmation2.getStatus().equals("faux")) {
            return "faux";
        }else if (affirmation1.getStatus().equals("faux") && affirmation2.getStatus().equals("vrai")) {
            return "faux";
        } else {
            return "vrai";
        }
    }
}

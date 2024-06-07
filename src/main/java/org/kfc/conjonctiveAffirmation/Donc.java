package org.kfc.conjonctiveAffirmation;

import org.kfc.affirmation.Affirmation;

public final class Donc extends ConjonctiveAffirmation {
    public Donc(Affirmation affirmation1,Affirmation affirmation2) {
        super(affirmation1,affirmation2);
    }
    @Override
    public String getStatus(Affirmation affirmation1, Affirmation affirmation2) {
        if (affirmation1.getStatus().equals("vrai") && affirmation2.getStatus().equals("jenesaispas")){
            return "vrai";
        } else if (affirmation1.getStatus().equals("jenesaispas") && affirmation2.getStatus().equals("vrai")) {
            return "jenesaispas";
        }else return "jenesaispas";
    }
}

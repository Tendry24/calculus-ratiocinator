package org.kfc.affirmation;

public final class Mensonge extends Affirmation {
    public Mensonge(String affirmation) {
        super(affirmation);
    }

    @Override
    public String getAffirmationStatus() {
        return "faux";
    }

    @Override
    public String getStatus() {
        return "faux";
    }
}

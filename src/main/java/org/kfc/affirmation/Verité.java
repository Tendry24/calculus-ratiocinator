package org.kfc.affirmation;

import lombok.Getter;

@Getter
public final class Verité extends Affirmation {
    public Verité(String affirmation) {
        super(affirmation);
    }

    @Override
    public String getAffirmationStatus() {
        return "vrai";
    }
}

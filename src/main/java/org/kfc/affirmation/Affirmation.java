package org.kfc.affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public sealed  class Affirmation permits  Verité, Mensonge {
    protected final String affirmation;
    protected final String status;

    public Affirmation(String affirmation) {
        this.affirmation = affirmation;
        this.status = "jenesaispas";
    }

    public String getAffirmationStatus() {
        return null;
    }

    public String getStatus(String affirmation){
        return this.getStatus();
    }
}

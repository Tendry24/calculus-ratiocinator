package org.kfc.conjonctiveAffirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.kfc.affirmation.Affirmation;

@Getter
@AllArgsConstructor
public sealed abstract class ConjonctiveAffirmation permits Et,Ou,Donc {
    protected Affirmation affirmationpremier;
    protected Affirmation affirmationdeuxieme;

    public abstract String getStatus(Affirmation affirmation1, Affirmation affirmation2);
}

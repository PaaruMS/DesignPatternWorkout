package org.patterns.abstractFact;

public class Airtel extends Sim{
    @Override
    int packageRate(int cardGB) {
        if(cardGB==2){
            return cardGB*100;
        } else if (cardGB==4) {
            return cardGB*100;
        } else if (cardGB==6) {
            return cardGB*100;
        }else {
            return cardGB*100;
        }

    }


}

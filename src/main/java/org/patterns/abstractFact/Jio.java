package org.patterns.abstractFact;

public class Jio extends Sim{
    @Override
    int packageRate(int cardGB) {
        int serviceCharge=50;
        if(cardGB==2){
            return cardGB*100+serviceCharge;
        } else if (cardGB==4) {
            return cardGB*100+serviceCharge;
        } else if (cardGB==6) {
            return cardGB*100+serviceCharge;
        }else {
            return cardGB*100+serviceCharge;
        }
    }
}

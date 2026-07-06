package com.exemplo;

class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }
    
    Money times(int multiplier) {  // ← Agora retorna Money
        return new Franc(amount * multiplier);
    }
}
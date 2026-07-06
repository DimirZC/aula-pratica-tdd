package com.exemplo;

class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
    }
    
    Money times(int multiplier) {  // ← Agora retorna Money
        return new Dollar(amount * multiplier);
    }
}
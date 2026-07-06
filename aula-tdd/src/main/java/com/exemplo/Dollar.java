package com.exemplo;

class Dollar {
    private int amount;  // ← Agora é private
    
    Dollar(int amount) {
        this.amount = amount;
    }
    
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
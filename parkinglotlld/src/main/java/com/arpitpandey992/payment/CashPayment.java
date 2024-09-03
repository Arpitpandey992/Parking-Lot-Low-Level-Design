package com.arpitpandey992.payment;

public class CashPayment implements PaymentSystem {

    @Override
    public boolean pay(double amount) {
        // payment is recorded physically, no logic is involved
        return true;
    }

}

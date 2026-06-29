package com.bank.acc;

public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    public float calculateAmountDeposited() {
        return principal * tenure * 12;
    }

    @Override
    public float calculateInterest() {

        float totalInterest = 0;
        float r = rateOfInterest / 100;
        float n = 4;

        int months = tenure * 12;

        for (int i = 0; i < months; i++) {

            float t = (months - i) / 12.0f;

            totalInterest += (float) (principal *
                    (Math.pow((1 + r / n), (n * t)) - 1));
        }

        return totalInterest;
    }
}
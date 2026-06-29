package com.bank.exception;

public class BankValidationException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Invalid Data";
    }
}
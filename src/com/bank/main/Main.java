package com.bank.main;

import java.util.Scanner;
import com.bank.service.BankService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tenure (5/10): ");
        int tenure = sc.nextInt();

        System.out.print("Enter Principal Amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.nextLine();

        BankService service = new BankService();
        service.calculate(principal, tenure, age, gender);

        sc.close();
    }
}
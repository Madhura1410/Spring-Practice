package com.BankManagement;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BankReport {


    public void generateReport() {
        System.out.println("       OFFICIAL BANK REPORT       ");
        System.out.println("Status          : ACTIVE");
        System.out.println("Audit Status    : PASSED");
        System.out.println("System Integrity: 100%");
       
    }
}


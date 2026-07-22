package com.BankManagement;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("infrastructure")
public class Server {

   @PostConstruct
    public void initializeBank() {
        System.out.println("💻 Starting the Bank Server...");
        System.out.println("🔑 Verifying Security Certificates...");
        System.out.println("🗄️ Connecting to the Database...");
        System.out.println("🌐 Establishing Network Connection...");
        System.out.println("✅ Bank is Ready!");
      
    }
}

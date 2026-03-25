# Lab Assignment 5 — SOLID Principles
## UML 
<img width="640" height="640" alt="image" src="https://github.com/user-attachments/assets/37b79894-047e-4e25-b243-691afb07c064" />

## Problem Description

The original code has a single `Order` interface that bundles **four unrelated responsibilities** into one contract:

```java
public interface Order {
    void calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
    void generateInvoice(String fileName);
    void sendEmailNotification(String email);
}

# Project Stucture
Lab Assignment 5 SOLID Principles/
├── README.md
├── uml_class_diagram.png
├── src/
│   ├── OrderCalculation.java        ← Interface (ISP)
│   ├── OrderPlacement.java          ← Interface (ISP)
│   ├── InvoiceGenerator.java        ← Interface (ISP)
│   ├── EmailNotification.java       ← Interface (ISP)
│   ├── OrderCalculationImpl.java    ← Implementation (SRP)
│   ├── OrderPlacementImpl.java      ← Implementation (SRP)
│   ├── InvoiceGeneratorImpl.java    ← Implementation (SRP)
│   ├── EmailNotificationImpl.java   ← Implementation (SRP)
│   ├── OrderService.java            ← Orchestrator (DIP)
│   └── OrderTest.java               ← Test / Demo

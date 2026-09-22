# Assignment 2: Creational Patterns (Factory Method & Abstract Factory)

**Domain:** Coffee Kiosk  
**Language/Platform:** Java  

---

## 1. Overview of the Project

This project refactors and demonstrates the implementation of two creational design patterns: **Factory Method** and **Abstract Factory**, using a **Coffee Kiosk** domain. 

The primary goal is to eliminate direct client-code dependencies on concrete classes (avoiding hard-coded `new ConcreteClass()`) and to eliminate growing `if-else` / `switch` statements during object instantiation.

---

## 2. Repository Structure

```text
src/
├── factory/
│   ├── brewer/
│   │   ├── CappuccinoBrewer.java
│   │   ├── CoffeeBrewer.java
│   │   ├── EspressoBrewer.java
│   │   └── LatteBrewer.java
│   └── servingset/
│       ├── EcoServingSetFactory.java
│       ├── OrdinaryServingSetFactory.java
│       └── ServingSetFactory.java
├── model/
│   ├── coffee/
│   │   ├── AbstractCoffee.java
│   │   ├── Cappuccino.java
│   │   ├── Espresso.java
│   │   └── Latte.java
│   └── servingset/
│       ├── Cup.java
│       ├── EcoCup.java
│       ├── EcoLid.java
│       ├── EcoReceipt.java
│       ├── Lid.java
│       ├── OrdinaryCup.java
│       ├── OrdinaryLid.java
│       ├── OrdinaryReceipt.java
│       └── Receipt.java
└── Main.java
package com.deloitte.lab4.ex1;

class Person {
    private String name;
    private float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}

class Account {
    private static long accCount = 1000;
    private long accNum;
    private double balance;
    private Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = accCount++;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw, minimum balance required: " + MIN_BALANCE);
        }
    }
}

class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 1000;

    public CurrentAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + OVERDRAFT_LIMIT >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class Lab4Ex1 {
    public static void main(String[] args) {
        Person smithPerson = new Person("Smith", 30);
        Person kathyPerson = new Person("Kathy", 28);

        Account smith = new SavingsAccount(smithPerson, 2000);
        Account kathy = new CurrentAccount(kathyPerson, 3000);

        smith.deposit(2000);
        kathy.withdraw(2000);

        System.out.println("Smith's account balance: " + smith.getBalance());
        System.out.println("Kathy's account balance: " + kathy.getBalance());
    }
}
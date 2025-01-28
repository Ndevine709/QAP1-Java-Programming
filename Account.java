// QAP1 - Advanced programming (Java)
// Author - Noah Devine
// Due Date - January 30th

public class Account {
// Attributes
private String id;
private String name;
private int balance;

// Constructors
public Account(String id, String name) {
    this.id = id;
    this.name = name;
}

public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
}

// Methods
// Returns the ID
public String getID() {
    return this.id;
}
// Returns the name
public String getName() {
    return this.name;
}
// Returns the balance
public int getBalance() {
    return this.balance;
}
// Add amount to the balanceand return it
public int credit(int amount) {
    return this.balance + amount;
}
// If the amount <= balance, subtract amount from the balance and return it
public int debit(int amount) {
    if (amount <= balance) {
        this.balance = balance - amount;
    } else {
        System.out.println("Amount exceeded balance");
    }
    return balance;
}
// Transfer amount to given account
public int transferTo(Account another,int amount) {
    if (amount <= balance) {
        this.balance -= amount;
        another.balance += amount;
        return this.balance;
    } else {
        System.out.println("Amount exceeded balance");
        return this.balance;
    }
}
// toString method
public String toString() {
    return("Account = " + this.id + " " + this.name + " " + this.balance);
}
    
}
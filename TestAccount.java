// QAP1 - Advanced programming (Java)
// Author - Noah Devine
// Due Date - January 30th

public class TestAccount {
    public static void main(String[] args) {
      // Creating two accounts
      Account Acc1 = new Account("1", "Account 1", 5000);
      Account Acc2 = new Account("2", "Account 2", 4000);

      // Printing the balance of Acc1 and Acc2
      System.out.println("Acc1 balance: " + Acc1.getBalance() + "," + " " + "Acc2 balance: " + Acc2.getBalance());

      // Transfer $1000 from Acc1 to Acc2
      Acc1.transferTo(Acc2, 1000);
      
      // Display both balances again to show changes
      System.out.println("Acc1 balance: " + Acc1.getBalance() + "," + " " + "Acc2 balance: " + Acc2.getBalance());
    }
}

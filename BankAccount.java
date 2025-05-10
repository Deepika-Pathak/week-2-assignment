// Bank Account System Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. Create a constructor to initialize them. Create methods deposit(amount) and withdraw(amount) which modify the balance. Show messages if withdrawal amount exceeds balance.

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("Remaining balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Withdrawal exceeds balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "123456789", 1000.00);
        account1.showAccountDetails();
        account1.deposit(500.00);  
        account1.withdraw(200.00); 
        account1.withdraw(2000.00); 
    }
}

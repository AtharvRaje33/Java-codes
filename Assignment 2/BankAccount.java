public class BankAccount {
long accountNumber;
String name;
int balance;

static int totalAccounts;

public BankAccount() {
totalAccounts++;
this.accountNumber = 0;
this.name = "";
this.balance = 0;
}


public BankAccount(long accountNumber, String name, int
balance) {

totalAccounts++;
this.accountNumber = accountNumber;
this.balance = balance;
this.name = name;
}

public long getAccountNumber() {
return accountNumber;
}
public void setAccountNumber(long accountNumber) {
this.accountNumber = accountNumber;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getBalance() {
return balance;
}
public void setBalance(int balance) {
this.balance = balance;
}
public static int getTotalAccounts() {
return totalAccounts;
}

public void depositMoney(int amount) {
if(amount < 0) {
System.out.println("Invalid deposit amount.");
} else {
System.out.println("Rs." + amount + "deposited.");

this.setBalance(this.balance + amount);
System.out.println("New balance: Rs." +

this.getBalance());

}
}

public void withdrawMoney(int amount) {
if(amount < 0) {
System.out.println("Invalid withdraw amount.");
} else if(amount > this.balance) {
System.out.println("Insufficient balance.");
System.out.println("Remaining balance: " +

this.getBalance());
} else {
this.setBalance(this.balance - amount);


System.out.println("Rs." + amount + "withdrawn.");

System.out.println("Remaining balance: " +

this.getBalance());

}
}

public static void main(String[] args) {

BankAccount b1 = new BankAccount();
BankAccount b2 = new BankAccount();
BankAccount b3 = new BankAccount(123_456_789,

"Murphy", 10_000);

b1.setAccountNumber(123_444_555);
b1.setBalance(1000);
b1.setName("James");

b2.setAccountNumber(111_777_3338);
b2.setBalance(10000);
b2.setName("jason");

System.out.println(b1.getName() + "'s Bank Account Details:");


System.out.println("Account Number: " +

b1.getAccountNumber());

System.out.println("Balance: " + b1.getBalance() +"\n");

System.out.println(b2.getName() + "'s Bank AccountDetails:");

System.out.println("Account Number: " +

b2.getAccountNumber());

System.out.println("Balance: " + b2.getBalance() +

"\n");

System.out.println(b3.getName() + "'s Bank Account Details:");

System.out.println("Account Number: " +

b3.getAccountNumber());

System.out.println("Balance: " + b3.getBalance() +

"\n");

System.out.println("Total Number of Accounts: " +

BankAccount.getTotalAccounts());
}
}
class Account {

    private String accountNumber;
    private double balance;
    private String Name;

    public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getAccountNumber() {
	        return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
        return balance;
    }
	
    Account(String accountNumber, String Name) {
        this.accountNumber = accountNumber;
        this.Name = Name;
    }

    Account(String accountNumber, String Name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited Amount : " + amount + "/- New balance: " + balance +"/-");
        } else {
            System.out.println("Invalid credit amount...");
        }
    }

    public void debit(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Debited Amount : " + amount + "/- New balance: " + balance+"/-");
            } else {
                System.out.println("Amount exceeded. Your Current balance: " + balance+"/-");
            }
        } 
    }

    public void transferTo(Account anotherAccount, double amount) {
        if (anotherAccount != null) {
            if (amount > 0) {
                if (balance >= amount) {
                    balance -= amount;
                    anotherAccount.credit(amount);
                    System.out.println("Transferred Amount : " + amount +"/-"+ " to account: " + anotherAccount.getAccountNumber());
                } else {
                    System.out.println("Amount excceded. Your Current balance: " + balance);
                }
            } else {
                System.out.println("Invalid transfer amount.");
            }
        } else {
            System.out.println("Invalid account.");
        }
    }
    
    public String toString() {
		return "Account [ID = " + accountNumber + " , Name =" +Name+ ",Balance = " +balance +"]";
	}
}

public class AccountClass {
	public static void main(String[] args) {

        Account account1 = new Account("87654321234","Deepika", 10000.0);
        System.out.println(account1);
        Account account2 = new Account("98765432123","Priyanka", 500.0);
        Account account3 = new Account("54321234567", "Deepika Naik", 2000.);
        
        account1.credit(200);
        account1.debit(150);
        account1.transferTo(account2, 300);

        System.out.println("Balance of account1: " + account1.getBalance()+"/-");
        System.out.println("Balance of account2: " + account2.getBalance()+"/-");

	}
}
public class Bank {
    private int accountNo;
//    private String custName;
    private float balance;

    public Bank() {
        accountNo = 123;
//        custName = "Vishal";
        balance = 10000F;
    }

    public Bank(int accNo, float bal) {
        this.accountNo = accNo;
//        this.custName = custName;
        this.balance = bal;
    }

    public void display() {
        System.out.println("Account number is" + " " + accountNo);
//        System.out.println("Customer name" + " " + custName);
        System.out.println("Balance is" + " " + balance);
        System.out.println("----------------------------");
    }

    public synchronized boolean deposit(float amount) {
        if (amount <= 0) {
            return false;
        }
        else{
            balance = balance + amount;
            return true;
        }
    }

    public synchronized float withdraw(float amount) {
        if(amount > balance || amount <= 0) {
            System.out.println("Not enough balance");
            return 0F;
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawn amount: "+amount);
            System.out.println("Updated balance is: "+balance);
            return amount;
        }
    }
}

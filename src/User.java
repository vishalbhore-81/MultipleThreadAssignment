public class User implements Runnable{
    private String name;
    private int id;
    private Bank bankAccountId;

    public User(String name, int id, Bank bankAccountId) {
        this.name = name;
        this.id = id;
        this.bankAccountId = bankAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bank getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Bank bankAccountId) {
        this.bankAccountId = bankAccountId;
    }
    public void display(){
        System.out.println("Account holder : "+name);
        System.out.println("Account id : "+bankAccountId);
    }
    @Override
    public void run() {
//        this.display();

//        this.bankAccountId.deposit(0);
        this.bankAccountId.withdraw(10000);

        this.bankAccountId.display();

    }
}

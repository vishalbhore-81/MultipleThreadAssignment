public class Main {
    public static void main(String[] args) {
        Bank b1=new Bank(123,10000);

        User u1=new User("ABC",11,b1);
        User u2=new User("XCV",12,b1);

        Thread t1=new Thread(u1);
        Thread t2=new Thread(u2);

        t1.start();
        t2.start();
        
    }
}
package oop_lab08_exercise1;

public class Debit extends Account implements iDebit {

    public Debit(String eponymia, double balance, double poso_kinisis) {
        super(eponymia, balance, poso_kinisis);
    }

    @Override
    public void debit(String name, double balance, double poso) {
        setBalance(balance - poso);
        System.out.println("New Balance for " + name + ": " + getBalance() + "\n");
    }
}

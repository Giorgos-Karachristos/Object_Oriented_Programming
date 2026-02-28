package oop_lab08_exercise1;

public class Metafora extends Account implements iMetafora {

    public Metafora(String eponymia, double balance, double poso_kinisis) {
        super(eponymia, balance, poso_kinisis);
    }

    @Override
    public void metafora(String name, double balance, double poso) {
        setBalance(balance - poso);
        System.out.println("New Balance for " + name + ": " + getBalance() + "\n");
    }
}

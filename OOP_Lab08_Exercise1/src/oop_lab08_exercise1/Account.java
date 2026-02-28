package oop_lab08_exercise1;

public class Account {

    private String eponymia;
    private double balance;
    private double poso_kinisis;

    public Account() {
    }

    public Account(String eponymia, double balance, double poso_kinisis) {
        this.eponymia = eponymia;
        this.balance = balance;
        this.poso_kinisis = poso_kinisis;
    }

    public String getEponymia() {
        return eponymia;
    }

    public void setEponymia(String eponymia) {
        this.eponymia = eponymia;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPoso_kinisis() {
        return poso_kinisis;
    }

    public void setPoso_kinisis(double poso_kinisis) {
        this.poso_kinisis = poso_kinisis;
    }

    @Override
    public String toString() {
        return "Account name: " + eponymia
                + "\nBalance: " + balance
                + "\nTransaction amount: " + poso_kinisis;
    }
}

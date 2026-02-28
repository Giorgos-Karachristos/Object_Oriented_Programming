package oop_lab08_exercise1;

public class AccountTest {

    /*The program handles account transactions: deposit (credit), withdrawal (debit), and transfer*/
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new Credit("Rockstar", 23, 15);
        accounts[1] = new Debit("Jumbo", 67, 45);
        accounts[2] = new Metafora("OTE", 58, 32);

        for (Account account : accounts) {
            System.out.println(account);
            if (account instanceof Credit) {
                Credit credit = (Credit) account;
                credit.credit(account.getEponymia(), account.getBalance(), account.getPoso_kinisis());
            } else if (account instanceof Debit) {
                Debit debit = (Debit) account;
                debit.debit(account.getEponymia(), account.getBalance(), account.getPoso_kinisis());
            } else if (account instanceof Metafora) {
                Metafora metafora = (Metafora) account;
                metafora.metafora(account.getEponymia(), account.getBalance(), account.getPoso_kinisis());
            }
        }
    }
}

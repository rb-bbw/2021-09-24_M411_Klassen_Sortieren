package ch.bbw;

import java.util.Comparator;

class SortByBalanceDescending implements Comparator<Account> {
    public int compare(Account a, Account b) {
        return (b.getBalance().compareTo(a.getBalance()));
    }
    /*public int compare(Account a, Account b) {
        return (a.getBalance() > b.getBalance() ? -1 : (a.getBalance() < b.getBalance() ? 1 : 0));
    }*/
}

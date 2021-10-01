package ch.bbw;

import java.util.Comparator;

class SortByBalanceAscending implements Comparator<Account> {
    public int compare(Account a, Account b) {
        return (a.getBalance().compareTo(b.getBalance()));
    }
    /*public int compare(Account a, Account b) {
        return (a.getBalance() > b.getBalance() ? 1 : (a.getBalance() < b.getBalance() ? -1 : 0));
    }*/
}

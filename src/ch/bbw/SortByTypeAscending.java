package ch.bbw;

import java.util.Comparator;

class SortByTypeAscending implements Comparator<Account> {
    public int compare(Account a, Account b) {
        return (a.getType().compareTo(b.getType()));
    }
}

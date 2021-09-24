package ch.bbw;

public class Account {
    private long id;
    private long balance;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Account(long id, long balance){
        this.id = id;
        this.balance = balance;
    }
}

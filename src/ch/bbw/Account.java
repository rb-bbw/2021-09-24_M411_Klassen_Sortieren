package ch.bbw;

public class Account {
    private Long id;
    private Long balance;

    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Long getBalance() {
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

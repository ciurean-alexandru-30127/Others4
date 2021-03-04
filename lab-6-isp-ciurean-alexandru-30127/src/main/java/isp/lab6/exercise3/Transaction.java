package isp.lab6.exercise3;

public abstract class Transaction {
    protected Account account;

    public Transaction(Account account) {

        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Transaction() {

    }

    public abstract String execute();

    @Override
    public String toString() {
        return "Transaction{" +
                "account=" + account +
                '}';
    }
}

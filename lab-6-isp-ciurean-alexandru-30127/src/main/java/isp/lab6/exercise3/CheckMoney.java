package isp.lab6.exercise3;

public class CheckMoney extends Transaction {
    public CheckMoney(Account account) {
        super(account);
    }

    @Override
    public String execute() {
        return this.account.getBalance() + "";
    }
}

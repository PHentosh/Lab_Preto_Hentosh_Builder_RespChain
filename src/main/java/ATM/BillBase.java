package ATM;

public class BillBase implements Bill{
    protected Bill next;
    private int billAmount;


    public BillBase(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill bill) {
        next = bill;
    }

    @Override
    public void process(int amount) {
        if (next != null){
            next.process(amount % billAmount);
        } else if (amount % billAmount != 0){
            throw new IllegalArgumentException();
        }
        System.out.println("Recive your " + amount / billAmount + " of " + billAmount + " UAH");
    }
}

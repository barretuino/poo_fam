package pjReflection;

public class Bank  {

    private int code;
    private String nameOfBank;
    private double amountOfDepositedMoney;
    private int totalOfCustomers;

    public Bank(){}

    public Bank(int code, String nameOfBank, double amountOfDepositedMoney, int totalOfCustomers){
        this.code = code;
        this.nameOfBank = nameOfBank;
        this.amountOfDepositedMoney = amountOfDepositedMoney;
        this.totalOfCustomers = totalOfCustomers;
    }

    public String doDeposit(double amount){
        return amount + " of money has been deposited";
    }

    public String doWithDraw(Double amount){
        return amount + "of money has withdrawn";
    }

    public String getReceipt(String account){
        return "The" + account + " has no funds!";
    }

    //getters ans setters..

    @Override
    public String toString() {
        return "Bank{" +
                "code=" + code +
                ", nameOfBank='" + nameOfBank + '\'' +
                ", amountOfDepositedMoney=" + amountOfDepositedMoney +
                ", totalOfCustomers=" + totalOfCustomers +
                '}';
    }
}
package Solid.Bank;

public abstract class DepositMoney {
    int amount_deposited;

    abstract void deposit(int amount);
}


class DepositInCash extends DepositMoney{


    @Override
    void deposit(int amount) {
       this.amount_deposited = amount;
        System.out.println("Amount deposited by cash: " + amount_deposited);
    }
}

class DepositByCheque extends DepositMoney{

    private String signature = "Nitesh Agarwala";

    public void isMatch(String sign, int amount){
        if(this.signature.equals(sign))
            deposit(amount);
        else
            System.out.println("Incorrect Signature!");
    }


    @Override
    void deposit(int amount) {
         this.amount_deposited = amount;
        System.out.println("Your amount  deposited by cheque is: " + amount_deposited);
    }
}
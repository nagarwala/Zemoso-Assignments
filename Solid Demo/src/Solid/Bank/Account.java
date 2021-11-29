package Solid.Bank;

public class Account {
    double balance;
    double interestRate;
}

class WithdrawalAccount extends Account{

    double findCurrentBalance(int periodInMonths){

        double interestReceived = (balance * periodInMonths * interestRate)/1200;
        return (balance+interestReceived);
    }
}

class FixedAccount extends Account{


    double finalAmountToBeReceived(int lockInPeriod)
    {
        double interestGain = balance * lockInPeriod * interestRate/100;
        return (balance+interestGain);
    }
}

class SavingsAccount extends WithdrawalAccount {

    void returnDetails(){
        System.out.println("The current account balance is:" + findCurrentBalance(4));
    }
}

class FixedDeposit extends FixedAccount {

    void returnMaturityAmount(){
        System.out.println("The maturity amount to be received:" + finalAmountToBeReceived(3));
    }
}

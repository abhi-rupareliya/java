/*   ID   : 21ce117
     Name : Abhi Rupareliya
     Aim  : According to question no 1, the Account class was defined to model a bank account. 
            An account has the properties account number, balance, annual interest rate, and date 
            created, and methods to deposit and withdraw funds. Create two subclasses for 
            checking and saving accounts. A checking account has an overdraft limit, but a 
            savings account cannot be overdrawn.
*/
public class SavingAccount extends Account{

    @Override
    public void withdraw(double amt) {
        if(amt>getBalance()){
            System.out.println("Not enough balance to withdraw.");
        }
        else{
            super.withdraw(amt);
        }
    }
 
}
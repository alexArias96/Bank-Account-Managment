public class Withdrawal {

    //Method to obtain the withdrawal by subtracting it from the current amount
    public void getWithdrawal(Double amountWithdraw){
        Account account = new Account();

        if (amountWithdraw > 0 && amountWithdraw < account.getAmount()){

            Double result = account.getAmount() - amountWithdraw;

            account.setAmount(result);
        }

    }

}

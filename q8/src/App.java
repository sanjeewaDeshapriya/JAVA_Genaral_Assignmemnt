class SavingsAccount{
    private float balanace;
    static private float annualInterestRate;

    public SavingsAccount(float bal){
        balanace=bal;
        System.out.println("Account is creted and your account balance is $" +balanace);
        
    }

    public void Deposite(float x ){
        this.balanace=balanace+x;
        System.out.println("Succsesfully deposite " +x+"and the total balance of account is " + balanace);

    }
    public float calculateMonthlyInterest(){
        float MonthlyInterest;
        MonthlyInterest=annualInterestRate*balanace/12/100;
        System.out.println("Monthly interest of your balance is $" +MonthlyInterest);
        return MonthlyInterest;

    }
    static public void modifyInterestRate(float interest){
        annualInterestRate=interest;
        System.out.println("Update annual interest rate to " + interest + "%");
        //inisilizing value to interest rate 
        


    }

}
public class App {
    public static void main(String[] args) throws Exception {
        SavingsAccount acc01= new SavingsAccount(2000);
        SavingsAccount acc02= new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);

        acc01.calculateMonthlyInterest();
        acc02.calculateMonthlyInterest();

        SavingsAccount.modifyInterestRate(5);

        acc01.calculateMonthlyInterest();
        acc02.calculateMonthlyInterest();





    }
}

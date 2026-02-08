
package bankacounts;

import bankacounts.Account.AccountStatus1;


public class BankAcounts {

  
    public static void main(String[] args) {
       
        AccountStatus1 s =new AccountStatus1();
        s.setDeposit(1000);
        s.deposit();
        System.out.println("Ballance: "+s.getBlance());
       
      
       
       
       
       
       
    }
    
}

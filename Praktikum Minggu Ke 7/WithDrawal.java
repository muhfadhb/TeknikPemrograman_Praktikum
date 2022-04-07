/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author Muhammad Fadhil
 */
public class WithDrawal extends Transaction{
   private Keypad keypad; // reference to keypad
   boolean lanjutWithdraw = true; // boolean sebagai status apakah proses withdrawal masih berlanjut atau tidak
   private double jumlahWithdraw; // amount withdrawal
   
   public WithDrawal(int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase, Keypad atmKeypad
    ){
        super(userAccountNumber, atmScreen, atmBankDatabase);
        keypad = atmKeypad;
    }

    @Override
    public void execute() {
              
            while (lanjutWithdraw){
                int withdrawalMenuSelection = displayWithdrawalMenu();
                switch (withdrawalMenuSelection){
                    case 1 : jumlahWithdraw = 20;getScreen().displayMessageLine("\nYour cash has been dispensed. Please take your cash now.");lanjutWithdraw = false;break;
                    case 2 : jumlahWithdraw = 40;getScreen().displayMessageLine("\nYour cash has been dispensed. Please take your cash now.");lanjutWithdraw = false;break;
                    case 3 : jumlahWithdraw = 60;getScreen().displayMessageLine("\nYour cash has been dispensed. Please take your cash now.");lanjutWithdraw = false;break;
                    case 4 : jumlahWithdraw = 100;getScreen().displayMessageLine("\nYour cash has been dispensed. Please take your cash now.");lanjutWithdraw = false;break;
                    case 5 : jumlahWithdraw = 200;getScreen().displayMessageLine("\nYour cash has been dispensed. Please take your cash now.");lanjutWithdraw = false;break;
                    case 6 : getScreen().displayMessageLine("\nCanceling transaction...");lanjutWithdraw = false;break;
                    default : getScreen().displayMessageLine ("\n Input Salah!");break;
                }
            }
            getBankDatabase().debit(getAccountNumber(), jumlahWithdraw); 
    }
    
   private int displayWithdrawalMenu (){
      getScreen().displayMessageLine("\nWithdrawal Menu: ");
      getScreen().displayMessageLine("1 - $20");
      getScreen().displayMessageLine("2 - $40");
      getScreen().displayMessageLine("3 - $60");
      getScreen().displayMessageLine("4 - $100");
      getScreen().displayMessageLine("5 - $200");
      getScreen().displayMessageLine("6 - Cancel transaction\n");
      getScreen().displayMessage("Choose a withdrawal amount: ");
      return keypad.getInput();
   }
    
}

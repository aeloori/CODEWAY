import java.util.Scanner;

public class AtmInterface {


    public static void atmStartUP(){
        int card;
        int pin;

        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, Welcome  to my atm \n\n Please choose an option to begin the transaction"); //asking whether the transaction is for deposti or withdrawl
        System.out.println("\n Enter ' 1 ' for deposit money");
        System.out.println("\n Enter ' 2 ' for withdraw money");
        System.out.println("\n Enter ' 3 ' for Balance check");
        int option =sc.nextInt();
        
        //checking the user input option and giving the results for the specific task by calling method
        if(option==1){
            System.out.println("\nYou have selected option for deposit money to your account\n");
            System.out.println("\n Enter your card number to begin\n");
            card=sc.nextInt();
            System.out.println("\n Enter your card pin\n");
            pin=sc.nextInt();
            deposit(card,pin); //? Calling withdraw method
            
        }

        else if(option==2){
            System.out.println("\nYou have selected option for withdrawing money from your account");
            System.out.println("\n Enter your card number to begin\n");
            card=sc.nextInt();
            System.out.println("\n Enter your card pin\n");
            pin=sc.nextInt();
            withdraw(card,pin); //? calling withdraw method 
        }

        else if(option==3){
            System.out.println("\nYou have selected option for Check Balance of your account");
            System.out.println("\n Enter your card number to begin\n");
            card=sc.nextInt();
            System.out.println("\n Enter your card pin\n");
            pin=sc.nextInt();
            int index=User.search(User.cardNo,card);
            if(index>=0 && pin==User.pin[index]){ //? checking credentials
                checkBal(index); //? calling check balance method
            }
            else{
                System.out.println("Entered invalid credentials");
            }
        }

        else{
            System.out.println("Please re-run the interface and select correct option");
        }
    }

    // ? Withdraw method to withdraw money from atm
   private static void withdraw(int card, int pin) {
        Scanner sc=new Scanner(System.in);
        int index=User.search(User.cardNo, card);
        if(index>=0 && pin==User.pin[index]){ //? checking credentials
            System.out.println("\n Enter Amount to Withdraw cash\n");
            int amount=sc.nextInt();
            User.accountBal[index]-=amount;
            checkBal(index); //? calling check balance method
        }
        else{
            System.out.println("Entered invalid credentials");
        }
        }

    // ? checkbalance method to check account balance
 private static void checkBal(int index) {
    System.out.println("\nUpdated Balance :"+User.accountBal[index]+"\n");
}

    // ? Deposit method to add money to account
private static void deposit(int card,int pin) {
        Scanner sc=new Scanner(System.in);
        int index=User.search(User.cardNo, card);
        if(index>=0 && pin==User.pin[index]){ //? checking credentials
            System.out.println("\n Enter Amount to deposit cash\n");
            int amount=sc.nextInt();
            User.accountBal[index]+=amount;
            checkBal(index); //? calling check balance method
        }
        else{
            System.out.println("Entered invalid credentials");
        }
    }


    

}

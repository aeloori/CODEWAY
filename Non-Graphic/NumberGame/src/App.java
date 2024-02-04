import java.util.Scanner;
import java.lang.Math;

class App{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RandomNumbers rn=new RandomNumbers();
        Gui.start();

        int rangeVal;

        short chance=0;

        
        int range=0;

        System.out.println();
        System.out.println("Enter Mode of Game \n Press 1: Normal Game Mode \n Press 2: For Limit Mode");
        int mode=sc.nextInt();
        System.out.println();
        int life;

        if(mode==1){
            life=1000000000;
        }
        else{
            life=5;
        }

        while(range==0 && range<3){
            System.out.println("enter range -\n Enter 1: range 1-10 \n Enter 2: range 1-100");
            int temp=sc.nextInt();
            range=temp;
        }

        switch (range) {
            case 1:
                System.out.println();
                System.out.println("Selected 1");
                range=9;
                break;
        
            case 2:
                System.out.println();
                System.out.println("Selected 2");
                range=99;
        }

        int guess;
        int randNo=rn.randomGen(range);
        while(life>0){
            System.out.print("Guess the number: ");
            guess=sc.nextInt();
            if(randNo==guess && life>0){
                System.out.println("\n Your Guess was right : you win");
                System.out.println("Total Attempts Taken : "+chance);
                break;
            }

            else if(randNo<guess){
                System.out.println("\n \nToo High \n");
                life-=1;
                chance++;
            }



            else{
                System.out.println("\n Too Low \n");
                life-=1;
                chance++;
            }

            if(life<=0)
            {
                System.out.println("You Loses");
            }
        }

        System.out.println();
        System.out.println("Want to play again ? \n Enter 1: to reload \n Enter 2: To exit");
        byte gameReloader=sc.nextByte();
        if(gameReloader==1){
            chance=0;
            life=5;
            main(null);
        }
        else if(gameReloader>2){
            System.out.println("Enter option is Invalid");
        }
        
    }
}

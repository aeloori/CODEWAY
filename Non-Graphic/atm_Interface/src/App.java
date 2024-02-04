import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // User.checkData();
        Scanner sc=new Scanner(System.in);
        int loop=1;
        while(loop==1){
            AtmInterface.atmStartUP();
            System.out.println("Enter 1 for continue, 0 for exit");
            loop=sc.nextInt();
        }
    }
}

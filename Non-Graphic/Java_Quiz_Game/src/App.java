import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int option;
        int correct=0;
        int wrong=0;
        for(int i=0;i<Questions.questions.length;i++){
            System.out.println(Questions.questions[i]);
            System.out.println(Questions.option1[i]);
            System.out.println(Questions.option2[i]);
            System.out.println(Questions.option3[i]);
            System.out.println(Questions.option4[i]);
            System.out.println();
            System.out.println("Enter your anwer in numbers 1-4");
            option=sc.nextInt();
            if(option==Questions.answers[i]){
                correct++;
            }
            else{
                wrong++;
            }
        }
        System.out.println("\nTotal Correct answers: "+correct);
        System.out.println("\nTotal Wrong answers made: "+wrong);
    }
}

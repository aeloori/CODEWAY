// work need to do set precision to cgpa

//imports
import java.util.Scanner;


public class App {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        //variables
        short subjectNos;
        short totalMarks=0;
        short highestMarks;
        double percentage;

        //object
        App obj=new App();

        System.out.println();
        System.out.println("Student Grade Calculator \n --Calculate Your Grade Percentage");        
        System.out.println();
        System.out.println("Enter total number of subjects to be calculated");

        //Registering total number of subjects 
        subjectNos=sc.nextShort();

        //Calling method to get sum of all subject marks 
        totalMarks=obj.totalMarksCal(subjectNos);


        System.out.println("Total marks obtained by you is : "+totalMarks);
        System.out.println();
        System.out.println("Enter highes marks for each subject");

        //registering highest mrks for every subject
        highestMarks=sc.nextShort();

        System.out.println();
        System.out.println("Calculating your grade percentage");

        //Calling method to get marks percentage 
        percentage=obj.calPercent(totalMarks,subjectNos,highestMarks);

        System.out.println("you got : "+percentage+"% percentage");      
        System.out.println();

        //Calling method to find cgpa
        System.out.println();
        System.out.format("you obtained CGPA of : "+"%2f",obj.cGPA(percentage));
        
    }

    private double cGPA(double percentage) {
        double cgpa=percentage/9.5;
        return cgpa;
    }

    private short totalMarksCal(short subjectNos) {
        short totalMarks=0;
        System.out.println();
        for(short i=1;i<=subjectNos;i++)
        {
            System.out.println();
            System.out.println("Enter marks for subjec: "+i);
            totalMarks+=sc.nextShort();
        }
        return totalMarks;
    }

    //calculating percentage
    private  double calPercent(short totalMarks, short subjectNos, short highestMarks) {
        double percentage=subjectNos*highestMarks;
        percentage=totalMarks/percentage;
        percentage*=100;
        return percentage;
    }


}

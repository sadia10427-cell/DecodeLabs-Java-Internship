 // This program takes the number of subjects and the marks for each subject from the user,
// calculates and displays the result (obtained marks, average percentage, grade, and result status).
 import java.util.Scanner;
 public class GradeCalculator {
    public static void main(String[] args) {
        int marks;
        int total=0;
        int obt_marks=0;
        double average;
        char grade=' ';
        int subjects;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        subjects= sc.nextInt();
        total= subjects*100;
        for(int i=1; i<=subjects ; i++){
            System.out.println(" Enter the marks of subject "+ i + " : ");
            
            marks=sc.nextInt();
            if(marks<0 || marks>100){
                System.out.println("Invalid Input!!");
                i-=1;
            }
            else{obt_marks+=marks;}  

        }

        average= (double) obt_marks/ total *100;

        if(average>=90){
         grade= 'A';
        }
        else if(average >=80 ){
            grade= 'B';
        }else if(average >=70 ){
            grade= 'C';
        }else if (average>=60) {
            grade='D';
        }else {
            grade='F';
        }


        System.out.println("\n\n\n\n\n");
        System.out.println("__________ RESULT __________");
        System.out.println("Number of Subjects: "+ subjects);
        System.out.println("Total Marks: "+ total);
        System.out.println("Total Obtained Marks: "+ obt_marks);
        System.out.printf("Average : %.2f%%", average);
        System.out.println("\nGrade: "+ grade);
        if(grade=='F'){
            System.out.println("Academic Status : Fail");

        }else{
            System.out.println("Academic Status : Pass");
        }
        sc.close();
    }
    
}

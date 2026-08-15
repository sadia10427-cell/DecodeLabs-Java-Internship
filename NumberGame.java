import java.util.Random;
import java.util.Scanner;

public class NumberGame{
   
  

    public static void main(String[] args) {
    int guess;
   
    

Scanner sc= new Scanner(System.in);
System.out.println("____________   Welcome to the Number Game   ______________");
System.out.println(" Rules: The game is simple....\nThe program has chosen a number  between 1 to 100");
System.out.println("You have to guess that number in maximum 15 attempts. ");
System.out.println("You have 150 score points in total, for every wrong attempt you will lose 10 score points");
int choice;
 

do{
    int attempts=0;
    Random random = new Random();
int target = random.nextInt(100) + 1;
int score=150;
for(int i=1; i<16 ; i++){ // The loop will run 15 times
 System.out.println(" Attempt "+ i + " : ");
  guess = sc.nextInt();
 
  if(guess== target){
    System.out.println("Congratulations!! You guessed it right");
    break;
  }
  else if(guess < target){  
    System.out.println("Your guess is too low!\t Try Again");
    attempts++;
    score-=10;
  }
  else if(guess>target){
    System.out.println(" Your guess is too high\n Try Again");
    attempts++;
    score-=10;
  }

}System.out.println(" Your Score is: " + score);
System.out.println("You took " + attempts + " attempts!!");
System.out.println("Press 1 if you want to play another round: ");
 choice= sc.nextInt();
}while(choice==1);
sc.close();

    }
}
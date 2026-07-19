import java.util.*;
public class Project {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int gess = (int)(Math.random() * 100) + 1;
        int gessnumber;
        int attempt=0;
        do { 
            System.out.println("enter your gess number ");
            gessnumber= sc.nextInt();

        
        if (gess==gessnumber){
            System.out.println("you are correct the number is : " + gess);
            attempt++;
        }
        else if (gess <gessnumber){
            System.out.println("your number is high: ");
            attempt++;
        }
        else {
            System.out.println("your number is low");
            attempt++;

        }
    }while(gess!= gessnumber);
    System.out.println("you take "+ attempt +" attempt");
            
    
        sc.close();
    }
}
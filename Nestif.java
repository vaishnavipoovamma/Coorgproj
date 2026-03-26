import java.util.Scanner;
public class Nestif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("age of the person is:"+age);
        if(age>=18){
            if(age>=65){
                System.out.println("eligible to avail government fund");
            }
            else{
                System.out.println("we are eligible to vote and not eligible to avail government scheme");
            }
        }
         else
                System.out.println("we are not eligible to vote1");
            
        
    }
    
}

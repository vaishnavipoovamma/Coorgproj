import java.util.Scanner;

public class Salage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double salery;
        System.out.println("enter the name");
        name = sc.nextLine();
        System.out.println("enter the age");
        age = sc.nextInt();
        System.out.println("enter the salery");
        salery = sc.nextFloat();
        if(age>21 && salery >+ 21000){
          System.out.println("lone granted" + name);
        }else{
          System.out.println("not granted" + name);

    }
    
}
}

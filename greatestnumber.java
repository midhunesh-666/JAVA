import java.util.*;
public class greatestnumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        if(num1>num2&&num1>num3){
              System.out.print("The Greatest Number is :"+num1);
        }
        else if(num1<num2&&num2>num3){
            System.out.print("The Greatest Number is :"+num2);
        }
        else{
            System.out.print("The Greatest Number is :"+num3);
        }
    }
    
}

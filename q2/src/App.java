import java.util.Scanner;
class Cal{
    public void multi (int a,int b,int c){
        int result=a*b*c;
        System.out.println("The result of "+a+"*"+b+"*"+c+" is"+result);
        

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc01= new Scanner(System.in);
        System.out.println("Enter no 01 -");
        int no1 = sc01.nextInt();
        System.out.println("Enter no 02 -");
        int no2= sc01.nextInt();
        System.out.println("Enter no 03 -");
        int no3= sc01.nextInt();
        

        Cal cal01= new Cal();
        cal01.multi(no1,no2,no3);

    }
}

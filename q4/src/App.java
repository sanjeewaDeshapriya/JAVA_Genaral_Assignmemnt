import java.util.Scanner;
class Cal{
    private int a,b,c;
    Cal(int a ,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public void multi (){
        int result=a*b*c;
        System.out.println("The result of "+a+"*"+b+"*"+c+" is"+result);
        

    }

    public int sum(){
        int sum =a+b+c;
        int avr=sum/3;
        System.out.println("sume of 3 numbers is " + sum);
        System.out.println("Average of 3 numbers is " + avr);
        return sum;
    }
     public int abs(){
        int result =a-b-c;
        System.out.println("Abstraction of 3 numbers is " +a+"-"+b+"-"+c+" is"+ result);
        return result;
    }
    public void accending(){
        int[] acccen= new int[3];
        acccen[0]=a;
        acccen[1]=b;
        acccen[2]=c;

        for(int i=0;i<=1;i++){
            for(int j=i+1;j<=2;j++){
                if(acccen[i]>acccen[j]){
                    int temp =acccen[j];
                    acccen[j]=acccen[i];
                    acccen[i]=temp;
                }

            }
        }
        System.out.println("numbers accending oder is ");
        for(int i=0;i<=2;i++){
            System.out.println(acccen[i]);
        }
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
        

        Cal cal01= new Cal(no1,no2,no3);

        cal01.multi();
        cal01.sum();
        cal01.abs();
        cal01.accending();
        

    }
}

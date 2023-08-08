import java.util.Scanner;


class Arr{
    protected int[] array01= new int[20];
    protected float sum;
    public int a;
    
    
}

class Getinput extends Arr{
    Scanner sc01= new Scanner(System.in);
    Getinput(){
    for(int i=0;i<20;i++){
        System.out.println("Enter no " + (i+1));
        int b=sc01.nextInt();
        super.array01[i]=b;
        //System.out.println("b is " +super.array01[i]);

    }

    while(a <20){
            
            sum=sum+ array01[a];
           // System.out.println("cal"+a +"sum is" + sum +"Array val is " + array01[a]);
            
            a++;
       }
       float average= sum/20;

       System.out.println("The sum of array is "+ sum + " And average of the arrray is " + average);
}
}

public class App {
    public static void main(String[] args) throws Exception {
        Getinput ni=new Getinput();
        

    }
}

import java.util.Scanner;
class Convertor{
    public float toCel(float a){
        System.out.println(a);
        float cel= (a-32)*5/9;
        return cel;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc01= new Scanner(System.in);
        System.out.println("Enter Fahrenheit value ");
        float feran = sc01.nextFloat();

        Convertor c1= new Convertor();
        System.out.println("The Celsius value of you ented Fahrenheit value to is " + c1.toCel(feran));  
}
}

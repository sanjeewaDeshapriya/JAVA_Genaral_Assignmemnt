public class Sedan  extends Car{

     private int length;
     private double manufacturerDiscount;

     public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice(){
        if(length>50){
            manufacturerDiscount=5000;

        }
        else{
            manufacturerDiscount=5000;
        }
        return manufacturerDiscount;
     }
     public void dilsplayDetails(){
        System.out.println("Car model - Ford");
        System.out.println("speed - "+ speed+"kmph");
        System.out.println("color - "+ color);
        System.out.println("length - "+ length);
        System.out.println("regular price -"+ regularPrice);
        System.out.println("Discount -"+manufacturerDiscount);
    }
    
}

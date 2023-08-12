public class Truck extends Car{
    private int weight;
    private float manufacturerDiscount;

    public Truck(int speed, double regularPrice, String color, int weight, float discount) {
        super(speed, regularPrice, color);
        this.weight = weight;
        manufacturerDiscount = discount;
    }

    public double getSalePrice(){
        if(weight>2000){
            manufacturerDiscount=1000;
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
        System.out.println("waight - "+ weight);
        System.out.println("regular price -"+ regularPrice);
        System.out.println("Discount -"+manufacturerDiscount);
    }
    
    
}

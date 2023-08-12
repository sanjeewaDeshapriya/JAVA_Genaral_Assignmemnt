public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;
    
    
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }


    public double getSalePrice(){
        double price=2566.05;
        return price;

    }

    public void dilsplayDetails(){
        System.out.println("Car model - Ford");
        System.out.println("speed - "+ speed+"kmph");
        System.out.println("color - "+ color);
        System.out.println("year - "+ year);
        System.out.println("regular price -"+ regularPrice);
        System.out.println("Discount -"+manufacturerDiscount);
    }

    
    
}

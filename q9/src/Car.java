abstract class Car {
    protected int speed;
    protected double regularPrice;
    protected String color;


    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }


    


    abstract double getSalePrice();
    abstract void  dilsplayDetails();

    
}

public class MyOwnAutoShop {
    public static void main(String[] args) throws Exception {
        Ford Ford01= new Ford(150, 10000, "Black", 2016, 2000);
        Ford Ford02= new Ford(150, 90000, "Blue", 2014, 1000);
        Truck Truck01= new Truck(100, 8000, "Yellow", 1500, 1500);
        Sedan sedan01= new Sedan(200, 15000, "red", 45);

        System.out.println("\n Car 01 Details \n");
        Ford01.dilsplayDetails();
         System.out.println("\n Car 01 Details \n");
        Ford02.dilsplayDetails();
         System.out.println("\n Car 01 Details \n");
        Truck01.dilsplayDetails();
         System.out.println("\n Car 01 Details \n");
        sedan01.dilsplayDetails();

    }
}

class Items{
    private int location;
    private String description;

    public Items(int location, String description) {
        this.location = location;
        this.description = description;
    }


    public int getLocation() {
        return location;
    }
    public void setLocation(int location) {
        this.location = location;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}

class Monster extends Items{
    public Monster(int location, String description){
        super(location, description);

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Items itm01= new Items(5, "kadawatha");
        System.out.println("Item 1 location is " + itm01.getLocation() + " description is " + itm01.getDescription());
        Monster mon01= new Monster(8, "Homagama");
        System.out.println("Item 2 location is " + mon01.getLocation() + " description is " + mon01.getDescription());

    }
}

abstract class shape {

    abstract public float draw();
    abstract public void erase();

}

class circle extends shape{
    private float r;
    
    public float draw(){
        
        return (2*3.14f*r);
    }
    public void erase(){
        System.out.println("Erace the circule");
    }
    public circle(float r) {
        this.r=r;
        
    }

}
class Trangle extends shape{
    private float a,h;
    
    public float draw(){
        
        return (a*h/2);
    }
    public void erase(){
        System.out.println("Erace the Trangle ");
    }
    public Trangle(float a,float h) {
        this.a=a;
        this.h=h;
        
    }

}
class square extends shape{
    private float x;
    
    public float draw(){
        
        return (x*x);
    }
    public void erase(){
        System.out.println("Erace the square ");
    }
    public square(float x) {
        this.x=x;
        
        
    }

}



public class App {
    public static void main(String[] args) throws Exception {
        circle c1=new circle(15.6f);
        Trangle t1 = new Trangle(12,15);
        square sq1= new square(12);
    }
}

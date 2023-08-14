interface inf01{
    public  void meth01();
}
interface inf02 extends inf01{
    public void  meth02();
}

abstract class cls01 implements inf02{
    public void meth01(){
        System.out.println("meth 01 implemeted");
    }
    //abstract public void meth02();

}

class cls02 extends cls01{
    public void meth02(){
        System.out.println("method 02 implemeted");
    }


}

public class App {
    public static void main(String[] args) throws Exception {
        cls02 cl = new cls02();

        cl.meth01();
        cl.meth02();.
    }
}

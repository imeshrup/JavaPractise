// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Polymorphism_Over {

    public void Meth_Over(){
        System.out.println("method1");
    }
    public void Meth_Over(int x){
        System.out.println("method2");
    }
    public void Meth_Over(int x, int y){
        System.out.println("method3");
    }
    public static void main(String[] args) {
        Polymorphism_Over obj = new Polymorphism_Over();
        obj.Meth_Over(10, 20);
    }
}
package lab6;

public class Main {
    public static void main(String[] args) {
        Offering a = new Coffee();
        a =  new Rum(a);
        a =  new Rum(a);
        a =  new Rum(a);
        System.out.println(a.getName() + "\n" + a.getPrice()+" rs");
    }

}
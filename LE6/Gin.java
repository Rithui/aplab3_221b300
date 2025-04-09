package lab6;

public class Gin extends Decorator{
    void Gin( Offering offering){
        this.offering = offering;
    }
    @Override
    public int getPrice() {
        return offering.getPrice() + 30;
    }

    @Override
    public String getName() {
        return offering.getName() +" with Gin";
    }
}
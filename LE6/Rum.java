package lab6;

public class Rum extends Decorator{
    Rum( Offering offering){
        this.offering = offering;
    }
    @Override
    public int getPrice() {
        return offering.getPrice() + 35;
    }

    @Override
    public String getName() {
        return offering.getName() +" with Rum";
    }
}
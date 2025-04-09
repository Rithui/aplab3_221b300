package lab6;

public class Tea extends Offering{
    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String getName() {
        return "Tea";
    }
}
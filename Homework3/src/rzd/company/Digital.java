package rzd.company;

public class Digital extends Piece {
    public Digital(String name, String type, int count){
        super(name,type,count);
    }

    double getfinalPrice(){
        return Product.PRICE * 0.5 * count;
    }
    @Override
    double getPrice(){
        return Product.PRICE * 0.5;
    }
}

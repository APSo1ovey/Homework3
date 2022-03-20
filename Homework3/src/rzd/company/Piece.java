package rzd.company;

public class Piece extends Product {
    public Piece(String name, String type, int count){
        super(name,type,count);
    }
    double getfinalPrice(){
        return Product.PRICE * count;
}
    @Override
    double getPrice(){
        return Product.PRICE;
    }
}

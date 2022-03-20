package rzd.company;

public class Weight extends Product {
    private double price;
    public Weight(String name, String type, int count){
        super(name,type,count);
    }

    double getfinalPrice(){
        return Product.PRICE * count;
    }
    @Override
    double getPrice(){
        switch (name){
            case "Сахар": price = 30;
            break;
            case "Рис": price = 20;
                break;
            case "Греча": price = 15;
                break;
            case "Мука": price = 25;
                break;
            case "Соль": price = 20;
                break;
            case "Конфеты": price = 50;
                break;
            default: price = 0;
        }
        return price;
    }
}

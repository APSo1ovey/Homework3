package rzd.company;

public abstract class Product {
    public final static int PRICE = 500;//базовая стоимость товара
    String name;
    String type;
    int count;

    public Product(String name,String type,int count){
        this.name = name;
        this.type = type;
        this.count = count;
        showInfo();
    }

    abstract double getPrice();
    abstract double getfinalPrice();

    void showInfo(){
        if (type == "весовой") {
            System.out.println("В наличии " + type + " товар " + name + ", цена за килограмм: " + Math.round(getPrice()) + " руб");
            System.out.println("Всего килограмм в наличии: " + count + ". Общая цена: " + Math.round(getfinalPrice()) + " руб.");
            System.out.println();

        }
        else {
            System.out.println("В наличии " + type + " товар " + name + ", цена за штуку: " + Math.round(getPrice()) + " руб.");
            System.out.println("Всего единиц в наличии: " + count + ". Общая цена: " + Math.round(getfinalPrice()) + " руб.");
            System.out.println();
        }
//"в размере " + count + " единиц, общей стоимостью " + Math.round(getPrice()) + " руб");
    }
}

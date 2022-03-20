package rzd.company;
/*
Создать структуру классов ведения товарной номенклатуры.
- Есть абстрактный товар.
- Есть цифровой товар, штучный физический товар и товар на вес.
- У каждого есть метод подсчёта финальной стоимости.
- У цифрового товара стоимость постоянная и дешевле штучного товара в два раза,
у штучного товара обычная стоимость, у весового – в зависимости от продаваемого количества в килограммах.
У всех формируется в конечном итоге доход с продаж.
- Что можно вынести в абстрактный класс, наследование?
*/

public class Main {
    public static void main(String[] args) {
	var piece = new Piece("Набор отвёрток","штучный",(int) getSmallRandom());
//	var piece1 = new Piece("Торт","штучный",(int) getSmallRandom());
//	var piece2 = new Piece("Книга о рыбалке","штучный",(int) getSmallRandom());
//	var piece3 = new Piece("Нунчаки","штучный",(int) getSmallRandom());
	var digital = new Digital("Видеокурс","цифровой",(int) getSmallRandom());
//	var digital1 = new Digital("Аудиокнига","цифровой",(int) getSmallRandom());
//	var digital2 = new Digital("Полнометражный фильм","цифровой",(int) getSmallRandom());
	var weight = new Weight("Конфеты","весовой",(int) getBigRandom());
	var weight1 = new Weight("Рис","весовой",(int) getBigRandom());
	var weight2 = new Weight("Сахар","весовой",(int) getBigRandom());
    }

	static double getSmallRandom(){
		int a = 1;
		int b = 100;
		int i = (int) (Math.random()*(b-a)+a);
		return i;
	}
	static double getBigRandom(){
		int a = 1;
		int b = 1000;
		int i = (int) (Math.random()*(b-a)+a);
		return i;
	}
}

package Functional_Kiosk;

public enum Topping {

    SWEET_ONION(100,150),//сладкий лук
    JALAPENYU(100,120),//халапенью
    CHILE(100,135),//чили
    PICKLE(100,125);//сол огурец
    Integer portion;
    Integer price;

    Topping(Integer portion, Integer price) {
        this.portion = portion;
        this.price = price;
    }
}

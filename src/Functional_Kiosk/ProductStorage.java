package Functional_Kiosk;

public enum ProductStorage {
    MAYONNAISE(50,100),MUSTARD(45,90),KETCHUP(55,110);
Integer portion;
Integer price;

    ProductStorage(Integer portion, Integer price) {
        this.portion = portion;
        this.price = price;
    }
}

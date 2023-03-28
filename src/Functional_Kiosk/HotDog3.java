package Functional_Kiosk;

public class HotDog3 extends HotDog2 implements HotDog{
Integer topping;

    public HotDog3(Integer bread, Integer sausage, Integer mayonnaise, Integer mustard) {
        super(bread, sausage, mayonnaise, mustard);
        this.topping=Topping.CHILE.portion;
    }

    @Override
    public HotDog create_HotDog() {
return new HotDog3(100,80,ProductStorage.MAYONNAISE.portion, ProductStorage.MUSTARD.portion);
    }
}

package Functional_Kiosk;

public class HotDog2 extends HotDog1 implements HotDog{
Integer ketchup;

    public HotDog2(Integer bread, Integer sausage, Integer mayonnaise, Integer mustard) {
        super(bread, sausage, mayonnaise, mustard);
        this.ketchup=ProductStorage.KETCHUP.portion;
    }

//    @Override
//    public  HotDog create_HotDog() {
//return new HotDog2(100,80,ProductStorage.MAYONNAISE.portion, ProductStorage.MUSTARD.portion);
//    }
}

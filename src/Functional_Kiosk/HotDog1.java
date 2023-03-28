package Functional_Kiosk;

public class HotDog1 implements HotDog {
    Integer bread;
    Integer sausage;
    Integer mayonnaise;
    Integer mustard;

    public HotDog1(Integer bread, Integer sausage, Integer mayonnaise, Integer mustard) {
        this.bread = 100;
        this.sausage = 80;
        this.mayonnaise = ProductStorage.MAYONNAISE.portion;
        this.mustard = ProductStorage.MUSTARD.portion;
    }}

// @Override
// public static HotDog create_HotDog(){
//        return new HotDog1(100,80,ProductStorage.MAYONNAISE.portion, ProductStorage.MUSTARD.portion);
//    }
//    }


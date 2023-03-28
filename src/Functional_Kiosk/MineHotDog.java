//package Functional_Kiosk;
//
//import java.util.Scanner;
//
//public class MineHotDog extends HotDog1 implements HotDog {
//Scanner scanner=new Scanner(System.in);
//Integer toping;
//    public MineHotDog(Integer bread, Integer sausage, Integer mayonnaise, Integer mustard, Integer topping) {
//        super(bread, sausage, mayonnaise, mustard);
//        this.toping=topping;
//    }
//
//
//    public HotDog create_HotDog() {
//        System.out.println("""
//                Выберете компоненты которые хотите добавить к хотдогу:
//                  Выберете топпинг!
//                 1 Сладкий лук
//                 2 Халапенью
//                 3 Чили
//                 4 Соленные огурцы
//                """);
//        Integer temp=scanner.nextInt();
//        switch (temp){
//            case 1->{new MineHotDog(100,80,ProductStorage.MAYONNAISE.portion,ProductStorage.MUSTARD.portion, Topping.SWEET_ONION.portion);}
//            case 2->{new MineHotDog(100,80,ProductStorage.MAYONNAISE.portion,ProductStorage.MUSTARD.portion, Topping.JALAPENYU.portion);}
//            case 3->{new MineHotDog(100,80,ProductStorage.MAYONNAISE.portion,ProductStorage.MUSTARD.portion, Topping.CHILE.portion);}
//            case 4->{new MineHotDog(100,80,ProductStorage.MAYONNAISE.portion,ProductStorage.MUSTARD.portion, Topping.PICKLE.portion);}
//        }
//
//
//
//    }
//}

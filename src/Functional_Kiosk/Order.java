package Functional_Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    Scanner scanner=new Scanner(System.in);
    List<HotDog> hotDogList;

    List<Order> orderList= new ArrayList<>();



    public void creteOrder(){
        while (true) {
            System.out.println("""
                    Сделайте заказ:
                    1 Хотдог по 1 рецепту 
                    2 Хотдог по 2 рецепту 
                    3 Хотдог по 3 рецепту 
                    4 Хотдог по своему рецепту
                    5 Завершить заказ!
                    """);switch (scanner.nextInt()){
                        case 1->{
                      //  hotDogList.add( );

                        }
            }


        }

    }

}

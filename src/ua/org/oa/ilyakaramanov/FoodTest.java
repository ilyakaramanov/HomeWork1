package ua.org.oa.ilyakaramanov;


public class FoodTest {

    public static void main(String[] args) {

        //Создаю объекты и задаю значения

        Food food1 = new Food("фрукты", "яблоки", 20, 2, true);
        Food food2 = new Food("овощи", "помидоры", 10, 12, true);
        Food food3 = new Food("овощи", "помидоры", 4, 1, false);


        System.out.println("Проверяю первый случай:");
        food1.toInformation();
        System.out.println(food1.tomatos() + " " + food1.money() + " " + food1.tasty() + " " + food1.juse());
        System.out.println();

        System.out.println("Проверяю второй случай:");
        food2.toInformation();
        System.out.println(food2.tomatos() + " " + food2.money() + " " + food2.tasty() + " " + food2.juse());
        System.out.println();

        System.out.println("Проверяю третий случай:");
        food3.toInformation();
        System.out.println(food3.tomatos() + " " + food3.money() + " " + food3.tasty() + " " + food3.juse());
        System.out.println();


    }
}

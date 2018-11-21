package ua.org.oa.ilyakaramanov;


public class FoodTest {

    public static void main(String[] args) {

        //Создаю объекты и задаю значения

        Food food1 = new Food("фрукты", "яблоки", 20, 2, true);
        Food food2 = new Food("овощи", "помидоры", 10, 12, true);
        Food food3 = new Food("овощи", "помидоры", 4, 5, true);
        Food food4 = new Food("овощи", "помидоры", 10, 1, false);


        System.out.println("Проверяю первый случай:");
        if ((food1.type == "овощи") && (food1.name == "помидоры")) {
            System.out.println(food1.tomatos() + " " + food1.money() + " " + food1.tasty() + " " + food1.juse());
        } else {
            System.out.println(food1.tomatos());
        }


        System.out.println("Проверяю второй случай:");
        if ((food2.type == "овощи") && (food2.name == "помидоры")) {
            System.out.println(food2.tomatos() + " " + food2.money() + " " + food2.tasty() + " " + food2.juse());
        } else {
            System.out.println(food2.tomatos());
        }

        System.out.println("Проверяю третий случай:");
        if ((food3.type == "овощи") && (food3.name == "помидоры")) {
            System.out.println(food3.tomatos() + " " + food3.money() + " " + food3.tasty() + " " + food3.juse());
        } else {
            System.out.println(food3.tomatos());
        }

        System.out.println("Проверяю четверный случай:");
        if ((food4.type == "овощи") && (food4.name == "помидоры")) {
            System.out.println(food4.tomatos() + " " + food4.money() + " " + food4.tasty() + " " + food4.juse());
        } else {
            System.out.println(food4.tomatos());
        }


    }
}

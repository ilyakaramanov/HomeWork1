package ua.org.oa.ilyakaramanov;

public class Food {
    /**
     * Создать java-программу, удовлетворяющую следующим требованиям:
     * 1. Создать класс, описывающий заданный объект. В каждом классе:
     * Определить минимум 5 полей трех различных типов характеризующих заданный предмет;
     * Создать метод, выполняющий вычисление параметров на основании значений полей объекта;
     * Определить метод для вывода информации об объекте на экран.
     * 2. Каждый класс, поле, метод должен иметь название, отражающее его суть и коментарии, описывающие их предназначение.
     * 3. На этапе составления программы должны быть использованы соглашения из java code convention.
     * 4. Протестировать созданный вами класс, создав несколько экземпляров класса (в методе main()), описывающего предмет, провести инициализацию переменных-атрибутов каждого экземпляра и вызвать его методы.
     * 5. Имя пакета в котором создается класс/классы должно иметь формат ua.org.oa.<Jira Login>.
     * Объект: Продукты питания.
     */

    // Определяю 5 полей трех разных типов характеризующих предмет
    String type; //тип продукта
    String name; //название продукта
    int cost; //стоимость продукта
    int weight; //вес продукта
    boolean ripe; //спелый или зеленый

    Food(String objectType, String objectName, int objectCost, int objectWeight, boolean objectRipe) {

        type = objectType;
        name = objectName;
        cost = objectCost;
        weight = objectWeight;
        ripe = objectRipe;

    }

    //Методы, выполняющие вычисление параметров на основании значений полей объекта

    //Проверяю овощи + помидоры или нет
    public String tomatos() {
        if ((type == "овощи") && (name == "помидоры")) {
            String tomatos = "Хорошие помидоры ";
            return tomatos;
        } else {
            String tomatos = "Сейчас я ищу помидоры.";
            return tomatos;
        }
    }


    //Проверка на спелость
    public String tasty() {
        if (ripe == true) {
            String tasty = "Люблю спелые овощи.";
            return tasty;
        } else {
            String tasty = "Но нужно подождать пока они дозреют.";
            return tasty;
        }
    }


    //Проверяю подходит ли цена
    public String money() {
        if (cost >= 15) {
            String money = "но, будем ждать пока подешевеет.";
            return money;
        } else if (cost >= 5 && cost <= 14) {
            String money = "и цена подходит.";
            return money;
        } else if (cost > 0 && cost < 5) {
            String money = "забираю все.";
            return money;
        } else {
            String money = "такой цены не быввает.";
            return money;
        }
    }


    //Проверяю сколько получится сделать томатного сока
    public String juse() {
        if (weight > 10 && weight < 20) {
            String juse = "Из этого количества получится 5 литров сока.";
            return juse;
        } else if (weight > 1 && weight <= 10) {
            String juse = "Из этого количества получится 3 литра сока.";
            return juse;
        } else if (weight > 0 && weight <= 1) {
            String juse = "Из этого количества можно сделать салат.";
            return juse;
        } else {
            String juse = "Пока стоял в очереди все закончилось.";
            return juse;
        }
    }


}
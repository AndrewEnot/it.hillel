package ua.hillel.school.hw10;

public class Pizzeria {

    public static void main(String[] args) {

        Pizza[] pizzeria;
        int assortment = 3;                     //зміна, що відповідає за кількість рецептів Піци в Піцерії

        // блок введення даних щодо складу та ціни на піци

            pizzeria = new Pizza[assortment];
            pizzeria[0] = new Pizza("tomato, pork, double cheese", "Carbonara",
                    10, 50);
            System.out.println();
            pizzeria[1] = new Pizza("pineapple, chicken, corn, double cheese", "Gawaii",
                    20, 75);
            pizzeria[2] = new Pizza("pork, chicken, bacon, beef meatballs, cheese", "Big Meat Pizza",
                    30, 100);

        //цикл для виводу даних з масиву піц в консоль

        for (Pizza pizza : pizzeria) {
            System.out.println(" ");
            System.out.println("Назва піци: " + pizza.getName());
            System.out.println("Склад піци: " + pizza.getComposition());
            System.out.println("Діаметр   : " + pizza.getDiameter());
            System.out.println("Ціна піци : " + pizza.getPrice());
        }
    }
}

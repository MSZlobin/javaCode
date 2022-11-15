package lesson.homeWork;

public class Stage1 {
    public static void main(String[] args) {
        //Базовая домашка задача 1

        float l = 1.8f;
        float mass = 60.5f;
        float iMass = mass /(l*l);
        System.out.println(iMass);

        //Базовая домашка задача 2

        int ageChildren = 10;

        if (ageChildren < 6) {
            System.out.println("ребенку в сад");
        } else if (ageChildren < 11) {
            System.out.println("ребенку в младшую школу");
        } else if (ageChildren< 17) {
            System.out.println("ребенку в среднюю школу");
        } else {
            System.out.println("в университет");
        }

        // Базовая домашка задача 3

        //Курица
        boolean chicken = true;
        //Овощи
        boolean vegetables = true;
        //Соус
        boolean sour = true;
        //Хлеб
        boolean toast = false;
        //Колбаса
        boolean sausage = true;
        //Яйца
        boolean eggs = true;

        boolean cesarSalat = chicken & vegetables & sour & toast;
        boolean olivjeSalat = vegetables & (chicken || sausage) & eggs;
        boolean wegetablesSalat = vegetables;


        if (cesarSalat) {
            System.out.println("могу приготовить цезарь");
        } else if (olivjeSalat) {
            System.out.println("могу приготовить оливье");
        } else if (wegetablesSalat) {
            System.out.println("могу пиготовить овощной салат");
        } else {
            System.out.println("нет ингридиентов");
        }


        //Продвинутая домашка задача 1

        short z = 234;

        String str1 = "some_text";

        int x = z + str1.length();

        System.out.println(x);

        // ПРодвинутая домашка  задача 2

        byte a = 3;
        byte b = 5;


        System.out.println((int)Math.pow((a+b),2) );

        // ПРодвинутая домашка  задача 3




    }
}

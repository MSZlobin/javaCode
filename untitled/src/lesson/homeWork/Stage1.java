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

        boolean hasFuel = true;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = true;
        byte totalProblem = 0;

        int electricsProblemCoast = 5000;
        int motorProblemCoast = 10000;
        int transmissionProblemCoast = 4000;
        int wheelsProblemCoast = 2000;
        int totalCoast = 0;



        if (hasElectricsProblem) {
            totalProblem = (byte) (totalProblem + 1);
        }
        if (hasMotorProblem) {
            totalProblem = (byte) (totalProblem + 1);
        }
        if (hasTransmissionProblem) {
            totalProblem = (byte) (totalProblem + 1);
        }
        if (hasWheelsProblem) {
            totalProblem = (byte) (totalProblem + 1);
        }


        if (hasFuel == false & totalProblem == 0) {
            System.out.println("К оплате 1000");
        } else if (totalProblem == 2) {
            if (hasTransmissionProblem & hasMotorProblem ) {
                System.out.println((transmissionProblemCoast+motorProblemCoast)*0.8);
            } else if (hasTransmissionProblem & hasElectricsProblem) {
                System.out.println((transmissionProblemCoast+electricsProblemCoast)*0.8);
            } else {
                if (hasElectricsProblem) {
                    totalCoast = totalCoast + electricsProblemCoast;
                }
                if (hasMotorProblem) {
                    totalCoast = totalCoast + motorProblemCoast;
                }
                if (hasTransmissionProblem) {
                    totalCoast = totalCoast + transmissionProblemCoast;
                }
                if (hasWheelsProblem) {
                    totalCoast = totalCoast + wheelsProblemCoast;
                    System.out.println(totalCoast*0.9);
                }
            }
        } else if (totalProblem <2) {
            if (hasElectricsProblem) {
                System.out.println(electricsProblemCoast);
            } else if (hasMotorProblem) {
                System.out.println(motorProblemCoast);
            } else if (hasTransmissionProblem) {
                System.out.println(transmissionProblemCoast);
            } else if (hasWheelsProblem) {
                System.out.println(wheelsProblemCoast);
            }
        } else {if (hasElectricsProblem) {
            totalCoast = totalCoast + electricsProblemCoast;
        }
            if (hasMotorProblem) {
                totalCoast = totalCoast + motorProblemCoast;
            }
            if (hasTransmissionProblem) {
                totalCoast = totalCoast + transmissionProblemCoast;
            }
            if (hasWheelsProblem) {
                totalCoast = totalCoast + wheelsProblemCoast;
                System.out.println(totalCoast*0.9);
            }

        }



    }
}

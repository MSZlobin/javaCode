package homeWork3.Begginer.task2;

public class task2 {
    public static void main(String[] args) {
        Cars lada = new SportCar("lada");
        Cars volga = new SportCar("volga");
        Cars niva = new OffRoadCar("niva");
        Cars moskwich = new OffRoadCar("moskwich");

        Cars[] cars = {lada, volga, niva, moskwich};
        for (Cars car : cars) {
            car.showName();
        }
    }
}

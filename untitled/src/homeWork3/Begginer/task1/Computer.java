package homeWork3.Begginer.task1;

public class Computer extends Electronic {
    public Computer(boolean isWork) {
        super(isWork);
    }
    public void loadSystem (){
        on();
        System.out.println("Загрузка компьютера");
    }
}

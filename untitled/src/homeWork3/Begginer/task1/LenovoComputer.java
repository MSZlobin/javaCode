package homeWork3.Begginer.task1;

public class LenovoComputer extends Computer {
    public LenovoComputer(boolean isWork) {
        super(isWork);
    }
    @Override
    public void loadSystem() {
        System.out.println("загрузка Lenovo");
    }
}

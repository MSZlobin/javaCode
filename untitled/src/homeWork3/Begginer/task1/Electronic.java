package homeWork3.Begginer.task1;

public abstract class Electronic {
    boolean isWork;

    public Electronic(boolean isWork) {
        this.isWork = false;
    }

    public void on() {
        if (!isWork) {
            isWork = true;
        }
    }
    public void off() {
        if (isWork) {
            isWork = false;
        }
    }
    public void work () {
        System.out.println("Выполняет вычисления");
    }



}

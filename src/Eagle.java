public class Eagle extends Animal {
    public Eagle() {
    }

    public String fly() {
        return " Скорость полёта орла состовляет в среднем 30 км/сек  ";

    }

    @Override
    public void animall() {
        System.out.println(fly());
    }
}

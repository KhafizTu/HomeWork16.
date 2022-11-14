public class Turtle extends Animal {
    public Turtle() {
    }

    public String swim() {
        return " Скорость плавания морских черепах составляют 16-20 км ";

    }

    @Override
    public void animall() {
        System.out.println(swim());
    }
}

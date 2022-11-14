public class Shark extends Animal {
    public Shark() {
    }

    public String attack() {
        return " Средяя статистическая акула может развить скорость свыше 60 км/час , тоесть 1км/мин ";

    }

    @Override
    public void animall() {
        System.out.println(attack());
    }
}

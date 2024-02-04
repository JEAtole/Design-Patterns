public class Cat implements Pet {
    private int noOfLives;

    public Cat (int noOfLives) {
        this.noOfLives = noOfLives;
    }
    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Plays with yarn!";
    }

    public int getNoOfLives() {
        return noOfLives;
    }
}

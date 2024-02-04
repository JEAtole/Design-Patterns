public class Dog implements Pet {
    private String breed;

    public Dog (String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Plays fetch!";
    }

    public String getBreed() {
        return breed;
    }

}

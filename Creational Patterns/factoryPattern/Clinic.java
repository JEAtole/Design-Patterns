public class Clinic {

    public static void main(String[] args) {
        PetRecord dogRecord = new PetRecord("D1", "Buddy", new Dog("Welsh Corgi"));
        PetRecord catRecord = new PetRecord("C1", "Whiskers", new Cat(9));

        dogRecord.displayInfo();
        catRecord.displayInfo();
    }

}

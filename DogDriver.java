public class DogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog ("Fang", 5, "Husky", 80.0);
        Dog dog2 = new Dog ("Piper", 3, "Australian Shepherd", 45.0);
        Dog dog3 = new Dog ();

        dog3.setName("Iroh");
        dog3.setAge(7);
        dog3.setBreed("Golden Retriever");
        dog3.setPounds(60.5);

        System.out.println("Fang's Breed: " + dog1.getBreed() + "\nFang's Age: " + dog1.getAge() + "\n");
        System.out.println("Piper's Weight (in kilograms): " + dog2.toKilograms() + "\n");
        System.out.println(dog3.toString());
        System.out.println("\nNumber of Dogs: "  + Dog.getDogCount());
    }
}
public class Dog
{
    private String name;
    private int age;
    private String breed;
    private double pounds;

    private static int dogCount = 0;

    public Dog()
    {
        name = "";
        age = 0;
        breed = "";
        pounds = 0;
        dogCount++;
    }

    public Dog(String name, int age, String breed, double pounds)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.pounds = pounds;
        dogCount++;
    }

    public static int getDogCount()
    {
        return dogCount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public double getPounds()
    {
        return pounds;
    }

    public void setPounds(double pounds)
    {
        this.pounds = pounds;
    }

    public double toKilograms()
    {
        double kg = 0.45359237;
        pounds = pounds * kg;
        return pounds;
    }

    public String toString()
    {
        String result = "Dog Name: " + name + "\nDog Age: " + age + "\nDog Breed: " + breed + "\nDog Weight (in kilograms): " + toKilograms();
        return result;
    }
}

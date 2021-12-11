public class DogDriver
{
    public static void main (String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Alice", 12, "Chihuahua Mix", 65);

        System.out.println("Dog 1: " + dog1.getDogAge() + ", " + dog1.getDogBreed());
        System.out.println("Dog 2: " + dog2.getDogWeight());
        System.out.println("Dog 3: " + dog3.toString());
        System.out.println("There are " + Dog.getCount() + " dogs.");
    }
}
import java.util.Random;

public class Pet {
    private int age = this.generateDefaultAge();
    private Enum color;
    private Shelter shelter;

    public Pet() {
    }

    public Enum getColor() {
        return this.color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return this.shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(1, 11);
    }

    public String getInfo() {
        int var10000 = this.age;
        return "Age: " + var10000 + "\nColor: " + String.valueOf(this.color) + "\nShelter name: " + this.shelter.getName() +
                "\nShelter address: " + this.shelter.getAddress();
    }

}

import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return this.commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice() {
        System.out.println("Гав гав");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public String getInfo() {
        String var10000;
        if (this.commands != null) {
            var10000 = super.getInfo();
            return var10000 + "\nName: " + this.name + "\nBreed: " + this.breed + "\nCommands: " + Arrays.toString(this.commands);
        } else {
            var10000 = super.getInfo();
            return var10000 + "\nName: " + this.name + "\nBreed: " + this.breed;
        }
    }
}

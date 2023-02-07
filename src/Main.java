public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String[] commands = new String[]{"Лежать", "Сидеть"};
        Shelter shelter = new Shelter("Lenina 1", "Peace");
        Dog dog = new Dog("Rex", "Ovcharka", Color.BROWN, shelter, commands);
        System.out.println(dog.getInfo());

        dog.makeVoice("gav gav");

        Shelter shelter1 = new Shelter("Дэн Сяопина 137", "Like animal");
        Dog dog1 = new Dog("Жучка", "Дворняга", Color.WHITE, shelter1);
        System.out.println(dog1.getInfo());

        dog1.makeVoice();

    }
}
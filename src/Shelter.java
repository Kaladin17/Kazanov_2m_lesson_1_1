public class Shelter {
    private String address;
    private String name;

    public Shelter(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

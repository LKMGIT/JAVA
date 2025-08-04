package BookStore;

public class Member {

    private String name;
    private String phone_number;

    public Member(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setName(String name) {
        this.name = name;
    }
}

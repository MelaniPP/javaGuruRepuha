package Human;

public class Human {
    int age;
    String name;
    String surname;

    public Human() {

    }

    void setAge(int a) {
        age = a;
    }

    void setName(String n) {
        name = n;
    }

    void setSurname(String s) {
        surname = s;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    Integer getAge() {
        return age;
    }

    public Human(int a, String n, String s) {
        age = a;
        name = n;
        surname = s;

    }

    @Override
    public String toString() {
        return "name: "+name+", surname: "+surname+", age: "+age;
    }
}
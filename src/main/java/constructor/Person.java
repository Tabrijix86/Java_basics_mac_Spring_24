package constructor;

class Person {

    private String name;
    private String email;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", email=" + email + ", age=" + age + '}';
    }

}

import java.util.Objects;

public class Person {
    private String role;
    private String login;
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Person(String role, String login) {
        this.role = role;
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(role, person.role) && Objects.equals(login, person.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, login);
    }

    @Override
    public String toString() {
        return "Person{" +
                "role='" + role + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}

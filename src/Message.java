import java.util.Objects;

public class Message {
    private Person person;
    private String text;

    public Message(Person person, String text) {
        this.person = person;
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(person, message.person) && Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, text);
    }

    @Override
    public String toString() {
        return "Message{" +
                "person=" + person +
                ", text='" + text + '\'' +
                '}';
    }
}

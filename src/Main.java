public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        Test.task1();
        Test.task2();
        Test.task3(101);
        Person person1 = new Person("Admin", "admin1");
        Person person2 = new Person("User", "user1");
        Person person3 = new Person("User", "user2");
        Message messageP1 = new Message(person1, "Welcome role admin");
        Message messageP2 = new Message(person2, "Welcome role sys.admin");
        Message messageP3 = new Message(person3, "Welcome role user player");
        validDate(messageP2, person1);
        boolean plover = validDate(messageP3, person3);
        if (plover) {
            messageP3.setText("New commend");
            System.out.println(messageP3);
        } else {
            System.out.println("He's don't have role");
        }
        Person man = new Person(15);
//        ternary operator WARN
//        https://javarush.com/groups/posts/ternarnyj-operator

//        String securityAnswer = (man.getAge() >= 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";
        System.out.println((plover) ? "Commend changed" : "Error");
        System.out.println(messageP3.getText());

    }

    public static boolean validDate(Message message, Person person) {
        return person.getRole().equals("Admin") || message.getPerson().equals(person);
    }
}
package app;

public class Person {

    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Ім'я = " + name + ", Вік = " + age + ", Професія = " + profession;
    }

    public void setProfession(String newProfession){
        this.profession = newProfession;
    }

    public class Student {

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String name;
        int age ;

    }

    public static void main(String[] args) {
        Person person = new Person("John",30,"Інженер");
        Person person1 = new Person("Mary", 25, "Вчитель");
        Person person2 = new Person("Bob", 35, "Лікар");
        Person person3 = new Person("Alice", 28,"Архітектор");

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person3.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії) ");
        System.out.println(person3);

    }
}

public class Lesson49Udemy {
    public static void main(String[] args) {

        People[] people = new People[100];
        people[0] = new Student();
        people[1] = new Employee("Marc", "Novak", "man", 37, 3700);
        people[2] = new Student("Bart", "Simpson", "man", 17);

        for (People person : people) {
            if (person instanceof People) {
                person.getDescription();
            } else
                break;
        }
        People e1 = people[1];
        People s1 = people[0];
        System.out.println(e1.fistName + " " + e1.lastName);
        System.out.println(people[2].age);
    }
}

abstract class People {
    String fistName;
    String lastName;
    int age;
    double income;
    String sex;

    abstract void getDescription();
}

class Student extends People {

    Student(){

    }
    Student(String firstName, String lastName, String sex, int age) {
        this.fistName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    @Override
    void getDescription() {
        System.out.println("Some cool (or not) descritption of " + getClass());
    }
}
class Employee extends People {
    Employee(String firstName, String lastName, String sex, int age, double income) {
        this.fistName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.income = income;
    }

    @Override
    void getDescription() {
        System.out.println("Some cool (or not) descritption of " + getClass());
    }

}

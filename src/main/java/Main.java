public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[]{
                new Person(new Professor(), "Doc"),
                new Person(new Laborant(), "Marty"),
                new Person(new Student(), "Student1"),
                new Person(new Student(), "Student2")};


        for (int i = 0; i < persons.length; i++) {



                System.out.println(persons[i].getType() + "  " + persons[i].getName() + ", his work is to " + persons[i].doJob());
            }


        }
    }


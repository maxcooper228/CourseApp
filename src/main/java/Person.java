public class Person
{
    private Profession type;
    private final String name;

    public Person(Profession type, String name) {
        this.type = type;
        this.name = name;
    }


    public Profession getType() {
        return type;
    }

        public String getName() {
        return name;
    }

    public String doJob(){
        return type.doJob();
    }

}

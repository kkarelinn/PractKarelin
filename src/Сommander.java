public class Сommander extends Human{
    private String name;
    private int age;
    Human curator;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Fighttable getCurator() {
        return curator;
    }

    public void setCurator(Human curator) {
        this.curator = curator;
    }

    public Сommander(String name) {
        this.name = name;
    }

    @Override
    public void singASong() {
        System.out.println("Olala. I am "+getName()+"! You are stupid!");
    }

    @Override
    public void canReport() throws MyExeption {
        System.out.println("My curator name is "+ curator.getName());;
    }
}

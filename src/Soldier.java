public class Soldier extends Human{
    private String name;
    private int age;

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

    public Human getCurator() {
        return curator;
    }

    public void setCurator(Human curator) {
        this.curator = curator;
    }

    public Soldier(String name) {
        this.name = name;
    }

       @Override
    public void canReport() throws MyExeption {
        System.out.println("My curator name is "+ curator.getName());;
    }

    @Override
    public void singASong(){
        System.out.println("Olala. I am "+getName()+"!");
    }
}

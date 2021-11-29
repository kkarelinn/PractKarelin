public class Human implements Fighttable {
    private String name;
    private int age;
    Human curator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void singASong(){
        System.out.println("Olala. I am human!");
    }

    @Override
    public void canFight() throws MyExeption {
        System.out.println("I can fight, bro!");


    }

    @Override
    public void canReport() throws MyExeption {
        System.out.println("I am loser, cap!");
    }
}

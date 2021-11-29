public class General extends Human{
    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    public General(String name) {
        this.name = name;
    }

    @Override
    public void singASong() {
                  System.out.println("Olala. I am a General! I am a GOD!");
            }

    @Override
    public void canReport() throws MyExeption{
        System.out.println("I have no curators");;
    }
}

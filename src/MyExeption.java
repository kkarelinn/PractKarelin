import java.io.IOException;

public class MyExeption extends IOException {
    public MyExeption() {
        super();
    }

    public MyExeption(String message) {
        super("this is Exception");
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Brian");
        names.add("Justin");
        names.add("Scalet");
        names.add("Georger");

        names.forEach(x -> {if (x == "Brian") System.out.print("Found Brian");});
    }
}
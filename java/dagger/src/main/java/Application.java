
public class Application {

    public static void main(String[] args) {
        LibraryBuilder build = DaggerLibraryBuilder.builder().build();

        Library build1 = build.build();
    }

}

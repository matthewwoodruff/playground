import javax.inject.Inject;

public class Library {

    private final BookKeeper bookKeeper;
    private final Computer computer;

    @Inject
    public Library(BookKeeper bookKeeper, Computer computer) {
        this.bookKeeper = bookKeeper;
        this.computer = computer;
    }

    public boolean someLibraryMethod() {
        return true;
    }


}

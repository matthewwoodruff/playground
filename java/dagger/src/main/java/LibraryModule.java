import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class LibraryModule {

    @Provides @Singleton BookKeeper provideBookKeeper() {
        return new Fred("Fred");
    }

    @Provides @Singleton Computer provideComputer() {
        return new Computer("Computer");
    }

//    @Provides public BookKeeper provideBookKeeper(Fred fred) {
//        return fred;
//    }

}

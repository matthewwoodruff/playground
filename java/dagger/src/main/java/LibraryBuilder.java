import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = LibraryModule.class)
public interface LibraryBuilder {

    Library build();

}

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LibraryModule_ProvideBookKeeperFactory implements Factory<BookKeeper> {
  private final LibraryModule module;

  public LibraryModule_ProvideBookKeeperFactory(LibraryModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public BookKeeper get() {  
    BookKeeper provided = module.provideBookKeeper();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<BookKeeper> create(LibraryModule module) {  
    return new LibraryModule_ProvideBookKeeperFactory(module);
  }
}


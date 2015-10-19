import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerLibraryBuilder implements LibraryBuilder {
  private Provider<BookKeeper> provideBookKeeperProvider;
  private Provider<Computer> provideComputerProvider;
  private Provider<Library> libraryProvider;

  private DaggerLibraryBuilder(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static LibraryBuilder create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideBookKeeperProvider = ScopedProvider.create(LibraryModule_ProvideBookKeeperFactory.create(builder.libraryModule));
    this.provideComputerProvider = ScopedProvider.create(LibraryModule_ProvideComputerFactory.create(builder.libraryModule));
    this.libraryProvider = Library_Factory.create(provideBookKeeperProvider, provideComputerProvider);
  }

  @Override
  public Library build() {  
    return libraryProvider.get();
  }

  public static final class Builder {
    private LibraryModule libraryModule;
  
    private Builder() {  
    }
  
    public LibraryBuilder build() {  
      if (libraryModule == null) {
        this.libraryModule = new LibraryModule();
      }
      return new DaggerLibraryBuilder(this);
    }
  
    public Builder libraryModule(LibraryModule libraryModule) {  
      if (libraryModule == null) {
        throw new NullPointerException("libraryModule");
      }
      this.libraryModule = libraryModule;
      return this;
    }
  }
}


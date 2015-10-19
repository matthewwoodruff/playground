import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LibraryModule_ProvideComputerFactory implements Factory<Computer> {
  private final LibraryModule module;

  public LibraryModule_ProvideComputerFactory(LibraryModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Computer get() {  
    Computer provided = module.provideComputer();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Computer> create(LibraryModule module) {  
    return new LibraryModule_ProvideComputerFactory(module);
  }
}


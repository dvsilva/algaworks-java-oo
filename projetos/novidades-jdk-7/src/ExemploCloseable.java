import java.io.Closeable;

public class ExemploCloseable implements Closeable {
	
	public ExemploCloseable() {
		System.out.println("ExemploCloseable constructor");
	}

	public void event() {
		System.out.println("Event ... ");
	}
	
	@Override
	public void close() {
		System.out.println("Closing ... ");
	}

}

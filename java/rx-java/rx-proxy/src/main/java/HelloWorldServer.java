import io.undertow.Undertow;
import io.undertow.util.Headers;

public class HelloWorldServer {

    public static void main(final String[] args) {
        Undertow server = Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler( exchange -> {
                    System.out.println(Thread.currentThread());
                    System.out.println(exchange.isInIoThread());
                    Thread.sleep(5000);
                    exchange.getResponseHeaders().put( Headers.CONTENT_TYPE, "text/plain");
                    exchange.getResponseSender().send("Hello World");
                } ).build();

        System.out.println("Starting server");
        server.start();

        Runtime.getRuntime().addShutdownHook( new Thread( () -> {
            System.out.println("Stopping Server");
            server.stop();
        }  ));
    }
}
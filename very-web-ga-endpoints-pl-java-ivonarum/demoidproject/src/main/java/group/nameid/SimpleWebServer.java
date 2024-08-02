package group.nameid;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleWebServer {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // Default handler
        server.createContext("/", new MyHandler());
        
        // REST API endpoint
        server.createContext("/api/greet", new RestApiHandler());

        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started on port 8080");
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "Welcome to the Simple Java Server!";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    static class RestApiHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            if ("GET".equals(t.getRequestMethod())) {
                String jsonResponse = "{\"message\": \"Hello World from REST API!\"}";
                t.getResponseHeaders().add("Content-Type", "application/json");
                t.sendResponseHeaders(200, jsonResponse.length());
                OutputStream os = t.getResponseBody();
                os.write(jsonResponse.getBytes());
                os.close();
            } else {
                String response = "Method Not Allowed";
                t.sendResponseHeaders(405, response.length());
                OutputStream os = t.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }
}
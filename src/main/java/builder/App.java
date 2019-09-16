package builder;

public class App {
    public static void main(String[] args) {
        CachoraoMaringa cachoraoMaringa = new CachoraoMaringa.Builder(10)
                .queijo()
                .tomate()
                .bacon()
                .build();
    }
}

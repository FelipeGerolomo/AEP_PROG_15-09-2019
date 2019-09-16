package builder;

public class CachoraoMaringa {
    private int tamanho;
    private boolean queijo;
    private boolean tomate;
    private boolean bacon;

    public static class Builder {
        private final int tamanho;
        private boolean queijo = false;
        private boolean tomate = false;
        private boolean bacon = false;

        public Builder(int tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijo() {
            queijo = true;
            return this;
        }

        public Builder tomate() {
            tomate = true;
            return this;
        }

        public Builder bacon() {
            bacon = true;
            return this;
        }

        public CachoraoMaringa build() {
            return new CachoraoMaringa(this);
        }

    }

    private CachoraoMaringa(Builder builder) {
        tamanho = builder.tamanho;
        queijo = builder.queijo;
        tomate = builder.tomate;
        bacon = builder.bacon;
    }
}

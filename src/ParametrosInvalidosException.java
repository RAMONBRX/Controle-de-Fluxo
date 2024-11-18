public class ParametrosInvalidosException extends IllegalArgumentException {
    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

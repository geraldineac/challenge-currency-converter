import java.util.InputMismatchException;

public class ErrorIngresoValorException extends InputMismatchException {
    private String mensaje;

    public ErrorIngresoValorException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}

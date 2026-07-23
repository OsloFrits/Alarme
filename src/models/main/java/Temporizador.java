import java.time.LocalTime;

public interface Temporizador {
    LocalTime temporizador = LocalTime.now();
    boolean estaAtiva = false;
    public void iniciarTemporizador();
    public void finalizarTemporizador();
}

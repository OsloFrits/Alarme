import java.time.LocalTime;

public class Pomodoro extends Evento {
    LocalTime tempoDeFoco, tempoDeDescanso;
    boolean pausa;

    public Pomodoro(String nome, String descricao, int pontuacao, LocalTime tempoDeFoco, LocalTime tempoDeDescanso) {
        super(nome, descricao, pontuacao);
        this.tempoDeFoco = tempoDeFoco;
        this.tempoDeDescanso = tempoDeDescanso;
        this.pausa = false;
    }

    public LocalTime getTempoDeFoco() {
        return tempoDeFoco;
    }

    public void setTempoDeFoco(LocalTime tempoDeFoco) {
        this.tempoDeFoco = tempoDeFoco;
    }

    public LocalTime getTempoDeDescanso() {
        return tempoDeDescanso;
    }

    public void setTempoDeDescanso(LocalTime tempoDeDescanso) {
        this.tempoDeDescanso = tempoDeDescanso;
    }

    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }
}

package logica;

public abstract class Partida {
    private Date fecha;
    private String tipoPartida;
    private String resultado;
    private ArrayList<String> eventos;

    public Partida(Date fecha, String tipoPartida, String resultado, ArrayList<String> eventos) {
        this.fecha = fecha;
        this.tipoPartida = tipoPartida;
        this.resultado = resultado;
        this.eventos = new ArrayList<>(eventos);
    }

  
}

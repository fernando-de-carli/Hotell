import java.util.Date;

public class Reserva {
    String nomeHospede;
    Date dataCheckIn;
    Date dataCheckOut;
    int numeroQuarto;
    String tipoQuarto;

    public Reserva(String nomeHospede, Date dataCheckIn, Date dataCheckOut, int numeroQuarto, String tipoQuarto) {
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
    }

    public void exibirDetalhes() {
        System.out.println("Hóspede: " + nomeHospede + " - Quarto: " + numeroQuarto + " (" + tipoQuarto + ")");
        System.out.println("Check-in: " + dataCheckIn + " - Check-out: " + dataCheckOut);
    }
}
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
    List<Quarto> quartos = new ArrayList<>();
    List<Reserva> reservas = new ArrayList<>();

    public void cadastrarQuarto(int numero, String tipo, double preco, boolean disponivel) {
        quartos.add(new Quarto(numero, tipo, preco, disponivel));
    }

    public void cadastrarReserva(String nomeHospede, Date checkIn, Date checkOut, int numeroQuarto, String tipoQuarto) {
        reservas.add(new Reserva(nomeHospede, checkIn, checkOut, numeroQuarto, tipoQuarto));
        atualizarDisponibilidadeQuarto(numeroQuarto, false); // Marca o quarto como ocupado
    }

    public void realizarCheckIn(int numeroQuarto) {
        atualizarDisponibilidadeQuarto(numeroQuarto, false);
        System.out.println("Check-in realizado para o quarto " + numeroQuarto);
    }

    public void realizarCheckOut(int numeroQuarto) {
        atualizarDisponibilidadeQuarto(numeroQuarto, true);
        System.out.println("Check-out realizado para o quarto " + numeroQuarto);
    }

    public void gerarRelatorioOcupacao() {
        System.out.println("Relatório de Ocupação:");
        for (Quarto quarto : quartos) {
            if (!quarto.disponivel) {
                quarto.exibirDetalhes();
            }
        }
    }

    public void gerarHistoricoReservas(String nomeHospede) {
        System.out.println("Histórico de Reservas para: " + nomeHospede);
        for (Reserva reserva : reservas) {
            if (reserva.nomeHospede.equals(nomeHospede)) {
                reserva.exibirDetalhes();
            }
        }
    }

    private void atualizarDisponibilidadeQuarto(int numero, boolean disponivel) {
        for (Quarto quarto : quartos) {
            if (quarto.numero == numero) {
                quarto.disponivel = disponivel;
            }
        }
    }
}
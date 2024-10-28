import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        hotel.cadastrarQuarto(101, "solteiro", 150.00, true);
        hotel.cadastrarQuarto(102, "casal", 200.00, true);
        hotel.cadastrarQuarto(103, "suite", 300.00, true);

        while (true) {
            System.out.println("1. Cadastrar Reserva");
            System.out.println("2. Realizar Check-in");
            System.out.println("3. Realizar Check-out");
            System.out.println("4. Gerar Relatório de Ocupação");
            System.out.println("5. Gerar Histórico de Reservas");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do hóspede:");
                    String nomeHospede = scanner.next();
                    System.out.println("Data de Check-in (dd/MM/yyyy):");
                    Date checkIn = formatoData.parse(scanner.next());
                    System.out.println("Data de Check-out (dd/MM/yyyy):");
                    Date checkOut = formatoData.parse(scanner.next());
                    System.out.println("Número do quarto:");
                    int numeroQuarto = scanner.nextInt();
                    System.out.println("Tipo de quarto:");
                    String tipoQuarto = scanner.next();
                    hotel.cadastrarReserva(nomeHospede, checkIn, checkOut, numeroQuarto, tipoQuarto);
                    break;

                case 2:
                    System.out.println("Número do quarto para check-in:");
                    numeroQuarto = scanner.nextInt();
                    hotel.realizarCheckIn(numeroQuarto);
                    break;

                case 3:
                    System.out.println("Número do quarto para check-out:");
                    numeroQuarto = scanner.nextInt();
                    hotel.realizarCheckOut(numeroQuarto);
                    break;

                case 4:
                    hotel.gerarRelatorioOcupacao();
                    break;

                case 5:
                    System.out.println("Nome do hóspede para histórico:");
                    nomeHospede = scanner.next();
                    hotel.gerarHistoricoReservas(nomeHospede);
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

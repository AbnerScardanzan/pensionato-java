import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cliente[] quartos = new Cliente[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            sc.nextLine(); // Limpa o buffer do teclado após o nextInt()
            
            System.out.print("Nome: ");
            String Nome = sc.nextLine();
            
            System.out.print("Email: ");
            String Email = sc.nextLine();
            
            System.out.print("Quarto (1 a 10): ");
            int numeroQuarto = sc.nextInt();

            while (numeroQuarto < 1 || numeroQuarto > 10) {
                System.out.println("Quarto inválido, digite números de 1 a 10");
                numeroQuarto = sc.nextInt();
            }

            // Instancia o cliente e guarda direto no vetor na posição/quarto informada
            quartos[numeroQuarto] = new Cliente(Nome, Email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}

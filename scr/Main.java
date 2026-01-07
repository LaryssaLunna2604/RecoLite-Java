import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecoModel model = new RecoModel();

        System.out.print("Digite uma categoria (livros, jogos): ");
        String categoria = scanner.nextLine();

        model.recomendar(categoria);
        scanner.close();
    }
}

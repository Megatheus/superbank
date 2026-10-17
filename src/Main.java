import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        List<Usuario> usuario = new ArrayList<>();

        usuario.add(new Usuario("Ronaldo","faaaaaaah"));
        usuario.add(new Usuario("Gelado","fica frio ai"));
        usuario.add(new Usuario("Cristiano","de bicicleta minha nossaaaaaa"));
        usuario.add(new Usuario("Kratos","Oh meu Deus, o que eu fiz?"));
        usuario.add(new Usuario("Vector","AEEEEEEEEEEEE"));
   
        boolean loginSucesso = false;

        while (!loginSucesso) {
            System.out.println("=== TELA DE LOGIN ===");
            System.out.print("Digite o usuário: ");
            String usuarioDigitado = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            boolean usuarioEncontrado = false;

            for (Usuario credencial : usuario) {
                String login = credencial.getLogin();
                String senha = credencial.getSenha();

                if (login.equals(usuarioDigitado) && senha.equals(senhaDigitada)) {
                    usuarioEncontrado = true;
                    break;
                }
            }

            if (usuarioEncontrado) {
                System.out.println("\nLogin realizado com sucesso! Bem-vindo(a), " + usuarioDigitado + "!\n");
                loginSucesso = true;
            } else {
                System.out.println("\nUsuário ou senha incorretos. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}

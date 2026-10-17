import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        List<Usuario> usuario = new ArrayList<>();

        {
            System.out.println("\n === MENU PRINCIPAL ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Entrar");
            System.out.println("3 - Sair");

        boolean cadastroSucesso = false;

        while(!cadastroSucesso){

            System.out.println("/n === TELA DE CADASTRO ===");
            System.out.println("Digite o usuário:");
            String usuarioDigitado = scanner.nextLine();
            System.out.println("Digite a senha:");
            String senhaDigitada = scanner.nextLine();

            boolean usuarioExistente = false;

            for(Usuario credencial : usuario){
                String login = credencial.getLogin();
                String senha = credencial.getSenha();

                if(login.equals(usuarioDigitado)){
                    usuarioExistente = true;
                    break;
                }
            }

            if(usuarioExistente){
                System.out.println("\nUsuário já existe. Tente novamente. \n");
            } else {
                usuario.add(new Usuario(usuarioDigitado, senhaDigitada));
                System.out.println("Cadastro realizado com sucesso!\n");
                cadastroSucesso = true;
                break;
            }

        }
    }
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

package AulaCarro;

/*import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Carro car = new Carro();
        int acao;

        System.out.println("Digite a marca do carro:");
        String marca = teclado.nextLine();
        car.setMarca(marca);

        System.out.println("Digite o modelo do carro:");
        String modelo = teclado.nextLine();
        car.setModelo(modelo);

        do{
            System.out.println("\n O que deseja fazer com seu carro?");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Parar");
            System.out.println("3 - Mudar marcha");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            acao = teclado.nextInt();

            switch(acao){

                case 1:
                    System.out.println("\n Digite a velocidade do carro:");
                    double acelerar = teclado.nextDouble();
                    double velocidadeAtual = car.acelerar(acelerar);
                    System.out.println("Velocidade atual:" + velocidadeAtual);
                    break;

                case 2:
                    double velocidadeatual = car.parar(0);
                    System.out.println("Carro parado, velocidade atual:" + velocidadeatual);
                    break;

                case 3:
                    System.out.println("Digite a marcha do Carro: ");
                    int marcha = teclado.nextInt();
                    car.marcha(marcha);
                    System.out.println("Marcha atual:" + car.getMarcha());
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }while (acao != 4);
    }
}
*/
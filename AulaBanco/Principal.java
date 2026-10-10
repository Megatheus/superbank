package AulaBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Principal {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        List<Simulacaolog> usuarios = new ArrayList<>();  
               
        usuarios.add(new Simulacaolog("bruno", "123"));
        usuarios.add(new Simulacaolog("amanda", "456"));
        usuarios.add(new Simulacaolog("rosiane", "789"));
        usuarios.add(new Simulacaolog("marco", "012"));
        usuarios.add(new Simulacaolog("pedro", "345"));
 
        System.out.println("Digite o usuário");
        String usuarDigitado = scanner.nextLine();
        System.out.println("Digite a senha");
        String senhaDigitada = scanner.nextLine();
 
       // boolean usuarioEncontrado = false;
 
       
        for(Simulacaolog u : usuarios) {
            if(usuarDigitado.equals(u.getLogin()) && senhaDigitada.equals(u.getSenha())) {
                System.out.println("Usuário encontrado: " + u.getLogin());
              //  usuarioEncontrado = true;
                break;
            }
 
          /*
 
   
 
        usuario.add("bruno");
        usuario.add("amanda");
        usuario.add("rosiane");
        usuario.add("marco");
        usuario.add("pedro");
 
     
 
 
        //   System.out.println("Qual é o usuario que você deseja buscar?");
        //   String user = scanner.nextLine();
 
 
        for(String u : usuario) {
            System.out.println("Usuário: " + u);
 
        }
 
 
         
 
           int i = 0;
 
           while(i < usuario.size()) {
             if(user.equals(usuario.get(i))) {
                System.out.println("Achou o usuário: " + usuario.get(i));
                break;
             } else {
                System.out.println("Não é o usuário: " + usuario.get(i));
             }
             i++;
 
           }
 
         
 
        for(int i=0;i<usuario.size();i++){
 
            if(user.equals(usuario.get(i))) {
                System.out.println("Achou o usuário: " + usuario.get(i));
                break;
            } else {
                System.out.println("Não é o usuário: " + usuario.get(i));
            }
           // System.out.println("Usuário: " + usuario.get(i));
        }
 
*/
 
 
 
       // Lacos la = new Lacos();
 
 
       // la.lacopara();
 
       // la.facaenquanto(12);
 
       //la.usecase("banana");
 
 
 
 
 
        /*
        Scanner scanner = new Scanner(System.in);
 
        Calculos ca = new Calculos();
 
        System.out.println("Escolha a opção entre 1-4");
        int escolha = scanner.nextInt();
 
 
        if(escolha > 0 && escolha < 5 ){
 
        System.out.println("Digite o primeiro número");
        int n1 = scanner.nextInt();
        ca.setNum1(n1);
 
        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();
        ca.setNum2(n2);
 
        }
 
 
        //Laço case - escolha então
        switch (escolha) {
 
            case 1:
                System.out.println("Você escolheu somar:" + ca.soma(ca.getNum1(), ca.getNum2()));
 
                        double total = ca.soma(ca.getNum1(), ca.getNum2());
 
                        if(total > 17) {
                            System.out.println("Ele pode dirigir!");
                        } else {
                            System.out.println("É menor de idade");
                        }
 
 
                break;
 
            case 2:
                System.out.println("Você escolheu subtrair:" + ca.subtracao(ca.getNum1(), ca.getNum2()));
                break;
 
            case 3:
                System.out.println("Você escolheu multiplicação:" + ca.multiplicacao(ca.getNum1(), ca.getNum2()));
                break;
 
            case 4:
                System.out.println("Você escolheu divisão:" + ca.divisao(ca.getNum1(), ca.getNum2()));
                break;
           
 
            default: System.out.println("Nenhuma das opções!");
                break;
        }
 
        */
 
       
    }
   
}
}

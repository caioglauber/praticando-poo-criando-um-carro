
package carro;

import java.util.Scanner;

public class Main {
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        
        int opcao ;
        
        do{
            System.out.println("-------------------------------------------");
            System.out.println("\n1 - Ligar Carro");
            System.out.println("2 - Desligar Carro");
            System.out.println("3 - Acelerar Carro");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar a Esquerda");
            System.out.println("6 - Virar a Direita");
            System.out.println("7 - Verificar Velocidade");
            System.out.println("8 - Trocar Marcha");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            
            System.out.println("-------------------------------------------");
            
            switch(opcao){
                case 1-> carro.ligarCarro();
                case 2-> carro.desligarCarro();
                case 3-> carro.acelerarCarro();
                case 4-> carro.diminuirVelocidade();
                case 5-> carro.virarEsquerda();
                case 6-> carro.virarDireita();
                case 7-> carro.verificarVelocidade();
                case 8-> carro.trocarMarcha();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao Invalida!");
            }
            
        }while(opcao != 0);
    }
    
}

package menuOpcoes;

import java.util.Scanner;

public class menuOpcoes {

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                String opcao = "";
         
                    System.out.println("Selecione uma opção:");
                    System.out.println("1 - Calcular média aritmética");
                    System.out.println("2 - Calcular média ponderada");
                    System.out.println("3 - Sair");
   
                    opcao = scanner.next();
   
                    switch (opcao){
                        case "1":
                            somatoria mediaAritmetica = new somatoria();
                            System.out.print("Digite a nota 1: ");
                            float nota1 = scanner.nextFloat();
                            System.out.print("Digite a nota 2: ");
                            float nota2 = scanner.nextFloat();
                            System.out.println("Média aritmética é: " + mediaAritmetica.calcAritmetica(nota1, nota2));
                            break;
                        case "2":
                            somatoria mediaPonderada = new somatoria();
                            System.out.print("Digite a nota 1: ");
                            float notap1 = scanner.nextFloat();
                            System.out.print("Digite o peso da nota 1: ");
                            int peso1 = scanner.nextInt();
                            System.out.print("Digite a nota 2: ");
                            float notap2 = scanner.nextFloat();
                            System.out.print("Digite o peso da nota 2: ");
                            int peso2 = scanner.nextInt();
                            System.out.print("Digite a nota 3: ");
                            float notap3 = scanner.nextFloat();
                            System.out.print("Digite o peso da nota 3: ");
                            int peso3 = scanner.nextInt();
                            System.out.println("Média ponderada é: " + mediaPonderada.calcPonderada(notap1, peso1, notap2, peso2, notap3, peso3));
                            break;
                        case "3":
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida! Tente Novamente...");
                    }
            }
        }
 }
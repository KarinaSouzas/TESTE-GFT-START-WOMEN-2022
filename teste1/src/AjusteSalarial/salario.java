import java.util.Scanner;

public class salario {
    
    public static void main(String[] args) {
        
        System.out.println("Digite o seu salario");

        try (Scanner teclado = new Scanner(System.in)) {
            double salario = teclado.nextDouble();

            if (salario <= 280.00) {
                System.out.println("Salario antes do ajuste " + salario);
                System.out.println("Você teve um aumento de 20%");
                System.out.println("O valor do aumento foi de : " + (salario * 20 /100));
                System.out.println("Se novo salário é de: " + (salario + (salario / 100 * 20)));
                

            }  else if (salario >= 280.00 && salario < 700.00) {
                System.out.println("Salario antes do ajuste " + salario);
                System.out.println("Você teve um aumento de 15%");
                System.out.println("O valor do aumento foi de : " + (salario * 15 /100));
                System.out.println("Se novo salário é de: " + (salario + (salario / 100 * 15)));

                } else if (salario >= 700.00 && salario < 1500.00) {
                    System.out.println("Salatio antes do ajuste " + salario);
                    System.out.println("Você teve um aumento de 10%");
                    System.out.println("O valor do aumento foi de : " + (salario * 10 /100));
                    System.out.println("Seu novo salário é de: " + (salario + (salario / 100 * 10)));

                    } else if (salario >= 1500) {
                        System.out.println("Salario antes do ajuste " + salario);
                        System.out.println("Você teve um aumento de 5%");
                        System.out.println("O valor do aumento foi de : " + (salario * 5 /100));
                        System.out.println("Seu novo salário é de: " + (salario + (salario / 100 * 5)));

                        } else
                            System.out.println("Favor inserir um Valor Válido");
        }
    }
}


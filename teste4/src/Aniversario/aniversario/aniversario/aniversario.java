package aniversario;

import java.util.Scanner;

public class aniversario {
    public static void main(String[] args) {
       
        int dia;
        double mes;
        double ano;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite dia do aniversario: ");
            dia= entrada.nextInt();
            
            System.out.println("Digite o mês do aniversario: ");
            mes = entrada.nextDouble();
            
            System.out.println("Digite o ano do aniversario: ");
            ano = entrada.nextDouble();
        }
        if(dia >= 31){
            System.out.println("Dia invalido");
        }
            else if (mes > 12){
                System.out.println("Mes invalido");
            }            
                else if( ano > 2000 ){
                 System.out.println("Ano invalido\n");
                }
                 else 
                    System.out.println("Data valida");
    }
}

package aniversario;

import java.util.Scanner;

public class aniversario {
    public static void main(String[] args) {
        
        Scanner diaAniversario = new Scanner(System.in);
        System.out.println("Digite o dia do seu aniversario: ");
        double dia = diaAniversario.nextDouble();
        Scanner mesAniversario = new Scanner(System.in); 
        System.out.println("Digite o mês do seu aniversario: ");
        double mes = mesAniversario.nextDouble();
        Scanner anoAniversario = new Scanner(System.in);
        System.out.println("Digite o ano do seu aniversario: ");
        double ano = anoAniversario.nextDouble();
    

        if(diaAniversario >= 31){
            System.out.println("Dia invalido");
        }
            else if (mesAniversario > 12){
                System.out.println("Mes invalido");
            }            
                else if( anoAniversario > 2000 ){
                 System.out.println("Ano invalido\n");
                }
                 else 
                    System.out.println("Data valida");
    }
}

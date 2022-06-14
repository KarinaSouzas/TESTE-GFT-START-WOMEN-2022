package pessoas;

import java.util.Scanner;
public class pessoa {    
       public static void main(String[] args) {
    
        
        float media, pessoas190, pessoas150;
        media=0;
        pessoas190=0;
        pessoas150=0;
        int idade = 0;
        double altura;
        double peso;
        int cont;
        cont=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma idade");
        idade = entrada.nextInt();
        
        while (idade > 0)
        {
            System.out.println("Digite uma altura");
            altura = entrada.nextDouble();
            
            System.out.println("Digite um peso");
            peso = entrada.nextDouble();
         
        if (peso>90 && altura<1.50)
            {
                pessoas150++;
            }
            if (idade<30 && altura>1.90)
            {
                pessoas190++;
            }
            
            for (int i = 0; i <= 10; i++) {
                idade++;
                media = idade / cont;
            }
            
            break; 
        }
        
        System.out.printf(" A media de idade das pessoas é: %.2f", media);
        System.out.printf(" Quantidade de pessoas com peso superior a 90kg e altura inferior a 1,50 metros:%.f", pessoas150);
        System.out.printf(" Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90:%.f", ((pessoas190/idade)*100));
        }
}

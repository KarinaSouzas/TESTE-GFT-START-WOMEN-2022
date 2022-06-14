package pessoas;

import java.util.Scanner;
public class pessoa {    
       public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            
            int idade, cont = 1;
            double altura, somaAltura = 0, alturas = 0, peso;
            int idades = 0, pesos = 0;
            
            do{
                System.out.println("Digite uma idade");
                idade = entrada.nextInt();
                
                System.out.println("Digite uma altura");
                altura = entrada.nextDouble();
                
                System.out.println("Digite um peso");
                peso = entrada.nextDouble();
                
                if(idade > 50){
                    idades++; 
                }
                
                if( (idade >= 10) && (idade <= 20) ){
                    altura++;  
                    somaAltura = altura + somaAltura; 
                }
                
                if(peso < 40){
                    pesos++;    
                }
                
                cont++;
                System.out.println("\n");
            }while(cont <= 4);
            
            if(idades > 0){
                System.out.println("Qntde de pessoas com idade acima de 50 anos: " + idades + "\n");
            } else{
                System.out.println("Nenhuma pessoa tem acima de 50 anos \n");
            }
            
            if(alturas > 0){
                System.out.println("A média de pessoas entre 10 e 20 anos é: " + (somaAltura / alturas) + "\n");
            } else{
                System.out.println("Nenhuma pessoa tem idade entre 10 e 20 anos \n");
            }
            
            if(pesos > 0){
                System.out.println("A percentagem de pessoas com peso inferior a 40 é: " + (pesos * 100 / (cont - 1)) + " %");
            } else{
                System.out.println("Nenhuma pessoa tem peso inferior a 40 kilos");
            }
        }
    }


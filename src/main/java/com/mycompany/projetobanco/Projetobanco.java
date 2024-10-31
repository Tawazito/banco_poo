
package com.mycompany.projetobanco;
import java.util.Scanner;
public class Projetobanco {

    public static void main(String[] args) {
        
        Scanner scan;
        scan = new Scanner(System.in);
                    
            
        
        //sistema bancário simples
        var saldo = 0.0;
        int opcao = scan.nextInt();
        do {
            System.out.println("o que vc deseja fazer?");
            System.out.println("1 - ver saldo");
            System.out.println("2 - sacar dinheiro");
            System.out.println("3 - depositar dinheiro");
            System.out.println("4 - seu filho da puta");
            opcao = scan.nextInt();
            
            
            
            //opção 1 - ver saldo
        if (opcao == 1) {
            System.out.println("seu saldo e: " + saldo + "\nfilho da puta");
        }
        // opção 2 - sacar dinheiro
        else if (opcao == 2) {
            System.out.println("digite o valor a sacar:");
            double saque = scan.nextDouble();
            //verifica se tem saldo na conta
            if (saque <= saldo ) {
                saldo -= saque;
                System.out.println("seu novo saldo e: " + saldo);
            } else {
                System.out.println("você não possui saldo suficiente seu filho da puta");
            }
        }
        //opção 3 - depositar dinheiro
        else if (opcao == 3) {

            System.out.println("digite o valor a depositar: ");
            double deposito = scan.nextDouble();
            saldo += deposito;
            System.out.println("seu novo saldo e: " + saldo);
        }
       //se digitar numero > 4 - xingamento gratuito
       else if (opcao > 4) {
           System.out.println(" so e permitio numero ate o 4, seu arrombado");

       }
       //se digitar numero < 1 - xingamento gratuito
       else if (opcao < 1) {
           System.out.println("vaza daqui seu arrombado de merda filho da puta");

       }
        //padrão caso não seja digitado nenhum dos numeros acima - xingamento gratuito
        else {

            System.out.println("vaza daqui seu arrombado de merda filho da puta");
            
        }
        

        scan.close();      
        } 
       
        while (opcao!=4);{
            System.out.println("adeus.");
        }
    }
}
    


package exercicio1;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

    int num1;
    int num2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("*CALCULADORA*");
        System.out.print("informe qual operacao deseja utilizar [1]adicao, [2]subtracao, [3]multiplicacao, [4]divisao:");
        int escolha = leitor.nextInt();

        switch(escolha){
            case 1: 
            System.out.println("você escolheu adicao!");

            System.out.print("informe o primeiro numero: ");

            num1 = leitor.nextInt();

            System.out.print("informe o segundo numero: ");

            num2 = leitor.nextInt();

            Calculadora calculo1 = new Calculadora(num1,num2);

            calculo1.somar();

            break;

            case 2:
            System.out.println("você escolheu subtracao!");

            System.out.print("informe o primeiro numero: ");

            num1 = leitor.nextInt();

            System.out.print("informe o segundo numero: ");

            num2 = leitor.nextInt();
            
            Calculadora calculo2 = new Calculadora(num1, num2);

            calculo2.subtrair();
            
            break;

            case 3:
            System.out.println("você escolheu multiplicacao!");

            System.out.print("informe o primeiro numero: ");

            num1 = leitor.nextInt();

            System.out.print("informe o segundo numero: ");

            num2 = leitor.nextInt();
            
            Calculadora calculo3 = new Calculadora(num1, num2);

            calculo3.multiplicar();
            break;

            case 4:
            System.out.println("você escolheu divisao!");

            System.out.print("informe o primeiro numero: ");

            num1 = leitor.nextInt();

            System.out.print("informe o segundo numero: ");

            num2 = leitor.nextInt();

            Calculadora calculo4 = new Calculadora(num1, num2);

            calculo4.dividir();
            break;

            default:
            System.out.println("erro!");
            break;  

        }

        leitor.close();
    }
    
}

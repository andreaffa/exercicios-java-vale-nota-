package exercicio1;

public class Calculadora{

    int num1, num2;
    
    public Calculadora(int n1,int n2){

       num1=n1;
       num2=n2;
    }

    public void somar(){

        System.out.println("o resultado e: "+ (num1 + num2));
    
        }
    
    public void subtrair() {

        System.out.print("o resultado e: "+ (num1 - num2));
    }

    public void multiplicar() {

        System.out.print("o resultado e: "+ (num1 * num2));
    }

    public void dividir() {

        System.out.print("o resultado e: "+ (num1 / num2));
    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int x;
        
        Scanner scan=new Scanner(System.in);
        
        do{
            System.out.print("Digite um numero inteiro positivo: ");
            x = scan.nextInt();
        } while(x<0);
        
        System.out.println(Fibonacci.funcao(x));
        
    }
}

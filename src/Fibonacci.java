/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wguer
 */
public class Fibonacci {
    public static String funcao(int x){
        int base = 1;
        int antes = 1;
        int próximo = 0;
        boolean teste = false;
        
        while(próximo <= x){

            System.out.print(próximo + " ");

            if(x == próximo)
                teste = true;

            base = próximo;
            próximo += antes;
            antes = base;
        }
        
        System.out.println();
        
        if (teste == true)
            return  "O numero inserido faz parte da sequencia de Fibonacci";
        else
            return "O numero inserido não faz parte da sequencia de Fibonacci";
    }
}

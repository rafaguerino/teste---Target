/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wguer
 */
import java.util.Scanner;
public class Inversor {
    
    public static void StringInverte(){

        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        str = scan.nextLine();

        System.out.print("String invertida: ");

        for(int i=str.length(); i>0 ; --i)
        {
            System.out.print(str.charAt(i-1));
        }

    }
}

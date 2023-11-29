/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogos_mvh;

import java.util.Scanner;

/**
 *
 * @author rosa.3950
 */
public class Jogos_MvH {

    public static void main(String[] args) {
        Scanner sc =  new  Scanner (System.in);
        
        System.out.println("Digte a senha : "); 
        String senha = JOptionpane.
         int   contador =1;
         
        while(!senha.equals("senha123") && contador<=2) { 
           System.out.println("SENHA INCORRETA ,  Tente Novamente : \nTentativas Restantes : " +(3-contador));
           contador++;
           senha=sc.next();
           
        }
        System.out.println();
        if(senha.equals("senha567")) {
         System.out.println("ACESSO PERMITIDO");    
        }else{
            System.out.println("ACESSO NEGADO  (SENHA INCORRETA)");           
        }
        
        sc.close();
    }
}

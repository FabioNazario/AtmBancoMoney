
package br.edu.infnet.atmbancomoney.util;

import java.io.Console;
import static java.lang.System.in;
import java.util.Scanner;



public class TelaUtil{

    public static void limparTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public static void exibirAperteEnterParaContinuar() {
        
        System.out.println("\n\n Pressione ENTER para continuar...");
         
        Scanner s = new Scanner(System.in);
        s.nextLine();
        limparTela();
    }
    
    public static String montarTituloTela(String titulo){
        
        String aux = titulo.replaceAll(".", "-");
        
        titulo = "+---------------" +  aux   + "---------------+\n"
                +"|               " + titulo + "               |\n" 
                +"+---------------" +  aux   + "---------------+\n\n";
        
        return titulo;
    }
    
    
}

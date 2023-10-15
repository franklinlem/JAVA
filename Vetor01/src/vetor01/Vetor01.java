/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author franklin
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // int n[] = new int[4];
        int n[] = {3,2,7,8,9,1};
        System.out.println("Total de casas de N é " + n.length);
        
        for(int c=0; c<=n.length-1; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}

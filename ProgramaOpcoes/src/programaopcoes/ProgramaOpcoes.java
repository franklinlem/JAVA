/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaopcoes;

import java.util.Scanner;

/**
 *
 * @author franklin
 */
public class ProgramaOpcoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Menu - Digite uma opção de 1-4");
        int opcao = tec.nextInt();
        String tipo;
        System.out.print("Você escolheu a opção: ");
        switch (opcao){
            case 1:
                tipo = "abrir";
                break;
            case 2:
                tipo = "salvar";
                break;
            case 3:
                tipo = "editar";
                break;
            case 4:
                tipo = "sair";
                break;
            default:
                tipo = "visualizar";
        }
        System.out.println(tipo);
    }
    
}

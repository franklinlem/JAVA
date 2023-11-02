/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaiterator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author franklin
 */
public class Aulaiterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TreeSet<String> dset = new TreeSet<String>();

        dset.add("Zoraide");

        dset.add("Maria");

        dset.add("Janete");

        dset.add("João");

        dset.add("Heitor");

        Iterator<String> iterator = dset.iterator();

        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");

        }
        // TODO code application logic here
    }
    
}

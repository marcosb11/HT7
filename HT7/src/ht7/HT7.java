/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht7;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author marcosb11
 */
public class HT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree arbol =new BinaryTree(null);
        String entrada = "";
        int posicion = 0;
        String palabra[] = new String [2];
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){ //lee file txt linea por linea
            while((entrada = br.readLine()) != null){ //si encuentra un enter se almacena la linea en entrada
                System.out.println("Diccionario.txt: " + entrada); //se imprime lo que se ingreso
                entrada = entrada.toLowerCase();
                TreeMap<String, String> word = new TreeMap();
                
                for(int x = 1; x<entrada.length(); x++){
                    if(entrada.charAt(x)==',')
                    {
                        posicion=x;
                    }
                }
                palabra[0]=entrada.substring(1, posicion);
                palabra[1]=entrada.substring(posicion+1, entrada.length()-1);
                word.put(palabra[0], palabra[1]);
                
                
            }
        }catch (Exception e){
            
        }
    }
    
}

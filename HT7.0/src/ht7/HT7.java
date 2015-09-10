/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht7;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

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
        TreeMap<String, String> word[];
        String palabra[][];
        String entrada = "";
        String entry="";
        int posicion = 0;
        int linea = 0;
        
        try(BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))){ //lee file txt linea por linea
            while((entrada = br.readLine()) != null){
                linea++;
            }
        }catch (Exception e){
            
        }
        palabra = new String[linea][2];
        linea = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))){ //lee file txt linea por linea
            while((entrada = br.readLine()) != null){ //si encuentra un enter se almacena la linea en entrada
                System.out.println("Diccionario.txt: " + entrada); //se imprime lo que se ingreso
                entry = entrada.toLowerCase();
                for(int x = 1; x<entry.length(); x++){
                    if(entry.charAt(x)==','){
                        posicion=x;
                    }
                }
                palabra[linea][0]=entry.substring(1, posicion);
                palabra[linea][1]=entry.substring(posicion+1, entry.length()-1);
                linea++;     
            }
        }catch (Exception e){
            
        }
        
        word = new TreeMap[linea];
        for(int x=0; x<linea; x++){
            word[x] = new TreeMap();
            word[x].put(palabra[x][0],palabra[x][1]);
        }
        BinaryTree raiz = new BinaryTree(word[0]);
        BinaryTree<Map> nodo[] = new BinaryTree[linea];
        for(int x=1; x<linea; x++){
            nodo[x]= new BinaryTree(word[x]);
            raiz.insert(raiz, nodo[x]);
        }
        
        System.out.println("Utilizando InOrder las palabras ordenadas son: ");
        raiz.PrintInOrder(raiz);
        
        
    }
    
}

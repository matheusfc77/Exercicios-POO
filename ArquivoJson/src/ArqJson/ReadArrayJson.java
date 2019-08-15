/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArqJson;

/**
 *
 * @author Jesiel e Matheus Candido
 */


import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadArrayJson {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileReader fr = new FileReader("arrayjson.json");
        BufferedReader br = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder(); 
        String line;
        while((line = br.readLine()) != null){
             sb = sb.append(line);
             System.out.println(sb);
        }
           
        br.close();
        fr.close();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArqJson;

/**
 *
 * @author Curvello
 */



import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArrayJson {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de valores: ");
		int t = entrada.nextInt();
		
		int[] vet = new int[t];
		
		for (int i = 0; i < t; i++) {
			System.out.print("->");
			vet[i] = entrada.nextInt();
		}
				
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("arrayjson.json");
		writer.write(gson.toJson(vet));
		writer.close();
                entrada.close();
	}
}


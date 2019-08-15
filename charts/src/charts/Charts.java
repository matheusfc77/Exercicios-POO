/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesiel e Matheus Candido
 */
public class Charts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int v[] = new int[8];
        int inicial = 0;
        for (int j = 1; j <= 2; j++) {
            System.out.printf("Insira 4 valores para o %d vetor \n", j);
            for (int i = inicial; i < 4*j; i++) {
                v[i] = in.nextInt();
            } 
            inicial = 4;
        }
        System.out.println(Arrays.toString(v));
        String html = 
            "<html>\n" +
            "  <head>\n" +
            "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
            "    <script type=\"text/javascript\">\n" +
            "      google.charts.load('current', {'packages':['corechart']});\n" +
            "      google.charts.setOnLoadCallback(drawChart);\n" +
            "\n" +
            "      function drawChart() {\n" +
            "        var data = google.visualization.arrayToDataTable([\n" +
            "          ['Year', 'Exercícios Juliano', 'Exercícios Curvêllo'],\n" +
            "          ['50', " + v[0] + "," + v[4] + "],\n" +
            "          ['100',"  + v[1] + "," + v[5] + "],\n" +
            "          ['150', " + v[2] + "," + v[6] + "],\n" +
            "          ['200', " + v[3] + "," + v[7] + "]\n" +
            "        ]);\n" +
            "\n" +
                
            "        var options = {\n" +
            "          title: 'Alunos com depressão',\n" +
            "          hAxis: {title: 'Exercícios por Aula',  titleTextStyle: {color: '#333'}},\n" +
            "          vAxis: {minValue: 0}\n" +
            "        };\n" +
            "\n" +
            "        var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));\n" +
            "        chart.draw(data, options);\n" +
            "      }\n" +
            "    </script>\n" +
            "  </head>\n" +
            "  <body>\n" +
            "    <div id=\"chart_div\" style=\"width: 100%; height: 500px;\"></div>\n" +
            "  </body>\n" +
            "</html>"; 
            File file = new File("demo.html");
            PrintWriter writer;
        try {
            writer = new PrintWriter(file);
             writer.write(html);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Charts.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
        
    }
    
}


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Charts {

	private Gravajson ab = new Gravajson("prog");
	private ArrayList<Double> a = ab.ler();

	public void geragraficocoluna() {
		String html = "<html> <head> <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script><script type=\"text/javascript\"> google.charts.load('current', {'packages':['bar']}); google.charts.setOnLoadCallback(drawChart); function drawChart() { var data =google.visualization.arrayToDataTable([" +
						 "          ['Values', 'Values'],\n";

		for(
		int i = 0;i<a.size();i++)
		{

			html += String.format("['%s', %s], \n", i, a.get(i));
		}

		html+=" ]); var options = { chart: { title: 'Grafico json', subtitle: ' a ', }}; var chart = new google.charts.Bar(document.getElementById('columnchart_material')); chart.draw(data, google.charts.Bar.convertOptions(options)); } </script> </head> <body> <div id=\"columnchart_material\" style=\"width: 800px; height: 500px;\"></div> </body> </html>";

		File file = new File("pizza.html");
		PrintWriter writer;try
		{
			writer = new PrintWriter(file);
			writer.write(html);
			writer.close();
		}catch(
		FileNotFoundException ex)
		{
			Logger.getLogger(Channels.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

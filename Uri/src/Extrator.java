import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Extrator {
	private Usuario usuario;

	public Extrator(String codigo) {
		try {
			usuario = new Usuario();

			URL url = new URL("https://www.urionlinejudge.com.br/judge/en/profile/" + codigo);
			URI uri = url.toURI();

			HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
			httpcon.addRequestProperty("User-Agent", "Mozilla/4.0");
			BufferedReader br = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
			String s;
			while ((s = br.readLine()) != null) {

				if (s.contains("<p itemprop=\"name\">")) {

					String temp = br.readLine().split("</a>")[0];
					s = temp.split("\">")[1];
					usuario.setNome(s);
				}
				if (s.contains("<span>Place:</span>")) {

					s = br.readLine().split("&ordm;")[0].trim();
					if (s.contains("Unknown")) {
						s= s.split("</li>")[0].trim();
						usuario.setPosicao(s);

					} else
						usuario.setPosicao(s);

				} else if (s.contains("<span>Country:</span>")) {

					String temp = br.readLine().split("</a>")[0];
					s = temp.substring(temp.length() - 2);
					if ("i>".equals(s))
						s = "-";
					usuario.setPais(s);

				} else if (s.contains("<span>University:</span>")) {
					String temp = br.readLine().split("</i>")[0];

					s = temp.substring(temp.length() - 3);
					if ("e'>".equals(s))
						s = "";

					usuario.setUniversidade(s);

				} else if (s.contains("<span>Since:</span>")) {

					String temp = br.readLine().split("</i>")[0].trim();
					s = temp.substring(0, temp.length() - 5).trim();
					usuario.setDesde(s);

				} else if (s.contains("<span>Points:</span>")) {

					String temp = br.readLine().split("</i>")[0].trim();
					s = temp.substring(0, temp.length() - 5).trim();
					usuario.setPontos(s);

				} else if (s.contains("<span>Solved:</span>")) {

					String temp = br.readLine().split("</i>")[0].trim();

					s = temp.substring(0, temp.length() - 5).trim();

					usuario.setResolvido(s);

				} else if (s.contains("<span>Tried:</span>")) {

					String temp = br.readLine().split("</i>")[0].trim();
					s = temp.substring(0, temp.length() - 5).trim();
					usuario.setTestado(s);

				} else if (s.contains("<span>Submissions:</span>")) {

					String temp = br.readLine().split("</i>")[0].trim();
					s = temp.substring(0, temp.length() - 5).trim();
					usuario.setSubmissoes(s);

				}

			}
			br.close();
		} catch (MalformedURLException excecao) {
			excecao.printStackTrace();
		} catch (URISyntaxException excecao) {
			excecao.printStackTrace();
		} catch (IOException excecao) {
			excecao.printStackTrace();
		}
	}

	public String uri() {
		return usuario.toString();
	}

}

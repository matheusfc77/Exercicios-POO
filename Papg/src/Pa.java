import java.util.ArrayList;
import java.util.Arrays;

public class Pa {
	private Double mediana, media, somatoria;

	public Double getMediana() {
		return mediana;
	}

	public void setMediana(Double mediana) {
		this.mediana = mediana;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Double getSomatoria() {
		return somatoria;
	}

	public void setSomatoria(Double somatoria) {
		this.somatoria = somatoria;
	}

	public Pa() {

	}

	public String pinalterada() {
		Double aux = 0.0;
		aux = analisaarq()[0];
		if (aux == 1) {
			aux = analisaarqpg()[0];
			aux = (aux / valores.size()) * 100.0;
			this.razao = analisaarqpg()[1];
		} else if (aux != null) {
			aux = (aux / valores.size()) * 100.0;
			this.razao = analisaarq()[1];
		}
		if (aux != 100.0) {
			setTipo(null);
		}
		String a = Double.toString(aux);
		return a;
	}

	public Pa(ArrayList<Double> valores) {
		this.valores = valores;
		descobreTipo();
		descobrevalor();
		descobreQuantidade();
		mediana();
		somatoria();
		analisaarq();
		pinalterada();
	}

	private Progressoes tipo;

	public Progressoes getTipo() {
		return tipo;
	}

	public void setTipo(Progressoes tipo) {
		this.tipo = tipo;
	}

	ArrayList<Double> valores = new ArrayList<Double>();
	double valorinicial, razao, quantidade;

	public ArrayList<Double> getValores() {
		return valores;
	}

	public void setValores(ArrayList<Double> valores) {
		this.valores = valores;
	}

	public double getValorinicial() {
		return valorinicial;
	}

	public void setValorinicial(double valorinicial) {
		this.valorinicial = valorinicial;
	}

	public double getRazao() {
		return razao;
	}

	public void setRazao(double razao) {
		this.razao = razao;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public void geraProg() {
		if (tipo == Progressoes.aritmetica) {
			geraPa();
		} else if (tipo == Progressoes.geometrica) {
			geraPg();
		}
	}

	private void geraPa() {
		ArrayList<Double> pa = new ArrayList<Double>();
		pa.add(valorinicial);
		for (int i = 1; i < quantidade; i++) {
			valorinicial += razao;
			pa.add(valorinicial);
		}
		valores = pa;
	}

	private void geraPg() {
		ArrayList<Double> pg = new ArrayList<Double>();
		pg.add(valorinicial);
		for (int i = 1; i < quantidade; i++) {
			valorinicial = valorinicial * razao;
			pg.add(valorinicial);
		}
		valores = pg;
	}

	private void descobreTipo() {
		for (int i = 1; i < valores.size() - 1; i++) {
			if (valores.get(i + 1) - valores.get(i) == valores.get(i) - valores.get(i - 1)) {
				setTipo(Progressoes.aritmetica);
			} else if (valores.get(i + 1) / valores.get(i) == valores.get(i) / valores.get(i - 1)) {
				setTipo(Progressoes.geometrica);
			}
		}
	}

	private void descobrevalor() {
		valorinicial = valores.get(0);
	}

	private void descobreQuantidade() {
		quantidade = valores.size();
	}

	/**
	 * private void descobrerazao() { if (tipo == Progressoes.aritmetica) { razao =
	 * valores.get(1) - valores.get(0); } else if (tipo == Progressoes.geometrica) {
	 * razao = valores.get(1) / valores.get(0); } }
	 **/

	private void mediana() {
		double[] valOrd = new double[valores.size()]; 
		for (int i = 0; i < valOrd.length; i++)
			valOrd[i] = valores.get(i);
		
		Arrays.sort(valOrd);
		if (valOrd.length % 2 == 1) {
			mediana = valOrd[valOrd.length / 2];
		} else {
			mediana = (valOrd[valOrd.length / 2 - 1] + valOrd[valOrd.length / 2]) / 2;
		}
	}

	private void somatoria() {
		Double a = 0.0;
		for (int i = 0; i < valores.size(); i++) {
			a += valores.get(i);
		}
		somatoria = a;
	}

	public Double[] analisaarqpg() {
		ArrayList<Double> auxs = new ArrayList<Double>();
		Double[] auxer = new Double[valores.size()];
		for (int i = 0; i < auxer.length; i++) {
			auxer[i] = 0.0;
		}
		for (int i = 0; i < valores.size() - 1; i++) {
			Double dom = (Double) (valores.get(i + 1) / valores.get(i));
			if (!(auxs.contains(dom))) {
				auxs.add(dom);
				auxer[i] = auxer[i] + 1;
			} else {
				for (int j = 0; j < auxs.size(); j++) {
					if (auxs.get(j).equals(dom)) {
						auxer[j] = auxer[j] + 1;
					}
				}
			}
		}
		Double maior[] = new Double[2];
		maior[0] = 0.0;
		maior[1] = 0.0;
		for (int i = 0; i < auxer.length; i++) {
			if (auxer[i] > maior[0]) {
				maior[0] = auxer[i].doubleValue() + 1;
				maior[1] = (Double) auxs.get(i);
			}
		}
		return maior;
	}

	public Double[] analisaarq() {
		ArrayList<Double> auxs = new ArrayList<Double>();
		Double[] auxer = new Double[valores.size()];
		for (int i = 0; i < auxer.length; i++) {
			auxer[i] = 0.0;
		}
		for (int i = 0; i < valores.size() - 1; i++) {
			Double dom = (Double) (valores.get(i + 1) - valores.get(i));
			if (!(auxs.contains(dom))) {
				auxs.add(dom);
				auxer[i] = auxer[i] + 1;
			} else {
				for (int j = 0; j < auxs.size(); j++) {
					if (auxs.get(j).equals(dom)) {
						auxer[j] = auxer[j] + 1;
					}
				}
			}
		}
		Double maior[] = new Double[2];
		maior[0] = 0.0;
		maior[1] = 0.0;
		for (int i = 0; i < auxer.length; i++) {
			if (auxer[i] > maior[0]) {
				maior[0] = auxer[i].doubleValue() + 1;
				maior[1] = (Double) auxs.get(i);
			}
		}
		return maior;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		StringBuilder builder = new StringBuilder();
		builder.append("Pa [mediana=");
		builder.append(mediana);
		builder.append(", media=");
		builder.append(media);
		builder.append(", somatoria=");
		builder.append(somatoria);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", valores=");
		builder.append(valores != null ? valores.subList(0, Math.min(valores.size(), maxLen)) : null);
		builder.append(", valorinicial=");
		builder.append(valorinicial);
		builder.append(", razao=");
		builder.append(razao);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
}

public class Usuario {
	private String nome;
	private String posicao;
	private String pais;
	private String universidade;
	private String desde;
	private String pontos;
	private String resolvido;
	private String tentado;
	private String submissoes;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public String getDesde() {
		return desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public String getPontos() {
		return pontos;
	}

	public void setPontos(String pontos) {
		this.pontos = pontos;
	}

	public String getResolvido() {
		return resolvido;
	}

	public void setResolvido(String resolvido) {
		this.resolvido = resolvido;
	}

	public String getTestado() {
		return tentado;
	}

	public void setTestado(String tentado) {
		this.tentado = tentado;
	}

	public String getSubmissoes() {
		return submissoes;
	}

	public void setSubmissoes(String submissoes) {
		this.submissoes = submissoes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append("\nPosição: ");
		builder.append(posicao);
		builder.append("\nPaís: ");
		builder.append(pais);
		builder.append("\nUniversidade: ");
		builder.append(universidade);
		builder.append("\nDesde: ");
		builder.append(desde);
		builder.append("\nPontos: ");
		builder.append(pontos);
		builder.append("\nResolvidos: ");
		builder.append(resolvido);
		builder.append("\nTentados: ");
		builder.append(tentado);
		builder.append("\nSubmissões: ");
		builder.append(submissoes);
		return builder.toString();
	}

	
	

}

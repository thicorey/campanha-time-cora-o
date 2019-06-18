package model;

public class Cadastro {
	
	private long id; 
	private String nomeCampanha;
	private date dataVigencia;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeCampanha() {
		return nomeCampanha;
	}
	public void setNomeCampanha(String nomeCampanha) {
		this.nomeCampanha = nomeCampanha;
	}

	public long getdataVigencia() {
		return dataVigencia;
	}
	public void setId(date dataVigencia) {
		this.dataVigencia = dataVigencia;
	}

}

package fr.esiea.ail.model;

public class Adresse {
	
	private String alias;
	private String numero;
	private String rue;
	private String codepostal;
	private String ville;
	private Integer id;
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getRue() {
		return rue;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public String getCodepostal() {
		return codepostal;
	}
	
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}

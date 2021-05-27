package objetos;

public class Exer4 {
	
	private int id;
	private String name;
	private String login;
	private int senha;
	
	public Exer4() {
		
	}
	
	public Exer4(int id, String name, String login, int senha) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.senha = senha;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public String toString() {
		return "id = " + id + ", name = " + name + ", login = " + login + ", senha = " + senha;
	}
}

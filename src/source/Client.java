/**
 * 
 */
package source;

/**
 * @author 14108849
 *
 */
public class Client {
	
	private static int id = 0;
	
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private String gender;
	
	private int idade;
	
	private boolean associate;

	public Client(String cpf, String gender, int idade) {
		id = id++;
		this.gender = gender;
		this.idade = idade;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAssociate(boolean associate) {
		this.associate = associate;
	}
	
	public void isAssociate(){
		associate = true;
	}
	
	public boolean getAssociate(){
		return associate;
	}
}
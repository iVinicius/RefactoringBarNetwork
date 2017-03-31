/**
 * 
 */
package source;

/**
 * @author 14108849
 *
 */
public interface IBar {
	
	public void registerClient(String cpf, String gender, int idade);
	
	public void registerAssociate(String cpf);
	
	public void registerExit(String cpf);
}

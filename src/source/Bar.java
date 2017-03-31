/**
 * 
 */
package source;

/**
 * @author 14108849
 *
 */
public class Bar implements IBar{
	
	private ClientList clients;
	
	public Bar(){
		clients = new ClientList();
	}

	@Override
	public void registerClient(String cpf, String gender, int idade) {
		Client aux = new Client(cpf, gender, idade);
		clients.addClient(aux);
	}

	@Override
	public void registerAssociate(String cpf) {
		clients.registerAssociate(cpf);	
	}

	@Override
	public void registerExit(String cpf) {
		clients.removeClient(cpf);		
	}	
	
	public int getNumberOfClients(){
		return ClientListAnalytic.currentNumberOfClients(clients);
	}
	
	public String getpercentageByAssociate(){
		return ClientListAnalytic.percentageByAssociate(clients);
	}
}
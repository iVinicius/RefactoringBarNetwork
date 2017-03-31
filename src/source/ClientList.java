/**
 * 
 */
package source;

import java.util.ArrayList;

/**
 * @author 14108849
 *
 */
public class ClientList {
	
	private ArrayList<Client> clients;
	
	public ClientList(){
		clients = new ArrayList<>();
	}
	
	public void addClient(Client client){
		clients.add(client);
	}
	
	public ArrayList<Client> getClients(){
		return clients;
	}
	
	public void registerAssociate(String cpf){
		this.findClient(cpf).setAssociate(true);
	}
	
	public Client findClient(String cpf){
		for(Client c : clients){
			if(c.getCpf().equals(cpf)){
				return c;
			}
		}
		return null;
	}
	
	public int size(){
		return clients.size();
	}
	
	public void removeClient(String cpf){
		clients.remove(this.findClient(cpf));
	}
}
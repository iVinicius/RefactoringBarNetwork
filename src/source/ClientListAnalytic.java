/**
 * 
 */
package source;

/**
 * @author 14108849
 *
 */
public class ClientListAnalytic {

	public static int currentNumberOfClients(ClientList list){
		return list.size();
	}
	
	public static boolean findByCpf(String cpf, ClientList list){
		return list.findClient(cpf) == null ? false : true;
	}
	
	public static String percentageByGender(ClientList list){
		int male = 0;
		int female = 0;
		
		for(Client c : list.getClients()){
			if(c.getGender().equalsIgnoreCase("M")){
				male++;
			} else{
				female++;
			}
		}
		double percentageMale = male % list.size();
		double percentageFemale = female % list.size();
		
		String aux = "Total: " + list.size() + " | Male: %" + String.format("%.2f", percentageMale) + " | Female: %" + String.format("%.2f", percentageFemale);
		
		return aux;
	}
	
	public static String percentageByAssociate(ClientList list){
		int associates = 0;
		
		for(Client c : list.getClients()) if(c.getAssociate()) associates++;
		
		double percentageAssoc = associates % list.size();
		
		String aux = "Total: " + list.size() + " | Associates: %" + String.format("%.2f", percentageAssoc);
		
		return aux;
	}
}
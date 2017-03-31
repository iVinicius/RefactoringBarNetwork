/**
 * 
 */
package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import source.Bar;

/**
 * @author 14108849
 *
 */
public class BarTest {
	
	private Bar bar;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bar = new Bar();
		bar.registerClient("88855", "M", 21);
		bar.registerClient("885", "M", 21);
		bar.registerClient("85455", "F", 21);
		bar.registerClient("88235", "M", 21);
		bar.registerClient("88215", "F", 21);
		bar.registerClient("885655", "M", 21);
		bar.registerClient("88085", "M", 21);
		
		bar.registerAssociate("88855");
		bar.registerAssociate("88215");
	}

	@Test
	public void testSize() {
		Assert.assertEquals(7, bar.getNumberOfClients());
	}
	
	@Test
	public void testAssociatePercentage() {
		Assert.assertEquals("Total: 7 | Associates: %28", bar.getpercentageByAssociate());
	}

}

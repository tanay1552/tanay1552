import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {



	Car a;
	@Before
	public void setUp() throws Exception {
		a=new Car("audi",800);
	}

	@Test
	public void testAddcapacity() {
		a.addcapacity(200);
		assertEquals(a.getcapacity(),1000);
	}


}

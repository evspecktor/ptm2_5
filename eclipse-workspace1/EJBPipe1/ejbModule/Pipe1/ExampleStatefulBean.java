package Pipe1;

import java.util.concurrent.atomic.AtomicInteger;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class ExampleStatefulBean
 */
@Stateful
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class ExampleStatefulBean implements ExampleStatefulBeanRemote, ExampleStatefulBeanLocal {

	private final AtomicInteger counter = new AtomicInteger();
	
	@Override
	public int count() {
		return counter.incrementAndGet();
	}

}

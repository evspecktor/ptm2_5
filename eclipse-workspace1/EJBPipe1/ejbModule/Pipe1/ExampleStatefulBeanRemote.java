package Pipe1;

import javax.ejb.Remote;

@Remote
public interface ExampleStatefulBeanRemote {
	public int count();
}

package Pipe1;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class Pipe1
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class Pipe1 implements Pipe1Remote {

    /**
     * Default constructor. 
     */
    public Pipe1() {
        // TODO Auto-generated constructor stub
    }

}

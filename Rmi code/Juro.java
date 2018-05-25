// define a  class and implement jremote
	import java.rmi.*;
	import java.rmi.server.*;
	
	public clas JURO extends UnicastRemoteObject implements JRemote{
	
	// define th eabstract method of jRemote
	
	pubic String getFullName(String firstname, String lastname) throws RemoteException{
	
	System.out.println("see"+firstname+" "+lastname);
	
	
	return firstname.concat(lastname);
	}
	
	public JURO() throws RemoteException{
		
		
	}
	}
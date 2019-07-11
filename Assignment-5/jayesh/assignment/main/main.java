package jayesh.assignment.main;
import jayesh.assignment.data.*;
import jayesh.assignment.singleton.*;

class MainClass
{
	public static void main(String args[])
	{
		Data d = new Data();
		d.print();
		//d.printlocal();
		/*Local variables cannot be printed as they 
		  are not initialized with any default values*/
          
		Singleton s = Singleton.initialize("Zemoso");
		s.print();
	}
 }

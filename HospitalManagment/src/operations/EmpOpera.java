package operations;

import classes.Emp;
import classes.Manager;

interface  EmpOpera {
	void insertdata(Emp emp);
	
	void deletedata(Emp emp);
	
	void updatedata(Emp emp);
	
	void searchdata(Emp emp);
	
	void showdata(Emp emp);
	
	void Manainsertdata(Manager manager);
	
	void Manadeletedata(Manager manager);
	
	void Manashowdata(Manager manager);
	
}

package OOPs;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class employee3
{
    private String name;
    private int Id;
    private int salary;
    employee3(String name,int Id,int salary)
    {
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }
    void display()
    {	System.out.print(name + "," + Id + "," + salary);    }
    int getSalary()
    {   return salary;    }
}

class emp1 implements Comparator<employee3>
{
	public int compare(employee3 o1, employee3 o2) 
    {
       if(o1.getSalary()> o2.getSalary())
    	   return 1;
       if(o1.getSalary()< o2.getSalary())
    	   return -1;
       return 0;
    }
}
public class Practical10 
{
	public static void main(String[] args) 
	{
		TreeSet<employee3> ts = new TreeSet<>(new emp1());
	    
		ts.add(new employee3("Emp1",101,2000));
	    ts.add(new employee3("Emp2",102,5000));
	    ts.add(new employee3("Emp3",103,10000));
	    ts.add(new employee3("Emp4",104,3000));
	    ts.add(new employee3("Emp5",105,4000));
	    ts.add(new employee3("Emp6",106,6000));
	    
	    Iterator<employee3> itr = ts.iterator();
	    System.out.println("Employee Data(Name,Id,Salary)");
	    while(itr.hasNext())
	    {
	    	employee3 e = itr.next();
	    	System.out.print("<");
	    	e.display();
	    	System.out.print("> ");
	    }
	}
}
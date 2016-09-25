class ingredients
{
	private boolean avail;
    public ingredients()
    {
        avail = true;
    }
    synchronized void takeIngredients(int id)
	{
		while(!avail)
		{
			System.out.println("Smoker " + id + " is waiting for ingredients");
            try{
                wait();
            } catch (InterruptedException ex){
                System.out.println(ex);
            }     
            avail = false;
		}
		
	}
	synchronized void returnIngredients()
	{
		avail = true;
		notify();
	}
}
class smokers extends Thread
{
	private int id;
	ingredients ingd1,ingd2;
	smokers(int id,ingredients ingd1,ingredients ingd2)
	{
		this.id = id;
		this.ingd1 = ingd1;
		this.ingd2 = ingd2;
	}
	public void smoke()
	{
		ingd1.takeIngredients(id);
		ingd2.takeIngredients(id);
		System.out.println("Smoker " + id + " is smoking");
	}
	public void over()
	{
		ingd1.returnIngredients();
		ingd2.returnIngredients();
		System.out.println("Smoker " + id + " completed smoking");
	}
	public void run()
	{
		smoke();
		try{
            Thread.sleep(2000);            
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
		over();
	}
}
public class SmokersProblem 
{
	public static void main(String[] args) 
	{ 
		ingredients[] ingd = new ingredients[3];
		smokers[] smk = new smokers[3];
		for(int i=0;i<3;i++)
			ingd[i] = new ingredients();
		for(int i=0;i<3;i++) 
		{
		    smk[i] = new smokers(i+1, ingd[i], ingd[(i+1)%3]);
		    smk[i].start();
		}	
	}
}
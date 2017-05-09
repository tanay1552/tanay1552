
public class Car {

	private String cname;
	private int ccapacity;

	public Car(String string, int i) {
		// TODO Auto-generated constructor stub
    this.cname=string;
	this.ccapacity=i;
	}
	
	public void addcapacity(int d)
	{
	this.ccapacity=ccapacity+d;
	}

	public int getcapacity(){
		return this.ccapacity;
	}
}

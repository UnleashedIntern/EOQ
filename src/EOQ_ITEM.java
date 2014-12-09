
public class EOQ_ITEM {
	//Annual requirement quantity
	private int d = 0;
	//Cost per order
	private int k = 0;
	//Cost per unit
	private int c = 0;
	//Carrying cost percentage (h/c)(percentage of c)
	private double h_c = 0.0;
	//Annual carrying cost per unit
	private double h = 0.0;
	
	public EOQ_ITEM(int d, int k, int c, double h_c, double h){
		this.d = d;
		this.k = k;
		this.c = c;
		this.h_c = h_c;
		this.h = h;		
	}
	
	public double getEOQ(){
		return Math.sqrt(2*d*k/h);		
	}
	
	public double getTotalCost(double EOQ){
		return c*d + k*(d/EOQ) + h*(EOQ/2);		
	}
}

package study0226_2;

public abstract class Pay_Parent {
	protected int payment;
	protected String pMethod;
	protected int pDate;
	
	protected Pay_Parent () {}
	
	protected Pay_Parent (int payment, String pMethod, int pDate) {
		this.payment = payment;
		this.pDate = pDate;
		this.pMethod = pMethod;
	}
	
	
	public abstract void processPay();

}





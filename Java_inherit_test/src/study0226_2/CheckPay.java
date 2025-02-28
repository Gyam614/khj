package study0226_2;

public class CheckPay extends Pay_Parent {
	
	public CheckPay(int payment, String pMethod, int pDate) {
		super(payment, pMethod, pDate);
	}
	
	public void processPay() {
		System.out.println(pMethod + " 결제 금액: " + payment + "원 | 결제일: " + pDate);
	};

}

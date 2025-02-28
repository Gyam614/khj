package study0226_2;

public class mainMethod_0226_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pay_Parent check = new CheckPay(45000, "체크카드", 20250210);
		Pay_Parent trust = new CheckPay(63000, "신용카드", 20250226);
		Pay_Parent cash = new CheckPay(17500, "현금결제", 20250223);
		Pay_Parent acctrans = new CheckPay(20000, "계좌이체", 20250106);
		
		check.processPay();
		trust.processPay();
		cash.processPay();
		acctrans.processPay();

	}

}

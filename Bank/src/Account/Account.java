package Account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	private String accountId;
	private int money;
	
	public String toString() {
		return "계좌번호: " + accountId + " | 잔액: " + money;
	}


}




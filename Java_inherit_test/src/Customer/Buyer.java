package Customer;

import java.util.Date;

import Store.PFruit;

public class Buyer {
	
	private int money;
	private PFruit item;
	private Date buyDate;
	
	public Buyer(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public PFruit getItem() {
		return item;
	}

	public void setItem(PFruit item) {
		this.item = item;
	}
	
	public Date getBuyDate() {
		return buyDate;
	}
	
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	
	
	//set, get 메서드
	

	public String toString() {
		return("보유 머니: " + money + "원 | 구매일: " 
				+ this.buyDate + " | 구매음료: "
				+ this.item);
	}

}

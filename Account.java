package objectClass;
// 은행 계좌 클래스
public class Account {
	// 멤버 변수(필드,속성)
	static final String BANKNAME="신한은행";		// final = 변수에 하나 값을 넣으면 변하지 않는다. 변수를 상수로 만든다. 상수 = 대문자
	String accountNo;	//계좌번호
	String ownerName;	//예금주이름
	int balance;		//잔액

	/*
	// 생성자 자동 생성 = "Source" → "Generate Constructor using Fields..." 클릭
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
*/
	
	
	//생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;			// this 를 사용하면 매개 변수와 멤버 변수 명이 같을 경우 구별이 가능하다.
	}
	
	
	public Account() {			// Ctrl + SapceBar 클릭
		
	}
	
	
	// 예금한다 메서드(기능,하는 일)
	void deposit(int amount) {			// void = 리턴 값이 없음 , int amuont = 매개변수 : 외부로 부터 값을 받을 수 있는 변수
		balance+=amount;
	}
	// 인출한다
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}//if end
		balance-=amount;
		return amount;
	}//int withdraw end
	
	
	
	
}//class end


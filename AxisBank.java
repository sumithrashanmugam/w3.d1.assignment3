package week3day1;

public class AxisBank extends BankInfo {
public void deposit() {
System.out.println("deposit in my account is 25000");
}
public void getsuperdeposit() {
	super.deposit();
}
public static void main(String[]args) {
	AxisBank asixbank=new AxisBank();
	asixbank.deposit();
	asixbank.getsuperdeposit();
}
}



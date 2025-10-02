package ATMWithdraw;

public class InsufficientBalanceException extends Exception{
	
	InsufficientBalanceException (String a){
		super(a);
	}

}

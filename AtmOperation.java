package packAtm;

import java.util.ArrayList;


public class AtmOperation implements AtmOperationInterface {
	ATM atm = new ATM();
	ArrayList<ProcessingAmount> map = new ArrayList<ProcessingAmount>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : " + atm.getBalance());
	}
	@Override
	public void viewMiniStatement() {
		for(ProcessingAmount pAmount : map)
		{
			System.out.println(pAmount.getAmount() + pAmount.getProcess());
		}
	}
	@Override
	public void depositAmount(Double depositAmount) {
		map.add(new ProcessingAmount(depositAmount, " : DepositAmount"));
		System.out.println(depositAmount + "depositAmount is successfully!");
		atm.setBalance(atm.getBalance()  + depositAmount);
		viewBalance();
	}
	@Override
	public void withdrawAmount(Double withdrawAmount) {
		map.add(new ProcessingAmount(withdrawAmount, " : WithdrawAmount"));
		if(atm.getBalance() >= withdrawAmount)
		{
	 		System.out.println(withdrawAmount + " collect the Cash");
	 		atm.setBalance(atm.getBalance() - withdrawAmount);
	 		viewBalance();
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}

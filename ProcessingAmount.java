package packAtm;

public class ProcessingAmount {
	private Double amount;
	private String process;
	
	public ProcessingAmount(Double amount, String process) {
		super();
		this.amount = amount;
		this.process = process;
	}
	
	public Double getAmount() {
		return amount;
	}

	public String getProcess() {
		return process;
	}

	@Override
	public String toString() {
		return  amount + " :  " + process ;
	}
	
}

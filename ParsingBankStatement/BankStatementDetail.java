package bankcode;

public class BankStatementDetail {
	
	public String Name;
	public String Date;
	public String Total;
	public String AccountType;
	public String BranchName;
	public String BranchCode;
	public String MIRCCode;
	public String IFSCCode;
	public String OpeningBalance;
	public String ClosingBalance;
	
	@Override
	public String toString()
	{
	    return Name;
}
	public String getDate() {
		return Date;
	}
	public String getTotal(){
		return Total;
	}
	public String getAccountType(){
		return AccountType;
	}
	public String getBranchName(){
		return BranchName;
	}
	public String getBranchCode(){
		return BranchCode;
	}
	public String getMIRCCode(){
		return MIRCCode;
	}
	
	public String getIFSCCode(){
		return IFSCCode;
	}
	public String getOpeningBalance(){
		return OpeningBalance;
	}
	public String getClosingBalance(){
		return ClosingBalance;
	}
	
	
}

package employee;

@SuppressWarnings("serial")
public class Account implements java.io.Serializable {


	private long accountId;
	private String accountType;
	private String accountNumber;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Account() {
	}

	public Account(String accountType, String accountNumber) {
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}
}

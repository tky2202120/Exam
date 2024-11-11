package Bean;

public class Company implements java.io.Serializable {

	//変数定義
	private int companyID;
	private String companyName;
	private String companyEmail;
	private String companyTEL;
	private byte[] companyPassword;
	private Boolean companySecessionFlag;
	/**
	 * @return companyID
	 */
	public int getCompanyID() {
		return companyID;
	}
	/**
	 * @param companyID セットする companyID
	 */
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	/**
	 * @return companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName セットする companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return companyEmail
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}
	/**
	 * @param companyEmail セットする companyEmail
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	/**
	 * @return companyTEL
	 */
	public String getCompanyTEL() {
		return companyTEL;
	}
	/**
	 * @param companyTEL セットする companyTEL
	 */
	public void setCompanyTEL(String companyTEL) {
		this.companyTEL = companyTEL;
	}
	/**
	 * @return companyPassword
	 */
	public byte[] getCompanyPassword() {
		return companyPassword;
	}
	/**
	 * @param companyPassword セットする companyPassword
	 */
	public void setCompanyPassword(byte[] companyPassword) {
		this.companyPassword = companyPassword;
	}
	/**
	 * @return companySecessionFlag
	 */
	public Boolean getCompanySecessionFlag() {
		return companySecessionFlag;
	}
	/**
	 * @param companySecessionFlag セットする companySecessionFlag
	 */
	public void setCompanySecessionFlag(Boolean companySecessionFlag) {
		this.companySecessionFlag = companySecessionFlag;
	}

}

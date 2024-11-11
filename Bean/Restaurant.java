package Bean;

import java.sql.Array;

public class Restaurant implements java.io.Serializable {

	//変数定義
	private int restaurantID;
	private String restaurantName;
	private String restaurantEmail;
	private String restaurantTEL;
	private byte[] restaurantPassword;
	private Array tableNum;
	private int companyID;
	/**
	 * @return restaurantID
	 */
	public int getRestaurantID() {
		return restaurantID;
	}
	/**
	 * @param restaurantID セットする restaurantID
	 */
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	/**
	 * @return restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}
	/**
	 * @param restaurantName セットする restaurantName
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	/**
	 * @return restaurantEmail
	 */
	public String getRestaurantEmail() {
		return restaurantEmail;
	}
	/**
	 * @param restaurantEmail セットする restaurantEmail
	 */
	public void setRestaurantEmail(String restaurantEmail) {
		this.restaurantEmail = restaurantEmail;
	}
	/**
	 * @return restaurantTEL
	 */
	public String getRestaurantTEL() {
		return restaurantTEL;
	}
	/**
	 * @param restaurantTEL セットする restaurantTEL
	 */
	public void setRestaurantTEL(String restaurantTEL) {
		this.restaurantTEL = restaurantTEL;
	}
	/**
	 * @return restaurantPassword
	 */
	public byte[] getRestaurantPassword() {
		return restaurantPassword;
	}
	/**
	 * @param restaurantPassword セットする restaurantPassword
	 */
	public void setRestaurantPassword(byte[] restaurantPassword) {
		this.restaurantPassword = restaurantPassword;
	}
	/**
	 * @return tableNum
	 */
	public Array getTableNum() {
		return tableNum;
	}
	/**
	 * @param tableNum セットする tableNum
	 */
	public void setTableNum(Array tableNum) {
		this.tableNum = tableNum;
	}
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
}

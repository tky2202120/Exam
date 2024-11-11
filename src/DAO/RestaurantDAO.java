package DAO;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RestaurantDAO extends DAO{

	public int signup(String restaurantName, String restaurantEmail, String restaurantTEL, String restaurantPassword, int companyID) throws Exception{

		MessageDigest sha_256 = MessageDigest.getInstance("SHA-256");
		byte[] pw = sha_256.digest(restaurantPassword.getBytes());

		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO RESTAURANT VALUES(?,?,?,?,?,?)");
		st.setString(1, restaurantName);
		st.setString(2,restaurantEmail);
		st.setString(3, restaurantTEL);
		st.setBytes(4, pw);
		st.setArray(5, null);
		st.setInt(6, companyID);


		int num = st.executeUpdate();

		return num;
	}



}

package Bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * メニューBean
 *
 * @author k_nakayama
 *
 */
public class User implements Serializable {
	/**
	 * ユーザーID:int
	 */
	private int userId;

	/**
	 * 氏名:String
	 */
	private String name;

	/**
	 * メールアドレス:String
	 */
	private String email;

	/**
	 * パスワード:String
	 */
	private String password;

	/**
	 * アレルギー情報:ArrayList<Integer>
	 */
	private ArrayList<Integer> allergy;

	/**
	 * ゲッター、セッター
	 */
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Integer> getAllergy() {
		return allergy;
	}

	public void setAllergy(ArrayList<Integer> allergy) {
		this.allergy = allergy;
	}


}

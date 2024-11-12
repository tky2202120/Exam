package Bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * メニューBean
 *
 * @author k_nakayama
 *
 */
public class Menu implements Serializable {
	/**
	 * 料理ID:int
	 */
	private int dishId;

	/**
	 * 店ID:int
	 */
	private int restaurantId;

	/**
	 * 料理名:String
	 */
	private String dishName;

	/**
	 * 値段:int
	 */
	private int price;

	/**
	 * 画像URL:String
	 */
	private String imageURL;

	/**
	 * カテゴリー:char
	 */
	private char categoryId;

	/**
	 * 含まれてるアレルギー物質:ArrayList<Integer>
	 */
	private ArrayList<Integer> allergy;

	/**
	 * 取り除き可能素材:ArrayList<Integer>
	 */
	private ArrayList<Integer> remove;

	/**
	 * 売り切れフラグ:boolean
	 */
	private boolean soldStatus;

	/**
	 * 商品メモ:String
	 */
	private String notes;

	/**
	 * ゲッター、セッター
	 */
	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public char getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(char categoryId) {
		this.categoryId = categoryId;
	}

	public ArrayList<Integer> getAllergy() {
		return allergy;
	}

	public void setAllergy(ArrayList<Integer> allergy) {
		this.allergy = allergy;
	}

	public ArrayList<Integer> getRemove() {
		return remove;
	}

	public void setRemove(ArrayList<Integer> remove) {
		this.remove = remove;
	}

	public boolean isSoldStatus() {
		return soldStatus;
	}

	public void setSoldStatus(boolean soldStatus) {
		this.soldStatus = soldStatus;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}

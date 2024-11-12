package Bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 注文履歴Bean
 *
 * @author k_nakayama
 *
 */
public class OrderHistory implements Serializable {
	/**
	 * 注文履歴ID:int
	 */
	private int orderHistoryId;

	/**
	 * ユーザーID:int
	 */
	private int userId;

	/**
	 * テーブル番号:String
	 */
	private String tableNumber;

	/**
	 * 料理ID:int
	 */
	private int dishId;

	/**
	 * 個数:int
	 */
	private int count;

	/**
	 * 取り除いた素材:ArrayList<Integer>
	 */
	private ArrayList<Integer> remove;

	/**
	 * 会計済フラグ:boolean
	 */
	private boolean checkStatus;


	/**
	 * ゲッター、セッター
	 */
	public int getOrderHistoryId() {
		return orderHistoryId;
	}

	public void setOrderHistoryId(int orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ArrayList<Integer> getRemove() {
		return remove;
	}

	public void setRemove(ArrayList<Integer> remove) {
		this.remove = remove;
	}

	public boolean isCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(boolean checkStatus) {
		this.checkStatus = checkStatus;
	}


}

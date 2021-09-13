package git;

import java.util.ArrayList;

public interface IParams {
	public int getBig();
	//获取大车位
	public int getMedium();
	//获取中车位
	public int getSmall();
	//获取小车位
	public ArrayList<Integer> getPlanParking();
}

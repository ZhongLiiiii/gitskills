package git;

import java.util.ArrayList;

public interface IParking {
	
static ArrayList<Integer> planParing = new ArrayList();
	
	void print();
	
	boolean addCar(int carType);
	
	public static IParams parse() throws Exception{
		return new IParams(){
            @Override
            public int getBig() {
                return Integer.parseInt(System.getProperty("Big"));
            }

            @Override
            public int getMedium() {
                return Integer.parseInt(System.getProperty("Medium"));
            }

            @Override
            public int getSmall() {
                return Integer.parseInt(System.getProperty("Small"));
            }

            @Override
            public ArrayList<Integer> getPlanParking() {
                return planParing;
            }
        };
    }
}
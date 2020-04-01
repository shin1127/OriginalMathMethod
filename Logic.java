package Logic;

import java.util.ArrayList;

public class Logic{

	
	// int型の配列の最大値を求める
    public int maxInt(ArrayList<Integer> list){
        int maxNumber = Integer.MIN_VALUE;
        for(int n : list){
            if (maxNumber < n){
                maxNumber = n;
            }
        }
        return maxNumber;
    }
    
    // double型の配列の最大値を求める
    public double maxDouble(ArrayList<Double> list){
        double maxNumber = Double.MIN_VALUE;
        for(double n : list){
            if (maxNumber < n){
                maxNumber = n;
            }
        }
        return maxNumber;
    }
    
    // int型の配列の最小値を求める
    public int minInt(ArrayList<Integer> list){
        int minNumber = Integer.MAX_VALUE;
        for(int n : list){
            if (minNumber < n){
                minNumber = n;
            }
        }
        return minNumber;
    }
    
    // double型の配列の最小値を求める
    public double minDouble(ArrayList<Double> list){
        double minNumber = Double.MIN_VALUE;
        for(double n : list){
            if (minNumber < n){
                minNumber = n;
            }
        }
        return minNumber;
    }
}

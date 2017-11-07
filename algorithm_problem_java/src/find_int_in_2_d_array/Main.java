package find_int_in_2_d_array;
/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Main {
	/*
	 * 方案一：
	 * 不通过
	 * 适用于：int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
	 */
	public static boolean Find_pass(int target, int [][] array) {
		int flag = 0;
		int x = 0;
		int y = 0;
		for(int i = 0; i < array.length; i++){
			if(target == array[i][0]){
				x = array[i][0];
				return true;
			}else if(target > array[i][0]){
				x = array[i][0];
				y = i;
			}
		}
		for(int i = 0; i < array[y].length; i++){
			if(array[y][i] == target){
				flag = 1;
			}
		}
		if(flag == 1){
			return true;
		}else{
			return false;
		}
	}
	/* 
	 * 方案二
	 * 最笨的方法。。。。
	 */
	public static boolean Find_bestLazy(int target, int [][] array) {
		int flag = 0;
		for(int i = 0; i <= (array.length - 1); i++){
			for(int j = 0; j <= (array[i].length - 1); j++){
				if(array[i][j] == target){
					flag = 1;
				}
			}
		}
		if(flag == 1){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean Find(int target, int [][] array) {
		
		return false;
	}
	public static void main(String[] arg){
		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 7;
		System.out.println(Find(target, array));
	}
}

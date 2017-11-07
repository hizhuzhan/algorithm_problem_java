package bai_yuan_bai_chicken;

public class Main {
	/*
	 * 公鸡：一只5元
	 * 母鸡：一只3元
	 * 小鸡：三只1元
	 * 问：100元买100只鸡共有几种情况？
	 */
	public static void main(String[] args){
		System.out.println("--百--元--百--鸡--");
		int g, m, x;
		int i = 0;
		for(g = 0; g <= 20; g++){
			for(m = 0; m <= 33; m++){
				x = 100 - g - m;
//				1.化简取值
//				if((15*g + 9*m + x) == 300){
//					i++;
//					System.out.println("情况" + i + "：公鸡" + g + "只、母鸡" + m + "只、小鸡" + x + "只");
//				}
//				2.判断整除
//				if((5*g + 3*m + x/3) == 100 && x%3 == 0){
//					i++;
//					System.out.println("情况" + i + "：公鸡" + g + "只、母鸡" + m + "只、小鸡" + x + "只");
//				}
//				3.？？？
				if((5*g + 3*m + x/3.0) == 100){
					i++;
					System.out.println("情况" + i + "：公鸡" + g + "只、母鸡" + m + "只、小鸡" + x + "只");
				}
			}
		}
		
	}
}

package day12;

public class MathDemo {

	public static void main(String[] args) {
		// 2017-12-20 第七天笔记
		// 向上取整数 224.0
		System.out.println(Math.ceil(223.77));
		// 向下取整数 223
		System.out.println(Math.floor(223.77));
		// 向四舍五入 223
		System.out.println(Math.round(223.37));
		// 向四舍五入 224
		System.out.println(Math.round(223.57));
		// 指数形式 2^3.1 8.574187700290345
		System.out.println(Math.pow(2, 3.1));
		// 随机小数 0~1 之间的随机小数 0.3318025612038309 [0.0, 1.0) 不包括 1.0
		System.out.println(Math.random());
		// 产生 20 ~30 之间的随机数 [20 ~30] [(int)(Math.random()*(最大值-最小值+1)+最小值)
		System.out.println((int)(Math.random()*(30-20+1)+20));


	}

}

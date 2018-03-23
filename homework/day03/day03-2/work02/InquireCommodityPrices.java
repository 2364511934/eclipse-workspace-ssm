/**
* 循环输入商品编号，显示对应的商品价格，输入“n”结束循环 。
*/
import java.util.Scanner;
public class InquireCommodityPrices 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String Commodity="";
		
		System.out.println("*********商品*****************");
		System.out.println("   1.T恤 2.网球鞋 3.网球拍   ");
		System.out.println("******************************");
		while(!Commodity.equals("n"))
		{
			System.out.print("请输入商品编号");
			Commodity = input.next();
			switch(Commodity)
			{
				case "1": System.out.print("T恤      ￥245"); break;
				case "2": System.out.print("网球鞋   ￥570"); break;
				case "3": System.out.print("网球拍   ￥380"); break;
				default:  System.out.print("无效输入!!!"); break;
			}
			System.out.print("\n是否继续(y/n)");
			Commodity = input.next();
		}

		
		
	}
}

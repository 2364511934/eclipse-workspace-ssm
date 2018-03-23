/**
*
* 任务三：计算总金额（能力提升）
*/
import java.util.Scanner;
public class CommodityPrices 
{
	public static void main(String[] args) 
	{
		double total = 0.0;
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
				case "1": System.out.print("T恤      ￥245"); total+=245.0; break;
				case "2": System.out.print("网球鞋   ￥570"); total+=570.0;break;
				case "3": System.out.print("网球拍   ￥380"); total+=380.0;break;
				default:  System.out.print("无效输入!!!"); break;
			}
			System.out.print("\n是否继续(y/n)");
			Commodity = input.next();
		}
			
		System.out.println("总金额为: " + total);
		
	}
}


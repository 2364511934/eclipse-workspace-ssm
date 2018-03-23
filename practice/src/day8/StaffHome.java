package day8;

class TrafficTool
{
	public void trafficRun() {
		System.out.println("交通工具运行中...");
	}
}

class CarTool extends TrafficTool{

	@Override
	public void trafficRun() {
		System.out.println("汽车运行中...");
	}	
	
	public void carInfo() {
		System.out.println("奔驰汽车");
	}
}


class SubwayTool extends TrafficTool{

	@Override
	public void trafficRun() {
		System.out.println("地铁运行中...");
	}
	
	public void subwayInfo() {
		System.out.println("北京地铁");
	}
}



class Staff{
	private String name;
	
	
	public Staff(String name) {
		this.name = name;
	}


	public void useTool(TrafficTool trafficTool) {
		System.out.println(name + "回家了");
		trafficTool.trafficRun();
		
		if (trafficTool instanceof CarTool) {
			((CarTool)trafficTool).carInfo();
		}
		else if (trafficTool instanceof SubwayTool)
		{
			((SubwayTool)trafficTool).subwayInfo();
		}
		
		if (trafficTool instanceof TrafficTool) {
			System.out.println("&&&&&&&&&&&&&&&&&&&&&");
		}
		else if (trafficTool instanceof TrafficTool)
		{
			((SubwayTool)trafficTool).subwayInfo();
		}
		
		
	}
}

public class StaffHome {

	public static void main(String[] args) {
		Staff Staff1 = new Staff("爱变成");
		Staff Staff2 = new Staff("爱学习");
		CarTool carTool = new CarTool();
		SubwayTool subwayTool = new SubwayTool();
		
		Staff1.useTool(carTool);
		Staff2.useTool(subwayTool);
		

	}

}

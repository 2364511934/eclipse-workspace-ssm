package day8;

class TrafficTool
{
	public void trafficRun() {
		System.out.println("��ͨ����������...");
	}
}

class CarTool extends TrafficTool{

	@Override
	public void trafficRun() {
		System.out.println("����������...");
	}	
	
	public void carInfo() {
		System.out.println("��������");
	}
}


class SubwayTool extends TrafficTool{

	@Override
	public void trafficRun() {
		System.out.println("����������...");
	}
	
	public void subwayInfo() {
		System.out.println("��������");
	}
}



class Staff{
	private String name;
	
	
	public Staff(String name) {
		this.name = name;
	}


	public void useTool(TrafficTool trafficTool) {
		System.out.println(name + "�ؼ���");
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
		Staff Staff1 = new Staff("�����");
		Staff Staff2 = new Staff("��ѧϰ");
		CarTool carTool = new CarTool();
		SubwayTool subwayTool = new SubwayTool();
		
		Staff1.useTool(carTool);
		Staff2.useTool(subwayTool);
		

	}

}

package day13;

class TelTrans <T1, T2>{
	private T1 no;
	private T2 tel;
	public TelTrans(T1 no, T2 tel) {
		super();
		this.no = no;
		this.tel = tel;
	}
	public T1 getNo() {
		return no;
	}
	public void setNo(T1 no) {
		this.no = no;
	}
	public T2 getTel() {
		return tel;
	}
	public void setTel(T2 tel) {
		this.tel = tel;
	}
}

interface IA  {
	
}


class TelTrans2 <T1 extends Double & IA >
{
	T1 a;
}

public class TelDemo {

	public static void main(String[] args) {
		TelTrans <Integer, String> ts1 = new TelTrans <Integer, String>
							(222, "12345329955");
		System.out.println(ts1.getNo());
		System.out.println(ts1.getTel());

		//TelTrans2<Double, Integer> t2 = new TelTrans2<>();
	}

}

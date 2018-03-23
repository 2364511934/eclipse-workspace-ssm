package day9;


abstract class Job{
	private String jobType;
	
	public Job(String jobType) {
		this.jobType = jobType;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public abstract void showJob();
	
}

class TestJob extends Job{
	private int caseNum;
	private int findBugs;
	public TestJob(String jobType, int caseNum, int findBugs) {
		super(jobType);
		this.caseNum = caseNum;
		this.findBugs = findBugs;
	}
	@Override
	public void showJob() {
		System.out.println(getJobType()+": ���԰�����:" + caseNum + " ����������: " + findBugs);
	}
	
	
	
}

class CodeJob extends Job{
	private int codeingLine;
	private int bugs;
	public CodeJob(String jobType, int codeingLine, int bugs) {
		super(jobType);
		this.codeingLine = codeingLine;
		this.bugs = bugs;
	}
	public int getCodeingLine() {
		return codeingLine;
	}
	public void setCodeingLine(int codeingLine) {
		this.codeingLine = codeingLine;
	}
	public int getBugs() {
		return bugs;
	}
	public void setBugs(int bugs) {
		this.bugs = bugs;
	}
	@Override
	public void showJob() {
		System.out.println(getJobType() + " : ��д��������: " + codeingLine + "�����������: " + bugs);
		
	}
	
}


public class JobDemo {

	public static void main(String[] args) {
		TestJob testJob = new TestJob("���Թ���ʦ", 20, 2000);
		testJob.showJob();
		
		CodeJob codeJob = new CodeJob("��������ʦ", 2000000, 10000);
		codeJob.showJob();
		

	}

}

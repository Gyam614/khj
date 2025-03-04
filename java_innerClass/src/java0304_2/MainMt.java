package java0304_2;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Job 클래스를 이용해 익명 클래스 다루기
		//익명 클래스 객체를 통해 직업 입력
		// myJob메서드 실행하여 내 직업 출력
		
		Job job = new Job() {
			@Override
			public void myJob() {
				System.out.println(JobName);
			}
		};
		job.JobName = "나는 개미핥기다.";
		job.myJob();
		
		//Work 인터페이스를 이용해 익명클래스 다루기
		//Working 메서드 실행
		//내가 하는 일 출력하기. 
		
		Work work = new Work() {
			@Override
			public void working() {
				System.out.println("나는 개미를 핥는 일을 합니다.");
			}
		};
		work.working();

	}

}

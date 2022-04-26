package c11.e;

public class Student {
	
	private String studentNum;

	public Student(String sN) {
		this.studentNum = sN;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(studentNum.equals(st.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
}

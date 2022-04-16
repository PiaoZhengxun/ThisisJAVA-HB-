package c11.objects;

import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int[] result = new int[3];
		
		result[0] = Objects.compare(s1, s2, new StudentComparator());
		result[1] = Objects.compare(s1, s3, new StudentComparator());
		result[2] = Objects.compare(s3, s2, new StudentComparator());
		
		
		for(int i = 0; i <= 2; i++) {
			System.out.println(result[i]);
		}

	}
	
	static class Student{
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}

}

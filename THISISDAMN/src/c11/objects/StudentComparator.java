package c11.objects;

import java.util.Comparator;

import c11.objects.CompareExample.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.sno, o2.sno);
	}

}

package chapter13_Generic.wildcardType;

import java.util.Arrays;

public class WildcardExample {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " student: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " student: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " student: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("Person Process", 5);
        personCourse.add(new Person("normal person"));
        personCourse.add(new Worker("worker"));
        personCourse.add(new Student("student"));
        personCourse.add(new HighStudent("highschool student"));

        Course<Worker> workerCourse = new Course<Worker>("Worker Process", 5);
        workerCourse.add(new Worker("worker"));

        Course<Student> studentCourse = new Course<Student>("Student Process", 5);
        studentCourse.add(new Student("student"));
        studentCourse.add(new HighStudent("highschool student"));

        Course<HighStudent> highStudentCourse = new Course<HighStudent>("Highschool student Process", 5);
        highStudentCourse.add(new HighStudent("highschool student"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        /* -------------------------------------------------------------------------------------------------*/

//        registerCourseStudent(personCourse);
//        registerCourseStudent(workerCourse);
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
//        registerCourseWorker(studentCourse);
//        registerCourseWorker(highStudentCourse);
    }
}

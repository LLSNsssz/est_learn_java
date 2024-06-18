package may18.wildCard;

import java.util.Arrays;
import may18.Course;

public class WildCardMain {

  public static void main(String[] args) {
    Course<Person> personCourse = new Course<>("일반인과정", 5);
    personCourse.add(new Person("일반인"));
    personCourse.add(new Worker("직장인"));
    personCourse.add(new Student("학생"));
    personCourse.add(new HighStudent("고등학생"));

    Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
    workerCourse.add(new Worker("직장인"));

    Course<Student> studentCourse = new Course<Student>("학생과정", 5);
    studentCourse.add(new Student("학생"));
    studentCourse.add(new HighStudent("고등학생"));

    Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
    highStudentCourse.add(new HighStudent("고등학생"));

    registerCourse(personCourse);
    registerCourse(workerCourse);
    registerCourse(studentCourse);
    registerCourse(personCourse);

    registerCourseWorker(workerCourse);
    registerCourseWorker(personCourse);

    registerCourseStudent(studentCourse);
    registerCourseStudent(highStudentCourse);

    registerCourseHighStudent(highStudentCourse);
  }

  public static void registerCourse(Course<?> course) {
    printStudent(course);
  }

  public static void registerCourseStudent(Course<? extends Student> course) {
    printStudent(course);
  }

  public static void registerCourseHighStudent(Course<HighStudent> course) {
    printStudent(course);
  }

  public static void registerCourseWorker(Course<? super Worker> course) {
    printStudent(course);
  }

  public static void printStudent(Course<?> course) {}
}

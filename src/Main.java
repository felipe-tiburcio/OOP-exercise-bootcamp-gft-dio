import com.dio.challenge.domain.Course;
import com.dio.challenge.domain.Mentorship;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Course course1 = new Course();
    course1.setTitle("Java course");
    course1.setDescription("A new course of Java.");
    course1.setWorkload(8);

    Course course2 = new Course();
    course2.setTitle("Javascript course");
    course2.setDescription("A new course of Javascript.");
    course2.setWorkload(4);

    Mentorship mentorship1 = new Mentorship();
    mentorship1.setTitle("Mentorship X");
    mentorship1.setDescription("A new mentorship");
    mentorship1.setDate(LocalDate.now());

    System.out.println(mentorship1);
  }
}

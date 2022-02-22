import com.dio.challenge.domain.*;

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

    Bootcamp bootcamp1 = new Bootcamp();
    bootcamp1.setTitle("Bootcamp Java Developer");
    bootcamp1.setDescription(("Description of the Bootcamp Java Developer"));
    bootcamp1.getEvents().add(course1);
    bootcamp1.getEvents().add(course2);
    bootcamp1.getEvents().add(mentorship1);

    Dev dev1 = new Dev();
    dev1.setName("Ícaro");
    dev1.subscribe(bootcamp1);
    System.out.println("Subscribed events of " + dev1.getName() + ": " + dev1.getEventsSubscribed());

    dev1.progresses();

    System.out.println("Finished events of " + dev1.getName() + ": " + dev1.getEventsFinished());

    System.out.println("------------");

    Dev dev2 = new Dev();
    dev2.setName("Yuri");
    dev2.subscribe(bootcamp1);
    System.out.println("Subscribed events of " + dev2.getName() + ": " + dev2.getEventsSubscribed());

    dev2.progresses();

    System.out.println("Finished events of " + dev2.getName() + ": " + dev2.getEventsFinished());


  }
}

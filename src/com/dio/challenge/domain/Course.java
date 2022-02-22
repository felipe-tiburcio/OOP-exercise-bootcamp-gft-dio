package com.dio.challenge.domain;

public class Course extends Event {

  private int workload;

  public Course() {

  }

  @Override
  public double calculateXp() {
    return XP_DEFAULT * workload;
  }

  public int getWorkload() {
    return workload;
  }

  public void setWorkload(int workload) {
    this.workload = workload;
  }

  @Override
  public String toString() {
    return "Course{" +
        "title='" + getTitle() + '\'' +
        ", description='" + getDescription() + '\'' +
        ", workload=" + workload +
        '}';
  }
}

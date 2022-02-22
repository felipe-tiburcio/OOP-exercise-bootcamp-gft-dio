package com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentorship extends Event {

  private LocalDate date;

  @Override
  public double calculateXp() {
    return XP_DEFAULT + 20;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Mentorship{" +
        "title='" + getTitle() + '\'' +
        ", description='" + getDescription() + '\'' +
        ", date=" + date +
        '}';
  }
}

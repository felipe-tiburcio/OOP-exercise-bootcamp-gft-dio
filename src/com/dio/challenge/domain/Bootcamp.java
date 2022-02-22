package com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends Event {
  private final LocalDate startDate =  LocalDate.now();
  private final LocalDate endDate = startDate.plusDays(45);
  private Set<Dev> subscribedDevs = new HashSet<>();
  private Set<Event> events = new LinkedHashSet<>();

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public Set<Dev> getSubscribedDevs() {
    return subscribedDevs;
  }

  public void setSubscribedDevs(Set<Dev> subscribedDevs) {
    this.subscribedDevs = subscribedDevs;
  }

  public Set<Event> getEvents() {
    return events;
  }

  public void setEvents(Set<Event> events) {
    this.events = events;
  }

  @Override
  public double calculateXp() {
    return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bootcamp bootcamp = (Bootcamp) o;
    return Objects.equals(startDate, bootcamp.startDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(events, bootcamp.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, subscribedDevs, events);
  }
}

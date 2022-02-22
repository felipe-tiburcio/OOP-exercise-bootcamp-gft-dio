package com.dio.challenge.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String name;

  private Set<Event> eventsSubscribed = new HashSet<>();
  private Set<Event> eventsFinished = new HashSet<>();

  public void subscribe(Bootcamp bootcamp) {
    this.eventsSubscribed.addAll(bootcamp.getEvents());
    bootcamp.getSubscribedDevs().add(this);
  }

  public void progresses() {
    Optional<Event> event = this.eventsSubscribed.stream().findFirst();
    if(event.isPresent()) {
      this.eventsFinished.add(event.get());
      this.eventsSubscribed.remove(event.get());
    } else {
      System.err.println("You are not enrolled in any event.");
    }
  }

  public double calculateXP() {
    return this.eventsFinished
        .stream()
        .mapToDouble(Event::calculateXp)
        .sum();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Event> getEventsSubscribed() {
    return eventsSubscribed;
  }

  public void setEventsSubscribed(Set<Event> eventsSubscribed) {
    this.eventsSubscribed = eventsSubscribed;
  }

  public Set<Event> getEventsFinished() {
    return eventsFinished;
  }

  public void setEventsFinished(Set<Event> eventsFinished) {
    this.eventsFinished = eventsFinished;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dev dev = (Dev) o;
    return Objects.equals(name, dev.name) && Objects.equals(eventsSubscribed, dev.eventsSubscribed) && Objects.equals(eventsFinished, dev.eventsFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, eventsSubscribed, eventsFinished);
  }
}

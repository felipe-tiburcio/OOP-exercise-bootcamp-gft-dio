package com.dio.challenge.domain;

 public abstract class Event {
  protected static final double XP_DEFAULT = 10;

  private String title;
  private String description;

  public abstract double calculateXp ();

   public String getTitle() {
     return title;
   }

   public void setTitle(String title) {
     this.title = title;
   }

   public String getDescription() {
     return description;
   }

   public void setDescription(String description) {
     this.description = description;
   }
 }

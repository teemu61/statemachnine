package com.example.entity.model;

public enum EntityEvents {
  ACTIVATE("active"),
  IDLE("idle"),
  DELETE("delete");

  private final String event;

  EntityEvents(String event) {
    this.event = event;
  }

  public String getEvent() {
    return event;
  }
}

package com.dlvisidro.AvaloqService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ServerTime {
  public LocalDate date;
  public LocalTime time;
  public ZoneId timezone;

  public ServerTime() {
    LocalDateTime now = LocalDateTime.now();
    date = now.toLocalDate();
    time = now.toLocalTime();
    timezone = ZoneId.systemDefault();
  }
}
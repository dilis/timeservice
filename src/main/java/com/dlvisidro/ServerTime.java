package com.dlvisidro.AvaloqService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ServerTime {
  public LocalDate date;
  public LocalTime time;
  public ZoneId timezone;
  public String iso8601;

  public ServerTime() {
  }

  public static ServerTime now() {
    ServerTime st = new ServerTime();
    LocalDateTime now = LocalDateTime.now();
    st.date = now.toLocalDate();
    st.time = now.toLocalTime();
    st.timezone = ZoneId.systemDefault();
    st.iso8601 = now.toString();
    return st;
  }
}
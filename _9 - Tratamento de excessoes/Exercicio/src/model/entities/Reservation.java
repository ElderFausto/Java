package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
  private Integer roomnumber;
  private Date checkIn;
  private Date checkOut;
  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Reservation(Integer roomnumber, Date checkIn, Date checkOut) {
    this.roomnumber = roomnumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public Integer getRoomnumber() {
    return roomnumber;
  }

  public void setRoomnumber(Integer roomnumber) {
    this.roomnumber = roomnumber;
  }

  public Date getCheckIn() {
    return checkIn;
  }

  public Date getCheckOut() {
    return checkOut;
  }

  public long duration() {
    long diff = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  public void updateDates(Date checkIn, Date checkOut) {
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  @Override
  public String toString() {
    return "Room "
            + roomnumber
            + ", check-in: "
            + sdf.format(checkIn)
            + ", checkOut: "
            + sdf.format(checkOut)
            + duration()
            + " nights";
  }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
    Date x1 = new Date();
    Date x2 = new Date(System.currentTimeMillis());
    Date x3 = new Date(0L);
    Date x4 = new Date(1000L * 60L * 60L * 5L);
    Date y1 = sdf1.parse("25/06/2018");
    Date y2 = sdf2.parse("25/06/2018 15:42:07");
    Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

    System.out.println(sdf2.format(y1));
    System.out.println(sdf2.format(y2));
    System.out.println(x1);
  }
}
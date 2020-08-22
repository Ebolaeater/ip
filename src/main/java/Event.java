import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    LocalDateTime date;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy hhmm");

    public Event(String work, LocalDateTime date){
        super(work);
        this.date = date;
    }

    public String toString(){
        return "[E]" + super.toString() + "(at: " + date.format(format) + ")";
    }
}

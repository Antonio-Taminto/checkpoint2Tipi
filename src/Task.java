import java.time.LocalDate;
import java.util.Date;

public class Task {
    private String description;
    private boolean completed;
    private LocalDate expiration;

    public Task(String description, boolean completed, LocalDate expiration) {
        this.description = description;
        this.completed = completed;
        this.expiration = expiration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public StringBuilder getToString() {
        StringBuilder string = new StringBuilder();
        string.append("Task: ");
        string.append(description);
        if(!completed){
            string.append(" da completare entro la data : ");
            string.append(expiration);
        }else {
            string.append(" completata");
        }
        return string;
    }
}

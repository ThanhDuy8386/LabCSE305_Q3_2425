import java.text.DateFormat;
import java.time.LocalDate;

public class highPriorityConcreate implements requestProduct{
    private String priority;
    private String expireDay;
    private String status;
    @Override
    public void setPriority() {
        this.status = "Emergency";
    }

    @Override
    public void setExpire() {
        // TODO Auto-generated method stub
        this.expireDay = LocalDate.now().toString();
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        // TODO Auto-generated method stub
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
    
}

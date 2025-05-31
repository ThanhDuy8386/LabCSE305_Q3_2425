import java.time.LocalDate;

public class lowPriorityConcrete implements requestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority() {
        // TODO Auto-generated method stub
        this.priority = "Ignore";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().toString();
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void processRequest() {
        // TODO Auto-generated method stub
        setPriority();
        setExpire();
        setStatus();
        System.out.println("Request denied");
    }
    
}

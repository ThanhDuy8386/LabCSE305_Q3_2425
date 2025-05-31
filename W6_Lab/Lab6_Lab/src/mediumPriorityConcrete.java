import java.time.LocalDate;

public class mediumPriorityConcrete implements requestProduct {
    private String priority;
    private String expireDay;
    private String status;
    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        // TODO Auto-generated method stub
        this.expireDay = LocalDate.now().plusMonths(1).toString();
    }

    @Override
    public void setStatus() {
        // TODO Auto-generated method stub
        this.status = "Accecpted";
    }

    @Override
    public void processRequest() {
        setPriority();
        setExpire();
        setStatus();
        System.out.println("Request accept, estimate complete day is " + expireDay);
    }
}

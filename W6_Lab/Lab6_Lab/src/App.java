public class App {
    public static void main(String[] args) throws Exception {
        requestCreator a = new lowPriortityConcreteCreator();
        a.createRequest().processRequest();
        requestCreator b = new mediumPriorityConcreteCreator();
        b.createRequest().processRequest();
        requestCreator c = new highPriorityConcreateCreator();
        c.createRequest().processRequest();
    }
}

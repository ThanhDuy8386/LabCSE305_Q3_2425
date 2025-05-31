public class highPriorityConcreateCreator extends requestCreator {

    @Override
    public requestProduct createRequest() {
        return new highPriorityConcreate();
    }
}
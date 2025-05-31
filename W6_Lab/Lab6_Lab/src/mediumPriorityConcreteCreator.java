public class mediumPriorityConcreteCreator extends requestCreator {

    @Override
    public requestProduct createRequest() {
        return new mediumPriorityConcrete();
    }
}

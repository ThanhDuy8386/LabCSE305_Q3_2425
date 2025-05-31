public abstract class requestCreator {
    public abstract requestProduct createRequest();
    public void processRequest(requestProduct requestProduct) {
        requestProduct.processRequest();
    };
}

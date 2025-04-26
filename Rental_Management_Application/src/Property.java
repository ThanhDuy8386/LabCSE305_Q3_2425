public class Property {
    int PropertyID;
    String Description;
    int PropertyOwnerId;

    public Property(int propertyID, String description, int propertyOwnerId) {
        PropertyID = propertyID;
        Description = description;
        PropertyOwnerId = propertyOwnerId;
    }

    public int getPropertyID() {
        return PropertyID;
    }

    public String getDescription() {
        return Description;
    }

    public int getPropertyOwnerId() {
        return PropertyOwnerId;
    }

    public void setPropertyID(int propertyID) {
        PropertyID = propertyID;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPropertyOwnerId(int propertyOwnerId) {
        PropertyOwnerId = propertyOwnerId;
    }
}

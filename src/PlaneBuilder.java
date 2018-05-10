import java.util.HashSet;
import java.util.Set;

public class PlaneBuilder {

    PlaneType type = null;
    int premiumSeats = 0;
    Set<Component> components = new HashSet<>();

    public PlaneBuilder setType(PlaneType type) {
        this.type = type;
        return this;
    }

    public PlaneBuilder setPremiumSeats(int premiumSeats) {
        this.premiumSeats = premiumSeats;
        return this;
    }

    public PlaneBuilder addComponent(Component comp){
        components.add(comp);
        return this;
    }

    public PlaneBuilder removeComponent(Component comp){
        components.remove(comp);
        return this;
    }

    public Plane build(){

        if(type == null)
            throw new IllegalStateException("Plane type not provided");

        if(premiumSeats < 0)
            throw new IllegalStateException("Premium seats number has to be >= 0");

        if(premiumSeats > type.SEATS_LIMIT)
            throw new IllegalStateException("Premium seats number is greater than seats limit of this plane type");

        return new Plane(this);
    }
}

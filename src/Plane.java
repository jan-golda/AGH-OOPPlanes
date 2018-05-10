import java.util.HashSet;
import java.util.Set;

public class Plane {

    private final PlaneType type;
    private final int premiumSeats;
    private final Set<Component> components;

    Plane(PlaneBuilder builder) {
        this.type = builder.type;
        this.premiumSeats = builder.premiumSeats;
        this.components = new HashSet<>(builder.components);
    }

    public PlaneType getType() {
        return type;
    }

    public int getPremiumSeats() {
        return premiumSeats;
    }

    public int getEconomicSeats(){
        return type.SEATS_LIMIT - premiumSeats;
    }

    public Set<Component> getComponents() {
        return components;
    }

    public int getPrice(){
        return type.BASE_PRICE + components.stream().mapToInt(Component::getPrice).sum();
    }

}

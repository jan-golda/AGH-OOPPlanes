public class Raporter {

    public String createRaport(Plane plane){
        StringBuilder builder = new StringBuilder();

        builder.append(String.format(
                "Plane of type %s will cost $%d and will have:\n\t%d premium seats and %d economic seats\n",
                plane.getType().name(),
                plane.getPrice(),
                plane.getPremiumSeats(),
                plane.getEconomicSeats()
        ));

        for(Component c : plane.getComponents()) {
            builder.append(String.format(
                    "\t%s ($%d)\n",
                    c.getDescription(),
                    c.getPrice()
            ));
        }

        return builder.toString();
    }

}

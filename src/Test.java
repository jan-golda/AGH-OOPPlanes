public class Test {

    public static void main(String[] args) {

        PlaneBuilder builder = new PlaneBuilder()
                .setType(PlaneType.valueOf(args[0]))
                .setPremiumSeats(Integer.parseInt(args[1]));

        for(int i = 2; i+1 < args.length; i += 2)
            builder.addComponent(new Component(Integer.parseInt(args[i+1]), args[i]));

        System.out.print(new Raporter().createRaport(builder.build()));

    }

}

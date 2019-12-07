package example.singletroRepeat.builderexample;

public class BuilderExample {

    public static void main(String[] args) {
        BurgerBuilder builder = new BurgerBuilderImpl();

        builder.setBread("white");
        builder.setMeat("medihu");
        builder.setSauce("garlic");
        builder.setVegetables("tomatoe");

      Burger burger=builder.build();
        System.out.println(burger.toString());
    }
}

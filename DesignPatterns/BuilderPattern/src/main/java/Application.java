public class Application {

    public static void main(String[] args) {

        Gun.Builder builder = new Gun.Builder("renewed");
        Gun gun = builder.gunModel("Revolve").bulletsCount(12).trainingStatus("Trained").build();

        System.out.println(gun);
    }
}

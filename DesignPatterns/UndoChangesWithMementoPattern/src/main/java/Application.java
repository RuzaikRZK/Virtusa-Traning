public class Application {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Profile profile = new Profile();
        profile.addProfile(new ProfileDetaile("ruzaik"));
        profile.addProfile(new ProfileDetaile("Hasitha"));

        careTaker.save(profile);

        System.out.println(profile);


        profile.addProfile(new ProfileDetaile("Alfer"));

        careTaker.save(profile);

        System.out.println(profile);


        profile.addProfile(new ProfileDetaile("Madhushan"));

        careTaker.save(profile);

        System.out.println(profile);


        profile.addProfile(new ProfileDetaile("Razmeen"));

        careTaker.save(profile);

        System.out.println(profile);


        careTaker.revert(profile);
        System.out.println(profile);

        careTaker.revert(profile);
        System.out.println(profile);

        careTaker.revert(profile);
        System.out.println(profile);

        careTaker.revert(profile);
        System.out.println(profile);

        careTaker.revert(profile);
        System.out.println(profile);

        careTaker.revert(profile);
        System.out.println(profile);




    }
}

import java.util.ArrayList;

// Originator
public class Profile {

    ArrayList<ProfileDetaile> profilesDetailes = new ArrayList<ProfileDetaile>();

    public  void addProfile(ProfileDetaile profileDetaile){

        profilesDetailes.add(profileDetaile);

    }

    public ArrayList<ProfileDetaile> getProfiles() {
        return (ArrayList) profilesDetailes.clone();
    }

    public ProfileMemento save(){

        return  new ProfileMemento(getProfiles());

    }

    public void revert(ProfileMemento profileMemento){
        profilesDetailes = profileMemento.getProfiles();

    }

    @Override
    public String toString() {
        return "Profile{" +
                "profiles=" + profilesDetailes +
                '}';
    }

    static  class ProfileMemento {

        ArrayList<ProfileDetaile> profilesDetailes;

        public ProfileMemento(ArrayList<ProfileDetaile> profiles) {
            this.profilesDetailes = profiles;
        }


        public ArrayList<ProfileDetaile> getProfiles() {
            return profilesDetailes;
        }
    }

}

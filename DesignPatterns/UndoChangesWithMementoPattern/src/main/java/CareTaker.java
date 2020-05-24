import java.util.Stack;

// like a profile history
public class CareTaker {

    Stack<Profile.ProfileMemento> history = new Stack<Profile.ProfileMemento>();

    public void save(Profile profile){

        history.push(profile.save());
    }

    public void revert(Profile profile){

        if(!history.isEmpty()){

            profile.revert(history.pop());
        }else{

            System.out.println("Cannot Undo!");

        }


    }




}

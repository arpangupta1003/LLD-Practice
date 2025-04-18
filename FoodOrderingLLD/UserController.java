import java.util.*;
public class UserController {
    List<User> userList;
    UserController(){
        userList=new ArrayList<>();
    }
    void addUser(User user){
        userList.add(user);
    }
    User getUserById(String userId){
        for(User user : userList){
            if(user.userId.equals(userId)){
                return user;
            }
        }
        System.out.println("No user found with this user id "+userId);
        return null;
    }

}

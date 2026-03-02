
package pose;

import pose.model.User;
import poseDao.UserDao;

/**
 *
 * @author Admin
 */
public class POSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       User u= new User("masud", "1234");
        UserDao dao=new UserDao();
        dao.saveUser(u);
        
        
    }
    
}

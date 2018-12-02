package liu.wiring.propertyPlaceholder;

/**
 * 用户
 * @author dajun
 *
 */
public class User {
	private String userName;  //用户名
    private int userAge;   //用户年龄
    private Role role;     //角色
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public int getUserAge() {
        return userAge;
    }
 
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
 
    public Role getRole() {
        return role;
    }
 
    public void setRole(Role role) {
        this.role = role;
    }

}

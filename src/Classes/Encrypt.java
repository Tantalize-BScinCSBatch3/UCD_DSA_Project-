/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Hp
 */
public class Encrypt {
    // private data items 
    private String password;
    private String username;

    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String UserName) {
        this.username = UserName;
    }

    public String getDbPassword() {
        return password;
    }

    public String getDbUserName() {
        return username;
    }
}

package Project1;
//Create Registration Class in which you would have variables as email,
// userName and password that have an access scope only within its own class.
// After creating an object of the class user should be able to call methods
// and in each method separately pass values to set users email, username and password.
//  Requirements:
// Valid email consider to be only yahoo
// Valid userName and password cannot be empty and should be of
// length larger than 6 characters. Also valid password cannot contain userName.
public class AccountRegester {

    private String emaileAdd;
    private String userName;
    private String password;

    public String getEmaileAdd() {
        return emaileAdd;
    }

    public void setEmaileAdd(String emaileAdd) {
        this.emaileAdd = emaileAdd;
        if(emaileAdd.contains("yahoo")){
            System.out.println("correct emaile address entered!");
        }else {
            System.out.println("Please a valid email address  enter a yahoo one");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if(userName.length()<6){
            System.out.println("User name must be more than 6 ch");
        }else {
            System.out.println("valid user name");
        }
    }
    void printInfo(){
        System.out.println("the full account inforamtion is "+this.emaileAdd+"username"+this.userName+"passweod"+this.password.replaceAll("[A-Z,a-z,!@#%^&*(]","*"));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if(password.length()<6){
            System.out.println("passwoerd must be 6 charctoer");
        } else if (password.contains(userName)) {
            System.out.println("Pasword can not contain user name");

        }else {
            System.out.println("passwored is accepted");
        }
    }

    public static void main(String[] args) {
        AccountRegester accountRegester=new AccountRegester();
        accountRegester.setEmaileAdd("arifkalakani@yahoo.com");
        accountRegester.setUserName("arifkalakani123");
        accountRegester.setPassword("123afghanistan");
        accountRegester.printInfo();
    }
}

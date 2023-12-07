package Übungen;

public class Test {
    private String userName;

    public Test (String userName){
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void changeAndDisplayUsername(String newUserName){
        setUserName(newUserName);

        System.out.println("New Username is: " + getUserName());

    }
    public static void main(String[] args) {
        Test test = new Test("Moahmed");
        System.out.println(test.getUserName());
        test.changeAndDisplayUsername("Max");


    }
}

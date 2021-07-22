public class MonSingleton {

    private String userName;
    private String Password;
    private static MonSingleton firstInstance=null;


    private MonSingleton(){}

    public static synchronized MonSingleton getInstance(){
        if(firstInstance==null){
            firstInstance=new MonSingleton();
            firstInstance.setUserName("Patatra");
            firstInstance.setPassword("Manilla");
        }
        return firstInstance;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getPassword() {
        return Password;
    }

    public MonSingleton createNewSingleTonInstance(){
        MonSingleton s=new MonSingleton();
        s.setUserName("ASDF");
        s.setPassword("QWER");
        return s;
    }
}
public class User {

    private String name;

    private Integer age;

    private static User instance;

    private User (){}

    public static User getInstance(){
        if(instance == null){
            instance = new User();
            instance.name = "Claudio Gambino";
            instance.age = 38;
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printInformation(){
        System.out.println("User name: " + name);
        System.out.println("User age: " + age);
    }
}
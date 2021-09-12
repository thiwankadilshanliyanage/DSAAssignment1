
public class User {
       int id;
    String name;
    String age;
    String tp;
    String email;

    public User() {
    }

    
    public User(int id, String name, String age, String tp, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tp = tp;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", tp='" + tp + '\'' +
                ", email=" + email +
                "}";
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

package cucumberDemo.common;

public abstract class AbstractDemo {
    private int age;
    private String sex;

    public abstract void show();

    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

package bean;

public class Test_1_People {
    private String name;
    private int age;
    private String sex;

    private void eat(){
        System.out.println( name + "正在吃东西" );
    }

    private void running(){
        System.out.println( "一个叫" + name + "的" + age + "岁的" + sex + "正在跑步" );
    }

    public Test_1_People() {
    }

    @Override
    public String toString() {
        return "Test_1_People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

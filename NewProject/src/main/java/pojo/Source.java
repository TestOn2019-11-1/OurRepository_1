package pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Source {
    private String fruit;   // 类型
    private String sugar;   // 糖分描述
    private String size;    // 大小杯
    @Autowired
    private Student student;
  public Source(){
      System.out.println("constructor is running");
  }
    public String getFruit() {
        return fruit;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit+"xxxx";
        System.out.println("setter is running");
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

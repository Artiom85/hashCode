import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name ;

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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return name +" cu virsta de "+ hashCode();
    }
}

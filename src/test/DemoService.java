package test;

public class DemoService implements DemoApi{

    private String name;

    @Override
    public String sayHello() {
        return ("hello,i'm " + name);
    }

    @Override
    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public User getUser() {
        return new User("lilei");
    }
}

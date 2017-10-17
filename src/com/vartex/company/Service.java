package com.vartex.company;

public class Service {

    public static void main(String[] args) {
        final Service service = new Service();
        final int age = 22;
        final String name = "Alex";
        final User user = service.createUser(name, age);
        service.print(user);
    }

    private User createUser(String name, int age) {
        final User user = new User();
        user.setAge(age);
        user.setName(name);
        return user;
    }

    private void print(User user) {
        System.out.println(user.getAge());
        System.out.println(user.getName());
    }


}

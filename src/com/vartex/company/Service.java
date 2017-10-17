package com.vartex.company;

public class Service {

    public static void main(String[] args) {
        final Service service = new Service();
        final int age = 22;
        final String name = "Alex";
        final User user = service.createUser(name, age);
        service.something();
        service.print(user);
    }

    /**
     * Create user with given name and age.
     */
    private User createUser(String name, int age) {
        final User user = new User();
        user.setAge(age);
        user.setName(name);
        return user;
    }

    /**
     * Just print user.
     */
    private void print(User user) {
        System.out.println(user.getAge());
        System.out.println(user.getName());
    }

    /**
     * Print message after user was created.
     */
    private void something() {
        System.out.println("User created");
    }
}

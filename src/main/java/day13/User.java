package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private final String username;
    private final List<User> subscriptions; //Список пользователей на которых подписан юзер

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User u, String text) {
        //Здесь должен использоваться статический метод из MessageDatabase
        MessageDatabase.addNewMessage(new User(username), new User(u.username), text);
    }

    public String toString() {
        return username;
    }
}

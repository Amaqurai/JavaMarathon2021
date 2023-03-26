package day13;

public class Task1 {
    public static void main(String[] args) {

        User newUser1 = new User("Alex Hov");
        User newUser2 = new User("Fatyniya Hov");
        User newUser3 = new User("Toma Toky");

        // Отправить 2 сообщения от пользователя 1 пользователю 2
        newUser1.sendMessage(newUser2, "Hey, how are you?");
        newUser1.sendMessage(newUser2, "Don't worry, i not have a snake!");
        // Отправить 3 сообщения от пользователя 2 пользователю 1
        newUser2.sendMessage(newUser1, "I am not worry!");
        newUser2.sendMessage(newUser1, "Would you like a cup of coffee?");
        newUser2.sendMessage(newUser1, "Or make coffee to go?");
        newUser2.sendMessage(newUser1, "I have two dogs and one cat?");
        // Отправить 3 сообщения от пользователя 3 пользователю 1
        newUser3.sendMessage(newUser1, "Your wife so beautiful");
        newUser3.sendMessage(newUser1, "Give me two cupcakes to go, please.");
        newUser3.sendMessage(newUser1, "How much?");
        // Отправить 3 сообщения от пользователя 1 пользователю 3
        newUser1.sendMessage(newUser3, "Would you like some red wine?");
        newUser1.sendMessage(newUser3, "Or White whine");
        newUser1.sendMessage(newUser3, "Yes, i do.");
        // Отправить 1 сообщение от пользователя 3 пользователю 1
        newUser3.sendMessage(newUser1, "No, don't like white wine");
        newUser3.sendMessage(newUser1, "Red, please");
        newUser3.sendMessage(newUser1, "Thank you.");

        MessageDatabase.showDialog(newUser1, newUser3);

        //Проверка методов подписки и добавления в друзья
        newUser1.subscribe(newUser2);
        newUser2.subscribe(newUser1);
        System.out.println(newUser1.isSubscribed(newUser2));
        System.out.println(newUser2.isSubscribed(newUser1));
        System.out.println(newUser1.isFriend(newUser2));
        System.out.println(newUser2.isFriend(newUser1));

    }
}

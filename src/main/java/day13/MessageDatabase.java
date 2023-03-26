package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>(); // Условна БД

    //Условная отправка сообщения от u1 к u2 с text-ом. Добавление сообщения в базу данных
    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1,u2,text));
    }

    //Возвращает все сообщения из БД
    public static List<Message> getMessages() {
        return messages;
    }
    //Вывод в консоль всех сообщений из БД
    public static void showDialog(User u1, User u2) {
        for (Message m: messages) {
            if (u1.getUsername().equals(m.getSender().getUsername()) && u2.getUsername().equals(m.getReceiver().getUsername())) {
                System.out.println(u1.getUsername() + ": " + m.getText());

            } else if (u2.getUsername().equals(m.getSender().getUsername()) && u1.getUsername().equals(m.getReceiver().getUsername())) {
                System.out.println(u2.getUsername() + ": " + m.getText());
            }
        }
    }
}

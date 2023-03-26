package day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    private User sender; //Отправитель
    private User receiver; //Получатель
    private String text; // Текст сообщения
    private Date date; // Дата сообщения

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        Calendar calendar = new GregorianCalendar();
        this.date = calendar.getTime();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "FROM: " + sender + "\n"
                + "TO: " + receiver + "\n"
                + "ON: " + date + "\n"
                + text + "\n";
    }
}

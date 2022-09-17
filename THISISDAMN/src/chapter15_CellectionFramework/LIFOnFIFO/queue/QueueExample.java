package chapter15_CellectionFramework.LIFOnFIFO.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "Hong"));
        messageQueue.offer(new Message("sendSMS", "Shin"));
        messageQueue.offer(new Message("sendKakaotalk", "Hong2"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + " sent");
                    break;
                case "sendSMS":
                    System.out.println("SMS to " + message.to);
                    break;
                case "sendKakaotalk":
                    System.out.println("kakao to " + message.to);
                    break;

            }
        }

    }
}

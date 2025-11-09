package app;

import java.util.Scanner;

public class PrinterImplementation implements Printer{
    @Override
    public void print(Message message) {
        if (message.getSender()  == null && message.getText() == null) {
            ProcessEmptyMessage processEmptyMessage = new ProcessEmptyMessage() {
                @Override
                public void processEmptyMessage() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            processEmptyMessage.processEmptyMessage();
        return;}

                if ((message.getSender() == null) || (message.getSender().isEmpty())) {
                    System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
                } else {
                    System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " +  message.getText());
                }
            }



    public interface ProcessEmptyMessage {
        void processEmptyMessage();

    }


    public static class Message{

        private String text;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        private String sender;

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    public static void main(String[] args) {
        Printer printer = new PrinterImplementation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст повідомлення: ");
        String text = scanner.nextLine();
        System.out.println("Введіть користувача: ");
        String sender = scanner.nextLine();
        PrinterImplementation.Message msg = new PrinterImplementation.Message(text, sender);
        printer.print(msg);
    }
}


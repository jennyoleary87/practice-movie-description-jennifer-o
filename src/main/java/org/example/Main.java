package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

//
//        public static void main(String[] args) throws HttpException, IOException {
//            Client client = new Client();
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a question for the model:");
//            String query = scanner.nextLine();
//            GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash-001", query, null);
//            System.out.println(response.text());


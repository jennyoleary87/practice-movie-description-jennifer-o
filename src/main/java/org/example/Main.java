package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import org.apache.http.HttpException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws HttpException, IOException {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a question for the model:");
//        String query = scanner.nextLine();

        GenerateContentResponse description = client.models.generateContent("gemini-2.0-flash-001", "Add movie description: ", null);

        System.out.println(response.text());
    }

@GetMapping("/add")
public string renderAdd(){
    return "<html>" + "<body>" + "<form ... >" + "<p> enter name: </p>" + ...

//
//        public static void main(String[] args) throws HttpException, IOException {
//            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//            // to see how IntelliJ IDEA suggests fixing it.
//            Client client = new Client();
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a question for the model:");
//            String query = scanner.nextLine();
//
//            GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash-001", query, null);
//
//            System.out.println(response.text());
//        }
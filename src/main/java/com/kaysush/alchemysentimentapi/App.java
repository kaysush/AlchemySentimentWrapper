package com.kaysush.alchemysentimentapi;

import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main class to test the functionalities implemented.
 */
public class App {

    public static void main(String[] args) {
        try {
            Alchemy api = Alchemy.getInstance();
            String response = api.analyze("Worst day of my life").getDocSentiment().getType();
            System.out.println(response);
        } catch (UnirestException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

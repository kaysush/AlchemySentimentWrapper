/**
 * This is the main API file. It contains methods for sentiment analysis of the
 * given piece of text.
 */
package com.kaysush.alchemysentimentapi;

import com.google.gson.Gson;
import com.kaysush.alchemysentimentapi.models.AlchemyResponse;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.ResourceBundle;

/**
 *
 * @author SUSHIL
 */
public class Alchemy {

    private static Alchemy INSTANCE;
    private ResourceBundle config;
    
    private Alchemy(){
        init();
    }
    
    private void init(){
        this.config = ResourceBundle.getBundle("ALchemyConfiguration");
    }

    public static Alchemy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Alchemy();
        }
        return INSTANCE;
    }
    
    public AlchemyResponse analyze(String text) throws UnirestException{
        String apiKey = config.getString("apikey");
        Unirest.setTimeouts(60000, 60000);
        String response = Unirest.post("https://alchemy.p.mashape.com/text/TextGetTextSentiment")
                .header("X-Mashape-Authorization", apiKey)
                .field("text", text)
                .field("outputMode", "json")
                .field("showSourceText", "0")
                .asString()
                .getBody();
        Gson gson = new Gson();
        AlchemyResponse jsonResponse = gson.fromJson(response, AlchemyResponse.class);
        return jsonResponse;
    }
}

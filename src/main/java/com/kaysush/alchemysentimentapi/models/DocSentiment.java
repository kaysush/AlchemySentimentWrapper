/**
 * The companion model for the response.
 */

package com.kaysush.alchemysentimentapi.models;

/**
 *
 * @author SUSHIL
 */
public class DocSentiment {
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String score;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}

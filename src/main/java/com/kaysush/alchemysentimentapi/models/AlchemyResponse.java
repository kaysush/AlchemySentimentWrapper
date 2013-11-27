/**
 * The model for decoding the API response.
 */

package com.kaysush.alchemysentimentapi.models;

/**
 *
 * @author SUSHIL
 */
public class AlchemyResponse {
    
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String usage;

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private DocSentiment docSentiment;

    public DocSentiment getDocSentiment() {
        return docSentiment;
    }

    public void setDocSentiment(DocSentiment docSentiment) {
        this.docSentiment = docSentiment;
    }

}

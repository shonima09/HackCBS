package com.example.hackcbs;

public class SupportData {

    public String getDatabaseName() {
        return "health-care";
    }
    public String getApiKey() {
        return "UMDZcCfjpT_J7dmulkJcCXQC8-EncueV";
    }
    public String getBaseUrl()
    {
        return "https://api.mlab.com/api/1/databases/"+getDatabaseName()+"/collections/";
    }
    public String apiKeyUrl()
    {
        return "?apiKey="+getApiKey();
    }
    public String collectionName()
    {
        return "Contacts";
    }
    public String buildContactsSaveURL()
    {
        return getBaseUrl()+collectionName()+apiKeyUrl();
    }
    public String buildContactsFetchURL()
    {
        return getBaseUrl()+collectionName()+apiKeyUrl();
    }
    public String createContact(MyContact contact) {
        return String.format("{\"first_name\": \"%s\", "+ "\"last_name\": \"%s\", " + "\"phone\": \"%s\"}", contact.getFirst_name(), contact.getLast_name(), contact.getPhone_nubmer());
    }
}
}

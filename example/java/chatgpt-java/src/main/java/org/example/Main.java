package org.example;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.ResponseGetmodelsApiModelsGet;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://chatgpt.duti.tech");
        String[] contentType = {"application/json", "text/event-stream"};

        defaultClient.selectHeaderContentType(contentType);
        // Configure API key authorization: APIKeyHeader
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("token");

        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //APIKeyHeader.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);

        try {
            ResponseGetmodelsApiModelsGet result = apiInstance.getModelsApiModelsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getModelsApiModelsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
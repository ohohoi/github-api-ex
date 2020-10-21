package com.ohohoi.github_api_ex.github;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class GithubClient {

    private static final String API_URL = "https://api.github.com";

    private JsonObject getResponse(String orgLogin) throws IOException {
        JsonObject responseJson = null;
        String requestUrl = API_URL + "/orgs/" + orgLogin;

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(requestUrl);

        HttpResponse httpResponse = httpClient.execute(httpGet);

        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = responseHandler.handleResponse(httpResponse);
            responseJson = new Gson().fromJson(responseBody, JsonObject.class);
        }

        return responseJson;
    }

}

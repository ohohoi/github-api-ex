package com.ohohoi.github_api_ex.github;

import com.google.gson.Gson;
import com.ohohoi.github_api_ex.model.Organization;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubClient {

    private static final String API_URL = "https://api.github.com";
    private static final String ACCESS_TOKEN = "member's personal access token here...";

    public Organization getOrg(String orgLogin) {
        Organization responseOrg = null;
        String requestUrl = API_URL + "/orgs/" + orgLogin;

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(requestUrl);
        httpGet.setHeader("Authorization", "token " + ACCESS_TOKEN);

        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);

            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                ResponseHandler<String> responseHandler = new BasicResponseHandler();
                String responseBody = responseHandler.handleResponse(httpResponse);
                responseOrg = new Gson().fromJson(responseBody, Organization.class);
            }
        } catch (IOException e) { }

        return responseOrg;
    }
    
}

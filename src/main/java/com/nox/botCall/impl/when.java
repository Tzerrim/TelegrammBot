package com.nox.botCall.impl;

import com.nox.botCall.inteface.botCall;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.GroupAuthResponse;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.REDIRECT_URI;

public class when implements botCall {

    public String getResult() {
        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient);

        GroupAuthResponse authResponse = vk.oauth()
                .groupAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
                .execute();

        GroupActor actor = new GroupActor(groupId, authResponse.getAccessTokens().get(groupId));

        return null;
    }
}

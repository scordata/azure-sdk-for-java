// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.Applicability;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfile;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AvailableWorkloadProfilesGetMockTests {
    @Test
    public void testGet() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"location\":\"qnmcjngzqdqx\",\"properties\":{\"category\":\"wgnyfusfzsvtui\",\"applicability\":\"Custom\",\"cores\":566108141,\"memoryGiB\":1502257649,\"displayName\":\"cfhmlrqryxyn\"},\"id\":\"zrdpsovwxznptgoe\",\"name\":\"ybbabpfhvfsl\",\"type\":\"vntjlrigjk\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ContainerAppsApiManager manager =
            ContainerAppsApiManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AvailableWorkloadProfile> response =
            manager.availableWorkloadProfiles().get("waz", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qnmcjngzqdqx", response.iterator().next().location());
        Assertions.assertEquals("wgnyfusfzsvtui", response.iterator().next().properties().category());
        Assertions.assertEquals(Applicability.CUSTOM, response.iterator().next().properties().applicability());
        Assertions.assertEquals(566108141, response.iterator().next().properties().cores());
        Assertions.assertEquals(1502257649, response.iterator().next().properties().memoryGiB());
        Assertions.assertEquals("cfhmlrqryxyn", response.iterator().next().properties().displayName());
    }
}

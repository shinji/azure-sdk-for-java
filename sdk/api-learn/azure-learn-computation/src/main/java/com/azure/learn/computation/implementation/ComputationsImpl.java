// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.computation.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.learn.computation.implementation.models.ComputationsComputePiResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Computations. */
public final class ComputationsImpl {
    /** The proxy service used to perform REST calls. */
    private final ComputationsService service;

    /** The service client containing this operation class. */
    private final ExampleComputationServiceForAzureSDKAPIDesignTrainingUnitImpl client;

    /**
     * Initializes an instance of ComputationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ComputationsImpl(ExampleComputationServiceForAzureSDKAPIDesignTrainingUnitImpl client) {
        this.service =
                RestProxy.create(ComputationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ExampleComputationServiceForAzureSDKAPIDesignTrainingUnitComputations
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ExampleComputationSe")
    private interface ComputationsService {
        @Post("/ComputeNodes/{nodeName}/computePi")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<ComputationsComputePiResponse> computePi(
                @HostParam("$host") String host,
                @HeaderParam("x-ms-client-request-id") String xMsClientRequestId,
                @PathParam("nodeName") String nodeName,
                @QueryParam("precision") Integer precision,
                Context context);
    }

    /**
     * @param precision The precision parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ComputationsComputePiResponse> computePiWithResponseAsync(Integer precision, Context context) {
        return service.computePi(
                this.client.getHost(),
                this.client.getXMsClientRequestId(),
                this.client.getNodeName(),
                precision,
                context);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.JobCredentialInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobCredentialsClient. */
public interface JobCredentialsClient {
    /**
     * Gets a list of jobs credentials.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of jobs credentials.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobCredentialInner> listByAgentAsync(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Gets a list of jobs credentials.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of jobs credentials.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobCredentialInner> listByAgent(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Gets a list of jobs credentials.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of jobs credentials.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobCredentialInner> listByAgent(
        String resourceGroupName, String serverName, String jobAgentName, Context context);

    /**
     * Gets a jobs credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a jobs credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobCredentialInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String jobAgentName, String credentialName);

    /**
     * Gets a jobs credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a jobs credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobCredentialInner> getAsync(
        String resourceGroupName, String serverName, String jobAgentName, String credentialName);

    /**
     * Gets a jobs credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a jobs credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobCredentialInner get(String resourceGroupName, String serverName, String jobAgentName, String credentialName);

    /**
     * Gets a jobs credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a jobs credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobCredentialInner> getWithResponse(
        String resourceGroupName, String serverName, String jobAgentName, String credentialName, Context context);

    /**
     * Creates or updates a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @param parameters A stored credential that can be used by a job to connect to target databases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a stored credential that can be used by a job to connect to target databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobCredentialInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String credentialName,
        JobCredentialInner parameters);

    /**
     * Creates or updates a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @param parameters A stored credential that can be used by a job to connect to target databases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a stored credential that can be used by a job to connect to target databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobCredentialInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String credentialName,
        JobCredentialInner parameters);

    /**
     * Creates or updates a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @param parameters A stored credential that can be used by a job to connect to target databases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a stored credential that can be used by a job to connect to target databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobCredentialInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String credentialName,
        JobCredentialInner parameters);

    /**
     * Creates or updates a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @param parameters A stored credential that can be used by a job to connect to target databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a stored credential that can be used by a job to connect to target databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobCredentialInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String credentialName,
        JobCredentialInner parameters,
        Context context);

    /**
     * Deletes a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String serverName, String jobAgentName, String credentialName);

    /**
     * Deletes a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName, String jobAgentName, String credentialName);

    /**
     * Deletes a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String jobAgentName, String credentialName);

    /**
     * Deletes a job credential.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param credentialName The name of the credential.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serverName, String jobAgentName, String credentialName, Context context);
}

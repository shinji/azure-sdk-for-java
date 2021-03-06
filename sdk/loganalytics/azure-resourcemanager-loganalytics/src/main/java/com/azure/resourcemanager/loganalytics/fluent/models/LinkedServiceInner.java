// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.models.LinkedServiceEntityStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The top level Linked service resource container. */
@JsonFlatten
@Fluent
public class LinkedServiceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedServiceInner.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require read access
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /*
     * The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require write access
     */
    @JsonProperty(value = "properties.writeAccessResourceId")
    private String writeAccessResourceId;

    /*
     * The provisioning state of the linked service.
     */
    @JsonProperty(value = "properties.provisioningState")
    private LinkedServiceEntityStatus provisioningState;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the resourceId property: The resource id of the resource that will be linked to the workspace. This should be
     * used for linking resources which require read access.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource id of the resource that will be linked to the workspace. This should be
     * used for linking resources which require read access.
     *
     * @param resourceId the resourceId value to set.
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the writeAccessResourceId property: The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require write access.
     *
     * @return the writeAccessResourceId value.
     */
    public String writeAccessResourceId() {
        return this.writeAccessResourceId;
    }

    /**
     * Set the writeAccessResourceId property: The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require write access.
     *
     * @param writeAccessResourceId the writeAccessResourceId value to set.
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withWriteAccessResourceId(String writeAccessResourceId) {
        this.writeAccessResourceId = writeAccessResourceId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the linked service.
     *
     * @return the provisioningState value.
     */
    public LinkedServiceEntityStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the linked service.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withProvisioningState(LinkedServiceEntityStatus provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

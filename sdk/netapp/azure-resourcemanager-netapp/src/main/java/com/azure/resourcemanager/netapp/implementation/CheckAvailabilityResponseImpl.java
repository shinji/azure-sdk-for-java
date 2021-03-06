// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.fluent.models.CheckAvailabilityResponseInner;
import com.azure.resourcemanager.netapp.models.CheckAvailabilityResponse;
import com.azure.resourcemanager.netapp.models.InAvailabilityReasonType;

public final class CheckAvailabilityResponseImpl implements CheckAvailabilityResponse {
    private CheckAvailabilityResponseInner innerObject;

    private final NetAppFilesManager serviceManager;

    CheckAvailabilityResponseImpl(CheckAvailabilityResponseInner innerObject, NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean isAvailable() {
        return this.innerModel().isAvailable();
    }

    public InAvailabilityReasonType reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckAvailabilityResponseInner innerModel() {
        return this.innerObject;
    }

    private NetAppFilesManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestackhci.models.ArcSettingAggregateState;
import com.azure.resourcemanager.azurestackhci.models.PerNodeState;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ArcSetting properties. */
@Fluent
public final class ArcSettingProperties {
    /*
     * Provisioning state of the ArcSetting proxy resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The resource group that hosts the Arc agents, ie. Hybrid Compute Machine
     * resources.
     */
    @JsonProperty(value = "arcInstanceResourceGroup")
    private String arcInstanceResourceGroup;

    /*
     * Aggregate state of Arc agent across the nodes in this HCI cluster.
     */
    @JsonProperty(value = "aggregateState", access = JsonProperty.Access.WRITE_ONLY)
    private ArcSettingAggregateState aggregateState;

    /*
     * State of Arc agent in each of the nodes.
     */
    @JsonProperty(value = "perNodeDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<PerNodeState> perNodeDetails;

    /**
     * Get the provisioningState property: Provisioning state of the ArcSetting proxy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid Compute
     * Machine resources.
     *
     * @return the arcInstanceResourceGroup value.
     */
    public String arcInstanceResourceGroup() {
        return this.arcInstanceResourceGroup;
    }

    /**
     * Set the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid Compute
     * Machine resources.
     *
     * @param arcInstanceResourceGroup the arcInstanceResourceGroup value to set.
     * @return the ArcSettingProperties object itself.
     */
    public ArcSettingProperties withArcInstanceResourceGroup(String arcInstanceResourceGroup) {
        this.arcInstanceResourceGroup = arcInstanceResourceGroup;
        return this;
    }

    /**
     * Get the aggregateState property: Aggregate state of Arc agent across the nodes in this HCI cluster.
     *
     * @return the aggregateState value.
     */
    public ArcSettingAggregateState aggregateState() {
        return this.aggregateState;
    }

    /**
     * Get the perNodeDetails property: State of Arc agent in each of the nodes.
     *
     * @return the perNodeDetails value.
     */
    public List<PerNodeState> perNodeDetails() {
        return this.perNodeDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (perNodeDetails() != null) {
            perNodeDetails().forEach(e -> e.validate());
        }
    }
}
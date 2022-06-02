// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A HDInsight compute. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("HDInsight")
@Fluent
public final class HDInsight extends Compute {
    /*
     * HDInsight compute properties
     */
    @JsonProperty(value = "properties")
    private HDInsightProperties properties;

    /**
     * Get the properties property: HDInsight compute properties.
     *
     * @return the properties value.
     */
    public HDInsightProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: HDInsight compute properties.
     *
     * @param properties the properties value to set.
     * @return the HDInsight object itself.
     */
    public HDInsight withProperties(HDInsightProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsight withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsight withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsight withDisableLocalAuth(Boolean disableLocalAuth) {
        super.withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
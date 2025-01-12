// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RankingsResponseTablesItem model. */
@Fluent
public final class RankingsResponseTablesItem {
    /*
     * The ranking property.
     */
    @JsonProperty(value = "ranking")
    private String ranking;

    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private List<RankingsResponseTablesPropertiesItemsItem> data;

    /**
     * Get the ranking property: The ranking property.
     *
     * @return the ranking value.
     */
    public String ranking() {
        return this.ranking;
    }

    /**
     * Set the ranking property: The ranking property.
     *
     * @param ranking the ranking value to set.
     * @return the RankingsResponseTablesItem object itself.
     */
    public RankingsResponseTablesItem withRanking(String ranking) {
        this.ranking = ranking;
        return this;
    }

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public List<RankingsResponseTablesPropertiesItemsItem> data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the RankingsResponseTablesItem object itself.
     */
    public RankingsResponseTablesItem withData(List<RankingsResponseTablesPropertiesItemsItem> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }
}

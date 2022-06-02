// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NCrossValidationsMode. */
public final class NCrossValidationsMode extends ExpandableStringEnum<NCrossValidationsMode> {
    /** Static value Auto for NCrossValidationsMode. */
    public static final NCrossValidationsMode AUTO = fromString("Auto");

    /** Static value Custom for NCrossValidationsMode. */
    public static final NCrossValidationsMode CUSTOM = fromString("Custom");

    /**
     * Creates or finds a NCrossValidationsMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NCrossValidationsMode.
     */
    @JsonCreator
    public static NCrossValidationsMode fromString(String name) {
        return fromString(name, NCrossValidationsMode.class);
    }

    /**
     * Gets known NCrossValidationsMode values.
     *
     * @return known NCrossValidationsMode values.
     */
    public static Collection<NCrossValidationsMode> values() {
        return values(NCrossValidationsMode.class);
    }
}
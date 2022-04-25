// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BuilderProvisioningState. */
public final class BuilderProvisioningState extends ExpandableStringEnum<BuilderProvisioningState> {
    /** Static value Creating for BuilderProvisioningState. */
    public static final BuilderProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for BuilderProvisioningState. */
    public static final BuilderProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for BuilderProvisioningState. */
    public static final BuilderProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for BuilderProvisioningState. */
    public static final BuilderProvisioningState FAILED = fromString("Failed");

    /** Static value Deleting for BuilderProvisioningState. */
    public static final BuilderProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a BuilderProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BuilderProvisioningState.
     */
    @JsonCreator
    public static BuilderProvisioningState fromString(String name) {
        return fromString(name, BuilderProvisioningState.class);
    }

    /** @return known BuilderProvisioningState values. */
    public static Collection<BuilderProvisioningState> values() {
        return values(BuilderProvisioningState.class);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.education.fluent.models.Amount;
import com.azure.resourcemanager.education.fluent.models.StudentLabDetailsInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of StudentLabDetails. */
public interface StudentLabDetails {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the displayName property: Student lab Display Name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: Detail description of this lab.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the expirationDate property: Date the lab will expire and by default will be the expiration date for each
     * student in this lab.
     *
     * @return the expirationDate value.
     */
    OffsetDateTime expirationDate();

    /**
     * Gets the role property: Student Role.
     *
     * @return the role value.
     */
    StudentRole role();

    /**
     * Gets the budget property: Student Budget.
     *
     * @return the budget value.
     */
    Amount budget();

    /**
     * Gets the subscriptionId property: Subscription Id.
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Gets the status property: Student Lab Status.
     *
     * @return the status value.
     */
    StudentLabStatus status();

    /**
     * Gets the effectiveDate property: User Added Date.
     *
     * @return the effectiveDate value.
     */
    OffsetDateTime effectiveDate();

    /**
     * Gets the labScope property: Lab Scope.
     * /providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{invoiceSectionName}/providers/Microsoft.Education/labs/default.
     *
     * @return the labScope value.
     */
    String labScope();

    /**
     * Gets the inner com.azure.resourcemanager.education.fluent.models.StudentLabDetailsInner object.
     *
     * @return the inner object.
     */
    StudentLabDetailsInner innerModel();
}
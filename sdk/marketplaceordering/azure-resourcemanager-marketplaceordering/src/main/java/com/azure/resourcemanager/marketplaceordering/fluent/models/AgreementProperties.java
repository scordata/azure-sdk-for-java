// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Agreement Terms definition. */
@Fluent
public final class AgreementProperties {
    /*
     * Publisher identifier string of image being deployed.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Offer identifier string of image being deployed.
     */
    @JsonProperty(value = "product")
    private String product;

    /*
     * Plan identifier string of image being deployed.
     */
    @JsonProperty(value = "plan")
    private String plan;

    /*
     * Link to HTML with Microsoft and Publisher terms.
     */
    @JsonProperty(value = "licenseTextLink")
    private String licenseTextLink;

    /*
     * Link to the privacy policy of the publisher.
     */
    @JsonProperty(value = "privacyPolicyLink")
    private String privacyPolicyLink;

    /*
     * Link to HTML with Azure Marketplace terms.
     */
    @JsonProperty(value = "marketplaceTermsLink")
    private String marketplaceTermsLink;

    /*
     * Date and time in UTC of when the terms were accepted. This is empty if
     * Accepted is false.
     */
    @JsonProperty(value = "retrieveDatetime")
    private OffsetDateTime retrieveDatetime;

    /*
     * Terms signature.
     */
    @JsonProperty(value = "signature")
    private String signature;

    /*
     * If any version of the terms have been accepted, otherwise false.
     */
    @JsonProperty(value = "accepted")
    private Boolean accepted;

    /**
     * Get the publisher property: Publisher identifier string of image being deployed.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: Publisher identifier string of image being deployed.
     *
     * @param publisher the publisher value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product property: Offer identifier string of image being deployed.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Offer identifier string of image being deployed.
     *
     * @param product the product value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the plan property: Plan identifier string of image being deployed.
     *
     * @return the plan value.
     */
    public String plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Plan identifier string of image being deployed.
     *
     * @param plan the plan value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withPlan(String plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the licenseTextLink property: Link to HTML with Microsoft and Publisher terms.
     *
     * @return the licenseTextLink value.
     */
    public String licenseTextLink() {
        return this.licenseTextLink;
    }

    /**
     * Set the licenseTextLink property: Link to HTML with Microsoft and Publisher terms.
     *
     * @param licenseTextLink the licenseTextLink value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withLicenseTextLink(String licenseTextLink) {
        this.licenseTextLink = licenseTextLink;
        return this;
    }

    /**
     * Get the privacyPolicyLink property: Link to the privacy policy of the publisher.
     *
     * @return the privacyPolicyLink value.
     */
    public String privacyPolicyLink() {
        return this.privacyPolicyLink;
    }

    /**
     * Set the privacyPolicyLink property: Link to the privacy policy of the publisher.
     *
     * @param privacyPolicyLink the privacyPolicyLink value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withPrivacyPolicyLink(String privacyPolicyLink) {
        this.privacyPolicyLink = privacyPolicyLink;
        return this;
    }

    /**
     * Get the marketplaceTermsLink property: Link to HTML with Azure Marketplace terms.
     *
     * @return the marketplaceTermsLink value.
     */
    public String marketplaceTermsLink() {
        return this.marketplaceTermsLink;
    }

    /**
     * Set the marketplaceTermsLink property: Link to HTML with Azure Marketplace terms.
     *
     * @param marketplaceTermsLink the marketplaceTermsLink value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withMarketplaceTermsLink(String marketplaceTermsLink) {
        this.marketplaceTermsLink = marketplaceTermsLink;
        return this;
    }

    /**
     * Get the retrieveDatetime property: Date and time in UTC of when the terms were accepted. This is empty if
     * Accepted is false.
     *
     * @return the retrieveDatetime value.
     */
    public OffsetDateTime retrieveDatetime() {
        return this.retrieveDatetime;
    }

    /**
     * Set the retrieveDatetime property: Date and time in UTC of when the terms were accepted. This is empty if
     * Accepted is false.
     *
     * @param retrieveDatetime the retrieveDatetime value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withRetrieveDatetime(OffsetDateTime retrieveDatetime) {
        this.retrieveDatetime = retrieveDatetime;
        return this;
    }

    /**
     * Get the signature property: Terms signature.
     *
     * @return the signature value.
     */
    public String signature() {
        return this.signature;
    }

    /**
     * Set the signature property: Terms signature.
     *
     * @param signature the signature value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Get the accepted property: If any version of the terms have been accepted, otherwise false.
     *
     * @return the accepted value.
     */
    public Boolean accepted() {
        return this.accepted;
    }

    /**
     * Set the accepted property: If any version of the terms have been accepted, otherwise false.
     *
     * @param accepted the accepted value to set.
     * @return the AgreementProperties object itself.
     */
    public AgreementProperties withAccepted(Boolean accepted) {
        this.accepted = accepted;
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
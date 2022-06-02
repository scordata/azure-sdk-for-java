// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ImageClassificationBase model. */
@Fluent
public class ImageClassificationBase extends ImageVertical {
    /*
     * Settings used for training the model.
     */
    @JsonProperty(value = "modelSettings")
    private ImageModelSettingsClassification modelSettings;

    /*
     * Search space for sampling different combinations of models and their
     * hyperparameters.
     */
    @JsonProperty(value = "searchSpace")
    private List<ImageModelDistributionSettingsClassification> searchSpace;

    /**
     * Get the modelSettings property: Settings used for training the model.
     *
     * @return the modelSettings value.
     */
    public ImageModelSettingsClassification modelSettings() {
        return this.modelSettings;
    }

    /**
     * Set the modelSettings property: Settings used for training the model.
     *
     * @param modelSettings the modelSettings value to set.
     * @return the ImageClassificationBase object itself.
     */
    public ImageClassificationBase withModelSettings(ImageModelSettingsClassification modelSettings) {
        this.modelSettings = modelSettings;
        return this;
    }

    /**
     * Get the searchSpace property: Search space for sampling different combinations of models and their
     * hyperparameters.
     *
     * @return the searchSpace value.
     */
    public List<ImageModelDistributionSettingsClassification> searchSpace() {
        return this.searchSpace;
    }

    /**
     * Set the searchSpace property: Search space for sampling different combinations of models and their
     * hyperparameters.
     *
     * @param searchSpace the searchSpace value to set.
     * @return the ImageClassificationBase object itself.
     */
    public ImageClassificationBase withSearchSpace(List<ImageModelDistributionSettingsClassification> searchSpace) {
        this.searchSpace = searchSpace;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageClassificationBase withDataSettings(ImageVerticalDataSettings dataSettings) {
        super.withDataSettings(dataSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageClassificationBase withLimitSettings(ImageLimitSettings limitSettings) {
        super.withLimitSettings(limitSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageClassificationBase withSweepSettings(ImageSweepSettings sweepSettings) {
        super.withSweepSettings(sweepSettings);
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
        if (modelSettings() != null) {
            modelSettings().validate();
        }
        if (searchSpace() != null) {
            searchSpace().forEach(e -> e.validate());
        }
    }
}
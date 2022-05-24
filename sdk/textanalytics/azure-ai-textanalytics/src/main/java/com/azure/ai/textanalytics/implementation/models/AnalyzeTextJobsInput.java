// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AnalyzeTextJobsInput model. */
@Fluent
public final class AnalyzeTextJobsInput {
    /*
     * Optional display name for the analysis job.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The analysisInput property.
     */
    @JsonProperty(value = "analysisInput", required = true)
    private MultiLanguageAnalysisInput analysisInput;

    /*
     * The set of tasks to execute on the input documents.
     */
    @JsonProperty(value = "tasks", required = true)
    private List<AnalyzeTextLROTask> tasks;

    /**
     * Get the displayName property: Optional display name for the analysis job.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Optional display name for the analysis job.
     *
     * @param displayName the displayName value to set.
     * @return the AnalyzeTextJobsInput object itself.
     */
    public AnalyzeTextJobsInput setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the analysisInput property: The analysisInput property.
     *
     * @return the analysisInput value.
     */
    public MultiLanguageAnalysisInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: The analysisInput property.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the AnalyzeTextJobsInput object itself.
     */
    public AnalyzeTextJobsInput setAnalysisInput(MultiLanguageAnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the tasks property: The set of tasks to execute on the input documents.
     *
     * @return the tasks value.
     */
    public List<AnalyzeTextLROTask> getTasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The set of tasks to execute on the input documents.
     *
     * @param tasks the tasks value to set.
     * @return the AnalyzeTextJobsInput object itself.
     */
    public AnalyzeTextJobsInput setTasks(List<AnalyzeTextLROTask> tasks) {
        this.tasks = tasks;
        return this;
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.BqmlIterationResultResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.BqmlTrainingRunTrainingOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BqmlTrainingRunResponse extends com.pulumi.resources.InvokeArgs {

    public static final BqmlTrainingRunResponse Empty = new BqmlTrainingRunResponse();

    /**
     * [Output-only, Beta] List of each iteration results.
     * 
     */
    @Import(name="iterationResults", required=true)
    private List<BqmlIterationResultResponse> iterationResults;

    /**
     * @return [Output-only, Beta] List of each iteration results.
     * 
     */
    public List<BqmlIterationResultResponse> iterationResults() {
        return this.iterationResults;
    }

    /**
     * [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    /**
     * @return [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    public String state() {
        return this.state;
    }

    /**
     * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    @Import(name="trainingOptions", required=true)
    private BqmlTrainingRunTrainingOptionsResponse trainingOptions;

    /**
     * @return [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    public BqmlTrainingRunTrainingOptionsResponse trainingOptions() {
        return this.trainingOptions;
    }

    private BqmlTrainingRunResponse() {}

    private BqmlTrainingRunResponse(BqmlTrainingRunResponse $) {
        this.iterationResults = $.iterationResults;
        this.startTime = $.startTime;
        this.state = $.state;
        this.trainingOptions = $.trainingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BqmlTrainingRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BqmlTrainingRunResponse $;

        public Builder() {
            $ = new BqmlTrainingRunResponse();
        }

        public Builder(BqmlTrainingRunResponse defaults) {
            $ = new BqmlTrainingRunResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param iterationResults [Output-only, Beta] List of each iteration results.
         * 
         * @return builder
         * 
         */
        public Builder iterationResults(List<BqmlIterationResultResponse> iterationResults) {
            $.iterationResults = iterationResults;
            return this;
        }

        /**
         * @param iterationResults [Output-only, Beta] List of each iteration results.
         * 
         * @return builder
         * 
         */
        public Builder iterationResults(BqmlIterationResultResponse... iterationResults) {
            return iterationResults(List.of(iterationResults));
        }

        /**
         * @param startTime [Output-only, Beta] Training run start time in milliseconds since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param state [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        /**
         * @param trainingOptions [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
         * 
         * @return builder
         * 
         */
        public Builder trainingOptions(BqmlTrainingRunTrainingOptionsResponse trainingOptions) {
            $.trainingOptions = trainingOptions;
            return this;
        }

        public BqmlTrainingRunResponse build() {
            $.iterationResults = Objects.requireNonNull($.iterationResults, "expected parameter 'iterationResults' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.trainingOptions = Objects.requireNonNull($.trainingOptions, "expected parameter 'trainingOptions' to be non-null");
            return $;
        }
    }

}

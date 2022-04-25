// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Optimization objective.
 * 
 */
public final class ObjectiveResponse extends com.pulumi.resources.InvokeArgs {

    public static final ObjectiveResponse Empty = new ObjectiveResponse();

    /**
     * Defines supported metric goals for hyperparameter tuning
     * 
     */
    @Import(name="goal", required=true)
    private String goal;

    /**
     * @return Defines supported metric goals for hyperparameter tuning
     * 
     */
    public String goal() {
        return this.goal;
    }

    /**
     * Name of the metric to optimize.
     * 
     */
    @Import(name="primaryMetric", required=true)
    private String primaryMetric;

    /**
     * @return Name of the metric to optimize.
     * 
     */
    public String primaryMetric() {
        return this.primaryMetric;
    }

    private ObjectiveResponse() {}

    private ObjectiveResponse(ObjectiveResponse $) {
        this.goal = $.goal;
        this.primaryMetric = $.primaryMetric;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectiveResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectiveResponse $;

        public Builder() {
            $ = new ObjectiveResponse();
        }

        public Builder(ObjectiveResponse defaults) {
            $ = new ObjectiveResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param goal Defines supported metric goals for hyperparameter tuning
         * 
         * @return builder
         * 
         */
        public Builder goal(String goal) {
            $.goal = goal;
            return this;
        }

        /**
         * @param primaryMetric Name of the metric to optimize.
         * 
         * @return builder
         * 
         */
        public Builder primaryMetric(String primaryMetric) {
            $.primaryMetric = primaryMetric;
            return this;
        }

        public ObjectiveResponse build() {
            $.goal = Objects.requireNonNull($.goal, "expected parameter 'goal' to be non-null");
            $.primaryMetric = Objects.requireNonNull($.primaryMetric, "expected parameter 'primaryMetric' to be non-null");
            return $;
        }
    }

}

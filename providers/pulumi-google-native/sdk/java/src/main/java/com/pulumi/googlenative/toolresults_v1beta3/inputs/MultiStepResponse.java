// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.PrimaryStepResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Details when multiple steps are run with the same configuration as a group.
 * 
 */
public final class MultiStepResponse extends com.pulumi.resources.InvokeArgs {

    public static final MultiStepResponse Empty = new MultiStepResponse();

    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    @Import(name="multistepNumber", required=true)
    private Integer multistepNumber;

    /**
     * @return Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    public Integer multistepNumber() {
        return this.multistepNumber;
    }

    /**
     * Present if it is a primary (original) step.
     * 
     */
    @Import(name="primaryStep", required=true)
    private PrimaryStepResponse primaryStep;

    /**
     * @return Present if it is a primary (original) step.
     * 
     */
    public PrimaryStepResponse primaryStep() {
        return this.primaryStep;
    }

    /**
     * Step Id of the primary (original) step, which might be this step.
     * 
     */
    @Import(name="primaryStepId", required=true)
    private String primaryStepId;

    /**
     * @return Step Id of the primary (original) step, which might be this step.
     * 
     */
    public String primaryStepId() {
        return this.primaryStepId;
    }

    private MultiStepResponse() {}

    private MultiStepResponse(MultiStepResponse $) {
        this.multistepNumber = $.multistepNumber;
        this.primaryStep = $.primaryStep;
        this.primaryStepId = $.primaryStepId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiStepResponse $;

        public Builder() {
            $ = new MultiStepResponse();
        }

        public Builder(MultiStepResponse defaults) {
            $ = new MultiStepResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param multistepNumber Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
         * 
         * @return builder
         * 
         */
        public Builder multistepNumber(Integer multistepNumber) {
            $.multistepNumber = multistepNumber;
            return this;
        }

        /**
         * @param primaryStep Present if it is a primary (original) step.
         * 
         * @return builder
         * 
         */
        public Builder primaryStep(PrimaryStepResponse primaryStep) {
            $.primaryStep = primaryStep;
            return this;
        }

        /**
         * @param primaryStepId Step Id of the primary (original) step, which might be this step.
         * 
         * @return builder
         * 
         */
        public Builder primaryStepId(String primaryStepId) {
            $.primaryStepId = primaryStepId;
            return this;
        }

        public MultiStepResponse build() {
            $.multistepNumber = Objects.requireNonNull($.multistepNumber, "expected parameter 'multistepNumber' to be non-null");
            $.primaryStep = Objects.requireNonNull($.primaryStep, "expected parameter 'primaryStep' to be non-null");
            $.primaryStepId = Objects.requireNonNull($.primaryStepId, "expected parameter 'primaryStepId' to be non-null");
            return $;
        }
    }

}

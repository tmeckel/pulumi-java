// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationRegexGetArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationValuesGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateParameterValidationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateParameterValidationGetArgs Empty = new WorkflowTemplateParameterValidationGetArgs();

    /**
     * Validation based on regular expressions.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<WorkflowTemplateParameterValidationRegexGetArgs> regex;

    /**
     * @return Validation based on regular expressions.
     * 
     */
    public Optional<Output<WorkflowTemplateParameterValidationRegexGetArgs>> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    @Import(name="values")
    private @Nullable Output<WorkflowTemplateParameterValidationValuesGetArgs> values;

    /**
     * @return Optional. Corresponds to the label values of reservation resource.
     * 
     */
    public Optional<Output<WorkflowTemplateParameterValidationValuesGetArgs>> values() {
        return Optional.ofNullable(this.values);
    }

    private WorkflowTemplateParameterValidationGetArgs() {}

    private WorkflowTemplateParameterValidationGetArgs(WorkflowTemplateParameterValidationGetArgs $) {
        this.regex = $.regex;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateParameterValidationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateParameterValidationGetArgs $;

        public Builder() {
            $ = new WorkflowTemplateParameterValidationGetArgs();
        }

        public Builder(WorkflowTemplateParameterValidationGetArgs defaults) {
            $ = new WorkflowTemplateParameterValidationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regex Validation based on regular expressions.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<WorkflowTemplateParameterValidationRegexGetArgs> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex Validation based on regular expressions.
         * 
         * @return builder
         * 
         */
        public Builder regex(WorkflowTemplateParameterValidationRegexGetArgs regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param values Optional. Corresponds to the label values of reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<WorkflowTemplateParameterValidationValuesGetArgs> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Optional. Corresponds to the label values of reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(WorkflowTemplateParameterValidationValuesGetArgs values) {
            return values(Output.of(values));
        }

        public WorkflowTemplateParameterValidationGetArgs build() {
            return $;
        }
    }

}

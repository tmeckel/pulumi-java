// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.enums.JobValidationMode;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration to attach Rulesets to the job
 * 
 */
public final class JobValidationConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final JobValidationConfiguration Empty = new JobValidationConfiguration();

    /**
     * Arn of the Ruleset
     * 
     */
    @Import(name="rulesetArn", required=true)
    private String rulesetArn;

    /**
     * @return Arn of the Ruleset
     * 
     */
    public String rulesetArn() {
        return this.rulesetArn;
    }

    @Import(name="validationMode")
    private @Nullable JobValidationMode validationMode;

    public Optional<JobValidationMode> validationMode() {
        return Optional.ofNullable(this.validationMode);
    }

    private JobValidationConfiguration() {}

    private JobValidationConfiguration(JobValidationConfiguration $) {
        this.rulesetArn = $.rulesetArn;
        this.validationMode = $.validationMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobValidationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobValidationConfiguration $;

        public Builder() {
            $ = new JobValidationConfiguration();
        }

        public Builder(JobValidationConfiguration defaults) {
            $ = new JobValidationConfiguration(Objects.requireNonNull(defaults));
        }

        /**
         * @param rulesetArn Arn of the Ruleset
         * 
         * @return builder
         * 
         */
        public Builder rulesetArn(String rulesetArn) {
            $.rulesetArn = rulesetArn;
            return this;
        }

        public Builder validationMode(@Nullable JobValidationMode validationMode) {
            $.validationMode = validationMode;
            return this;
        }

        public JobValidationConfiguration build() {
            $.rulesetArn = Objects.requireNonNull($.rulesetArn, "expected parameter 'rulesetArn' to be non-null");
            return $;
        }
    }

}

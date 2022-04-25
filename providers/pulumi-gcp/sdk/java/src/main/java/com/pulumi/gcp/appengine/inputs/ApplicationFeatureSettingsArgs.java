// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ApplicationFeatureSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationFeatureSettingsArgs Empty = new ApplicationFeatureSettingsArgs();

    /**
     * Set to false to use the legacy health check instead of the readiness
     * and liveness checks.
     * 
     */
    @Import(name="splitHealthChecks", required=true)
    private Output<Boolean> splitHealthChecks;

    /**
     * @return Set to false to use the legacy health check instead of the readiness
     * and liveness checks.
     * 
     */
    public Output<Boolean> splitHealthChecks() {
        return this.splitHealthChecks;
    }

    private ApplicationFeatureSettingsArgs() {}

    private ApplicationFeatureSettingsArgs(ApplicationFeatureSettingsArgs $) {
        this.splitHealthChecks = $.splitHealthChecks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationFeatureSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationFeatureSettingsArgs $;

        public Builder() {
            $ = new ApplicationFeatureSettingsArgs();
        }

        public Builder(ApplicationFeatureSettingsArgs defaults) {
            $ = new ApplicationFeatureSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param splitHealthChecks Set to false to use the legacy health check instead of the readiness
         * and liveness checks.
         * 
         * @return builder
         * 
         */
        public Builder splitHealthChecks(Output<Boolean> splitHealthChecks) {
            $.splitHealthChecks = splitHealthChecks;
            return this;
        }

        /**
         * @param splitHealthChecks Set to false to use the legacy health check instead of the readiness
         * and liveness checks.
         * 
         * @return builder
         * 
         */
        public Builder splitHealthChecks(Boolean splitHealthChecks) {
            return splitHealthChecks(Output.of(splitHealthChecks));
        }

        public ApplicationFeatureSettingsArgs build() {
            $.splitHealthChecks = Objects.requireNonNull($.splitHealthChecks, "expected parameter 'splitHealthChecks' to be non-null");
            return $;
        }
    }

}

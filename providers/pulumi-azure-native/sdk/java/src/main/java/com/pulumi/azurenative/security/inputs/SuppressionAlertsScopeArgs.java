// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.ScopeElementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class SuppressionAlertsScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SuppressionAlertsScopeArgs Empty = new SuppressionAlertsScopeArgs();

    /**
     * All the conditions inside need to be true in order to suppress the alert
     * 
     */
    @Import(name="allOf", required=true)
    private Output<List<ScopeElementArgs>> allOf;

    /**
     * @return All the conditions inside need to be true in order to suppress the alert
     * 
     */
    public Output<List<ScopeElementArgs>> allOf() {
        return this.allOf;
    }

    private SuppressionAlertsScopeArgs() {}

    private SuppressionAlertsScopeArgs(SuppressionAlertsScopeArgs $) {
        this.allOf = $.allOf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SuppressionAlertsScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SuppressionAlertsScopeArgs $;

        public Builder() {
            $ = new SuppressionAlertsScopeArgs();
        }

        public Builder(SuppressionAlertsScopeArgs defaults) {
            $ = new SuppressionAlertsScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allOf All the conditions inside need to be true in order to suppress the alert
         * 
         * @return builder
         * 
         */
        public Builder allOf(Output<List<ScopeElementArgs>> allOf) {
            $.allOf = allOf;
            return this;
        }

        /**
         * @param allOf All the conditions inside need to be true in order to suppress the alert
         * 
         * @return builder
         * 
         */
        public Builder allOf(List<ScopeElementArgs> allOf) {
            return allOf(Output.of(allOf));
        }

        /**
         * @param allOf All the conditions inside need to be true in order to suppress the alert
         * 
         * @return builder
         * 
         */
        public Builder allOf(ScopeElementArgs... allOf) {
            return allOf(List.of(allOf));
        }

        public SuppressionAlertsScopeArgs build() {
            $.allOf = Objects.requireNonNull($.allOf, "expected parameter 'allOf' to be non-null");
            return $;
        }
    }

}

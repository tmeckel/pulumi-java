// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Identity related configuration, including service account based secure multi-tenancy user mappings.
 * 
 */
public final class IdentityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityConfigArgs Empty = new IdentityConfigArgs();

    /**
     * Map of user to service account.
     * 
     */
    @Import(name="userServiceAccountMapping", required=true)
    private Output<Map<String,String>> userServiceAccountMapping;

    /**
     * @return Map of user to service account.
     * 
     */
    public Output<Map<String,String>> userServiceAccountMapping() {
        return this.userServiceAccountMapping;
    }

    private IdentityConfigArgs() {}

    private IdentityConfigArgs(IdentityConfigArgs $) {
        this.userServiceAccountMapping = $.userServiceAccountMapping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityConfigArgs $;

        public Builder() {
            $ = new IdentityConfigArgs();
        }

        public Builder(IdentityConfigArgs defaults) {
            $ = new IdentityConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userServiceAccountMapping Map of user to service account.
         * 
         * @return builder
         * 
         */
        public Builder userServiceAccountMapping(Output<Map<String,String>> userServiceAccountMapping) {
            $.userServiceAccountMapping = userServiceAccountMapping;
            return this;
        }

        /**
         * @param userServiceAccountMapping Map of user to service account.
         * 
         * @return builder
         * 
         */
        public Builder userServiceAccountMapping(Map<String,String> userServiceAccountMapping) {
            return userServiceAccountMapping(Output.of(userServiceAccountMapping));
        }

        public IdentityConfigArgs build() {
            $.userServiceAccountMapping = Objects.requireNonNull($.userServiceAccountMapping, "expected parameter 'userServiceAccountMapping' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerBuildSecretGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSecretGetArgs Empty = new TriggerBuildSecretGetArgs();

    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
     */
    @Import(name="kmsKeyName", required=true)
    private Output<String> kmsKeyName;

    /**
     * @return Cloud KMS key name to use to decrypt these envs.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    @Import(name="secretEnv")
    private @Nullable Output<Map<String,String>> secretEnv;

    /**
     * @return A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    public Optional<Output<Map<String,String>>> secretEnv() {
        return Optional.ofNullable(this.secretEnv);
    }

    private TriggerBuildSecretGetArgs() {}

    private TriggerBuildSecretGetArgs(TriggerBuildSecretGetArgs $) {
        this.kmsKeyName = $.kmsKeyName;
        this.secretEnv = $.secretEnv;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerBuildSecretGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerBuildSecretGetArgs $;

        public Builder() {
            $ = new TriggerBuildSecretGetArgs();
        }

        public Builder(TriggerBuildSecretGetArgs defaults) {
            $ = new TriggerBuildSecretGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName Cloud KMS key name to use to decrypt these envs.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Cloud KMS key name to use to decrypt these envs.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param secretEnv A list of global environment variables, which are encrypted using a Cloud Key Management
         * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
         * will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnv(@Nullable Output<Map<String,String>> secretEnv) {
            $.secretEnv = secretEnv;
            return this;
        }

        /**
         * @param secretEnv A list of global environment variables, which are encrypted using a Cloud Key Management
         * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
         * will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnv(Map<String,String> secretEnv) {
            return secretEnv(Output.of(secretEnv));
        }

        public TriggerBuildSecretGetArgs build() {
            $.kmsKeyName = Objects.requireNonNull($.kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
            return $;
        }
    }

}

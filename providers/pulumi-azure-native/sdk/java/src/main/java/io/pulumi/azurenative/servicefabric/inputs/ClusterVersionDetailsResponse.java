// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The detail of the Service Fabric runtime version result
 * 
 */
public final class ClusterVersionDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterVersionDetailsResponse Empty = new ClusterVersionDetailsResponse();

    /**
     * The Service Fabric runtime version of the cluster.
     * 
     */
    @InputImport(name="codeVersion")
      private final @Nullable String codeVersion;

    public Optional<String> getCodeVersion() {
        return this.codeVersion == null ? Optional.empty() : Optional.ofNullable(this.codeVersion);
    }

    /**
     * Indicates if this version is for Windows or Linux operating system.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable String environment;

    public Optional<String> getEnvironment() {
        return this.environment == null ? Optional.empty() : Optional.ofNullable(this.environment);
    }

    /**
     * The date of expiry of support of the version.
     * 
     */
    @InputImport(name="supportExpiryUtc")
      private final @Nullable String supportExpiryUtc;

    public Optional<String> getSupportExpiryUtc() {
        return this.supportExpiryUtc == null ? Optional.empty() : Optional.ofNullable(this.supportExpiryUtc);
    }

    public ClusterVersionDetailsResponse(
        @Nullable String codeVersion,
        @Nullable String environment,
        @Nullable String supportExpiryUtc) {
        this.codeVersion = codeVersion;
        this.environment = environment;
        this.supportExpiryUtc = supportExpiryUtc;
    }

    private ClusterVersionDetailsResponse() {
        this.codeVersion = null;
        this.environment = null;
        this.supportExpiryUtc = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterVersionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeVersion;
        private @Nullable String environment;
        private @Nullable String supportExpiryUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterVersionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeVersion = defaults.codeVersion;
    	      this.environment = defaults.environment;
    	      this.supportExpiryUtc = defaults.supportExpiryUtc;
        }

        public Builder codeVersion(@Nullable String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        public Builder environment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }

        public Builder supportExpiryUtc(@Nullable String supportExpiryUtc) {
            this.supportExpiryUtc = supportExpiryUtc;
            return this;
        }
        public ClusterVersionDetailsResponse build() {
            return new ClusterVersionDetailsResponse(codeVersion, environment, supportExpiryUtc);
        }
    }
}

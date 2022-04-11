// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.CspmMonitorAwsOfferingNativeCloudConnectionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The CSPM monitoring for AWS offering configurations
 * 
 */
public final class CspmMonitorAwsOfferingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CspmMonitorAwsOfferingArgs Empty = new CspmMonitorAwsOfferingArgs();

    /**
     * The native cloud connection configuration
     * 
     */
    @Import(name="nativeCloudConnection")
      private final @Nullable Output<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection;

    public Output<CspmMonitorAwsOfferingNativeCloudConnectionArgs> getNativeCloudConnection() {
        return this.nativeCloudConnection == null ? Codegen.empty() : this.nativeCloudConnection;
    }

    /**
     * The type of the security offering.
     * Expected value is 'CspmMonitorAws'.
     * 
     */
    @Import(name="offeringType", required=true)
      private final Output<String> offeringType;

    public Output<String> getOfferingType() {
        return this.offeringType;
    }

    public CspmMonitorAwsOfferingArgs(
        @Nullable Output<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection,
        Output<String> offeringType) {
        this.nativeCloudConnection = nativeCloudConnection;
        this.offeringType = Objects.requireNonNull(offeringType, "expected parameter 'offeringType' to be non-null");
    }

    private CspmMonitorAwsOfferingArgs() {
        this.nativeCloudConnection = Codegen.empty();
        this.offeringType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CspmMonitorAwsOfferingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection;
        private Output<String> offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(CspmMonitorAwsOfferingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nativeCloudConnection = defaults.nativeCloudConnection;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder nativeCloudConnection(@Nullable Output<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection) {
            this.nativeCloudConnection = nativeCloudConnection;
            return this;
        }
        public Builder nativeCloudConnection(@Nullable CspmMonitorAwsOfferingNativeCloudConnectionArgs nativeCloudConnection) {
            this.nativeCloudConnection = Codegen.ofNullable(nativeCloudConnection);
            return this;
        }
        public Builder offeringType(Output<String> offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }
        public Builder offeringType(String offeringType) {
            this.offeringType = Output.of(Objects.requireNonNull(offeringType));
            return this;
        }        public CspmMonitorAwsOfferingArgs build() {
            return new CspmMonitorAwsOfferingArgs(nativeCloudConnection, offeringType);
        }
    }
}

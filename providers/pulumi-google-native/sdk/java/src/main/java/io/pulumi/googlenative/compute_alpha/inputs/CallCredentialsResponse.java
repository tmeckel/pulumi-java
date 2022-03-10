// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.MetadataCredentialsFromPluginResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] gRPC call credentials to access the SDS server. gRPC call credentials to access the SDS server.
 * 
 */
public final class CallCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CallCredentialsResponse Empty = new CallCredentialsResponse();

    /**
     * The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
     * 
     */
    @InputImport(name="callCredentialType", required=true)
      private final String callCredentialType;

    public String getCallCredentialType() {
        return this.callCredentialType;
    }

    /**
     * Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
     * 
     */
    @InputImport(name="fromPlugin", required=true)
      private final MetadataCredentialsFromPluginResponse fromPlugin;

    public MetadataCredentialsFromPluginResponse getFromPlugin() {
        return this.fromPlugin;
    }

    public CallCredentialsResponse(
        String callCredentialType,
        MetadataCredentialsFromPluginResponse fromPlugin) {
        this.callCredentialType = Objects.requireNonNull(callCredentialType, "expected parameter 'callCredentialType' to be non-null");
        this.fromPlugin = Objects.requireNonNull(fromPlugin, "expected parameter 'fromPlugin' to be non-null");
    }

    private CallCredentialsResponse() {
        this.callCredentialType = null;
        this.fromPlugin = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CallCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callCredentialType;
        private MetadataCredentialsFromPluginResponse fromPlugin;

        public Builder() {
    	      // Empty
        }

        public Builder(CallCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callCredentialType = defaults.callCredentialType;
    	      this.fromPlugin = defaults.fromPlugin;
        }

        public Builder callCredentialType(String callCredentialType) {
            this.callCredentialType = Objects.requireNonNull(callCredentialType);
            return this;
        }

        public Builder fromPlugin(MetadataCredentialsFromPluginResponse fromPlugin) {
            this.fromPlugin = Objects.requireNonNull(fromPlugin);
            return this;
        }
        public CallCredentialsResponse build() {
            return new CallCredentialsResponse(callCredentialType, fromPlugin);
        }
    }
}

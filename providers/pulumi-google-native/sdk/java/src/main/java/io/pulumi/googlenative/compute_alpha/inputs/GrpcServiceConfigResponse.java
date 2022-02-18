// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.CallCredentialsResponse;
import io.pulumi.googlenative.compute_alpha.inputs.ChannelCredentialsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] gRPC config to access the SDS server. gRPC config to access the SDS server.
 * 
 */
public final class GrpcServiceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GrpcServiceConfigResponse Empty = new GrpcServiceConfigResponse();

    /**
     * The call credentials to access the SDS server.
     * 
     */
    @InputImport(name="callCredentials", required=true)
    private final CallCredentialsResponse callCredentials;

    public CallCredentialsResponse getCallCredentials() {
        return this.callCredentials;
    }

    /**
     * The channel credentials to access the SDS server.
     * 
     */
    @InputImport(name="channelCredentials", required=true)
    private final ChannelCredentialsResponse channelCredentials;

    public ChannelCredentialsResponse getChannelCredentials() {
        return this.channelCredentials;
    }

    /**
     * The target URI of the SDS server.
     * 
     */
    @InputImport(name="targetUri", required=true)
    private final String targetUri;

    public String getTargetUri() {
        return this.targetUri;
    }

    public GrpcServiceConfigResponse(
        CallCredentialsResponse callCredentials,
        ChannelCredentialsResponse channelCredentials,
        String targetUri) {
        this.callCredentials = Objects.requireNonNull(callCredentials, "expected parameter 'callCredentials' to be non-null");
        this.channelCredentials = Objects.requireNonNull(channelCredentials, "expected parameter 'channelCredentials' to be non-null");
        this.targetUri = Objects.requireNonNull(targetUri, "expected parameter 'targetUri' to be non-null");
    }

    private GrpcServiceConfigResponse() {
        this.callCredentials = null;
        this.channelCredentials = null;
        this.targetUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcServiceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CallCredentialsResponse callCredentials;
        private ChannelCredentialsResponse channelCredentials;
        private String targetUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GrpcServiceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callCredentials = defaults.callCredentials;
    	      this.channelCredentials = defaults.channelCredentials;
    	      this.targetUri = defaults.targetUri;
        }

        public Builder setCallCredentials(CallCredentialsResponse callCredentials) {
            this.callCredentials = Objects.requireNonNull(callCredentials);
            return this;
        }

        public Builder setChannelCredentials(ChannelCredentialsResponse channelCredentials) {
            this.channelCredentials = Objects.requireNonNull(channelCredentials);
            return this;
        }

        public Builder setTargetUri(String targetUri) {
            this.targetUri = Objects.requireNonNull(targetUri);
            return this;
        }

        public GrpcServiceConfigResponse build() {
            return new GrpcServiceConfigResponse(callCredentials, channelCredentials, targetUri);
        }
    }
}

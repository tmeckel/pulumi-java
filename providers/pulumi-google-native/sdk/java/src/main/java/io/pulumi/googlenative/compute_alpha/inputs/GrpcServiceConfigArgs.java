// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.CallCredentialsArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ChannelCredentialsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] gRPC config to access the SDS server. gRPC config to access the SDS server.
 * 
 */
public final class GrpcServiceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrpcServiceConfigArgs Empty = new GrpcServiceConfigArgs();

    /**
     * The call credentials to access the SDS server.
     * 
     */
    @InputImport(name="callCredentials")
    private final @Nullable Input<CallCredentialsArgs> callCredentials;

    public Input<CallCredentialsArgs> getCallCredentials() {
        return this.callCredentials == null ? Input.empty() : this.callCredentials;
    }

    /**
     * The channel credentials to access the SDS server.
     * 
     */
    @InputImport(name="channelCredentials")
    private final @Nullable Input<ChannelCredentialsArgs> channelCredentials;

    public Input<ChannelCredentialsArgs> getChannelCredentials() {
        return this.channelCredentials == null ? Input.empty() : this.channelCredentials;
    }

    /**
     * The target URI of the SDS server.
     * 
     */
    @InputImport(name="targetUri")
    private final @Nullable Input<String> targetUri;

    public Input<String> getTargetUri() {
        return this.targetUri == null ? Input.empty() : this.targetUri;
    }

    public GrpcServiceConfigArgs(
        @Nullable Input<CallCredentialsArgs> callCredentials,
        @Nullable Input<ChannelCredentialsArgs> channelCredentials,
        @Nullable Input<String> targetUri) {
        this.callCredentials = callCredentials;
        this.channelCredentials = channelCredentials;
        this.targetUri = targetUri;
    }

    private GrpcServiceConfigArgs() {
        this.callCredentials = Input.empty();
        this.channelCredentials = Input.empty();
        this.targetUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcServiceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CallCredentialsArgs> callCredentials;
        private @Nullable Input<ChannelCredentialsArgs> channelCredentials;
        private @Nullable Input<String> targetUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GrpcServiceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callCredentials = defaults.callCredentials;
    	      this.channelCredentials = defaults.channelCredentials;
    	      this.targetUri = defaults.targetUri;
        }

        public Builder setCallCredentials(@Nullable Input<CallCredentialsArgs> callCredentials) {
            this.callCredentials = callCredentials;
            return this;
        }

        public Builder setCallCredentials(@Nullable CallCredentialsArgs callCredentials) {
            this.callCredentials = Input.ofNullable(callCredentials);
            return this;
        }

        public Builder setChannelCredentials(@Nullable Input<ChannelCredentialsArgs> channelCredentials) {
            this.channelCredentials = channelCredentials;
            return this;
        }

        public Builder setChannelCredentials(@Nullable ChannelCredentialsArgs channelCredentials) {
            this.channelCredentials = Input.ofNullable(channelCredentials);
            return this;
        }

        public Builder setTargetUri(@Nullable Input<String> targetUri) {
            this.targetUri = targetUri;
            return this;
        }

        public Builder setTargetUri(@Nullable String targetUri) {
            this.targetUri = Input.ofNullable(targetUri);
            return this;
        }

        public GrpcServiceConfigArgs build() {
            return new GrpcServiceConfigArgs(callCredentials, channelCredentials, targetUri);
        }
    }
}

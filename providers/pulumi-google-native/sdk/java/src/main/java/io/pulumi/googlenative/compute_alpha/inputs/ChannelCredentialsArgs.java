// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.ChannelCredentialsChannelCredentialType;
import io.pulumi.googlenative.compute_alpha.inputs.TlsCertificatePathsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] gRPC channel credentials to access the SDS server. gRPC channel credentials to access the SDS server.
 * 
 */
public final class ChannelCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelCredentialsArgs Empty = new ChannelCredentialsArgs();

    /**
     * The call credentials to access the SDS server.
     * 
     */
    @Import(name="certificates")
      private final @Nullable Output<TlsCertificatePathsArgs> certificates;

    public Output<TlsCertificatePathsArgs> getCertificates() {
        return this.certificates == null ? Codegen.empty() : this.certificates;
    }

    /**
     * The channel credentials to access the SDS server. This field can be set to one of the following: CERTIFICATES: Use TLS certificates to access the SDS server. GCE_VM: Use local GCE VM credentials to access the SDS server.
     * 
     */
    @Import(name="channelCredentialType")
      private final @Nullable Output<ChannelCredentialsChannelCredentialType> channelCredentialType;

    public Output<ChannelCredentialsChannelCredentialType> getChannelCredentialType() {
        return this.channelCredentialType == null ? Codegen.empty() : this.channelCredentialType;
    }

    public ChannelCredentialsArgs(
        @Nullable Output<TlsCertificatePathsArgs> certificates,
        @Nullable Output<ChannelCredentialsChannelCredentialType> channelCredentialType) {
        this.certificates = certificates;
        this.channelCredentialType = channelCredentialType;
    }

    private ChannelCredentialsArgs() {
        this.certificates = Codegen.empty();
        this.channelCredentialType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TlsCertificatePathsArgs> certificates;
        private @Nullable Output<ChannelCredentialsChannelCredentialType> channelCredentialType;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.channelCredentialType = defaults.channelCredentialType;
        }

        public Builder certificates(@Nullable Output<TlsCertificatePathsArgs> certificates) {
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(@Nullable TlsCertificatePathsArgs certificates) {
            this.certificates = Codegen.ofNullable(certificates);
            return this;
        }
        public Builder channelCredentialType(@Nullable Output<ChannelCredentialsChannelCredentialType> channelCredentialType) {
            this.channelCredentialType = channelCredentialType;
            return this;
        }
        public Builder channelCredentialType(@Nullable ChannelCredentialsChannelCredentialType channelCredentialType) {
            this.channelCredentialType = Codegen.ofNullable(channelCredentialType);
            return this;
        }        public ChannelCredentialsArgs build() {
            return new ChannelCredentialsArgs(certificates, channelCredentialType);
        }
    }
}

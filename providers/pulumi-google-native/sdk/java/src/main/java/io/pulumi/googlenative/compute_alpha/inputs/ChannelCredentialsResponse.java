// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.TlsCertificatePathsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] gRPC channel credentials to access the SDS server. gRPC channel credentials to access the SDS server.
 * 
 */
public final class ChannelCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ChannelCredentialsResponse Empty = new ChannelCredentialsResponse();

    /**
     * The call credentials to access the SDS server.
     * 
     */
    @InputImport(name="certificates", required=true)
      private final TlsCertificatePathsResponse certificates;

    public TlsCertificatePathsResponse getCertificates() {
        return this.certificates;
    }

    /**
     * The channel credentials to access the SDS server. This field can be set to one of the following: CERTIFICATES: Use TLS certificates to access the SDS server. GCE_VM: Use local GCE VM credentials to access the SDS server.
     * 
     */
    @InputImport(name="channelCredentialType", required=true)
      private final String channelCredentialType;

    public String getChannelCredentialType() {
        return this.channelCredentialType;
    }

    public ChannelCredentialsResponse(
        TlsCertificatePathsResponse certificates,
        String channelCredentialType) {
        this.certificates = Objects.requireNonNull(certificates, "expected parameter 'certificates' to be non-null");
        this.channelCredentialType = Objects.requireNonNull(channelCredentialType, "expected parameter 'channelCredentialType' to be non-null");
    }

    private ChannelCredentialsResponse() {
        this.certificates = null;
        this.channelCredentialType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificatePathsResponse certificates;
        private String channelCredentialType;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.channelCredentialType = defaults.channelCredentialType;
        }

        public Builder certificates(TlsCertificatePathsResponse certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }

        public Builder channelCredentialType(String channelCredentialType) {
            this.channelCredentialType = Objects.requireNonNull(channelCredentialType);
            return this;
        }
        public ChannelCredentialsResponse build() {
            return new ChannelCredentialsResponse(certificates, channelCredentialType);
        }
    }
}

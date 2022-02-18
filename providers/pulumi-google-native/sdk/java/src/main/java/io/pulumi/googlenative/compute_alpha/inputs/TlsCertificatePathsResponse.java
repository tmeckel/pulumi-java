// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] The paths to the mounted TLS Certificates and private key. The paths to the mounted TLS Certificates and private key.
 * 
 */
public final class TlsCertificatePathsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TlsCertificatePathsResponse Empty = new TlsCertificatePathsResponse();

    /**
     * The path to the file holding the client or server TLS certificate to use.
     * 
     */
    @InputImport(name="certificatePath", required=true)
    private final String certificatePath;

    public String getCertificatePath() {
        return this.certificatePath;
    }

    /**
     * The path to the file holding the client or server private key.
     * 
     */
    @InputImport(name="privateKeyPath", required=true)
    private final String privateKeyPath;

    public String getPrivateKeyPath() {
        return this.privateKeyPath;
    }

    public TlsCertificatePathsResponse(
        String certificatePath,
        String privateKeyPath) {
        this.certificatePath = Objects.requireNonNull(certificatePath, "expected parameter 'certificatePath' to be non-null");
        this.privateKeyPath = Objects.requireNonNull(privateKeyPath, "expected parameter 'privateKeyPath' to be non-null");
    }

    private TlsCertificatePathsResponse() {
        this.certificatePath = null;
        this.privateKeyPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificatePathsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificatePath;
        private String privateKeyPath;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificatePathsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePath = defaults.certificatePath;
    	      this.privateKeyPath = defaults.privateKeyPath;
        }

        public Builder setCertificatePath(String certificatePath) {
            this.certificatePath = Objects.requireNonNull(certificatePath);
            return this;
        }

        public Builder setPrivateKeyPath(String privateKeyPath) {
            this.privateKeyPath = Objects.requireNonNull(privateKeyPath);
            return this;
        }

        public TlsCertificatePathsResponse build() {
            return new TlsCertificatePathsResponse(certificatePath, privateKeyPath);
        }
    }
}

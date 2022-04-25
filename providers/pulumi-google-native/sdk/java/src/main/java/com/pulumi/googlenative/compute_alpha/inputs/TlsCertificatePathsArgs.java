// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [Deprecated] The paths to the mounted TLS Certificates and private key. The paths to the mounted TLS Certificates and private key.
 * 
 */
public final class TlsCertificatePathsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsCertificatePathsArgs Empty = new TlsCertificatePathsArgs();

    /**
     * The path to the file holding the client or server TLS certificate to use.
     * 
     */
    @Import(name="certificatePath")
    private @Nullable Output<String> certificatePath;

    /**
     * @return The path to the file holding the client or server TLS certificate to use.
     * 
     */
    public Optional<Output<String>> certificatePath() {
        return Optional.ofNullable(this.certificatePath);
    }

    /**
     * The path to the file holding the client or server private key.
     * 
     */
    @Import(name="privateKeyPath")
    private @Nullable Output<String> privateKeyPath;

    /**
     * @return The path to the file holding the client or server private key.
     * 
     */
    public Optional<Output<String>> privateKeyPath() {
        return Optional.ofNullable(this.privateKeyPath);
    }

    private TlsCertificatePathsArgs() {}

    private TlsCertificatePathsArgs(TlsCertificatePathsArgs $) {
        this.certificatePath = $.certificatePath;
        this.privateKeyPath = $.privateKeyPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsCertificatePathsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificatePathsArgs $;

        public Builder() {
            $ = new TlsCertificatePathsArgs();
        }

        public Builder(TlsCertificatePathsArgs defaults) {
            $ = new TlsCertificatePathsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificatePath The path to the file holding the client or server TLS certificate to use.
         * 
         * @return builder
         * 
         */
        public Builder certificatePath(@Nullable Output<String> certificatePath) {
            $.certificatePath = certificatePath;
            return this;
        }

        /**
         * @param certificatePath The path to the file holding the client or server TLS certificate to use.
         * 
         * @return builder
         * 
         */
        public Builder certificatePath(String certificatePath) {
            return certificatePath(Output.of(certificatePath));
        }

        /**
         * @param privateKeyPath The path to the file holding the client or server private key.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPath(@Nullable Output<String> privateKeyPath) {
            $.privateKeyPath = privateKeyPath;
            return this;
        }

        /**
         * @param privateKeyPath The path to the file holding the client or server private key.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPath(String privateKeyPath) {
            return privateKeyPath(Output.of(privateKeyPath));
        }

        public TlsCertificatePathsArgs build() {
            return $;
        }
    }

}

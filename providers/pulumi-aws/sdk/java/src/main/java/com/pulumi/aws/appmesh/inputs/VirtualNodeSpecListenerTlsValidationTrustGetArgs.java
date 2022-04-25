// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustFileGetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsValidationTrustGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsValidationTrustGetArgs Empty = new VirtualNodeSpecListenerTlsValidationTrustGetArgs();

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
    private @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file;

    /**
     * @return The TLS validation context trust for a local file certificate.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
    private @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds;

    /**
     * @return The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs>> sds() {
        return Optional.ofNullable(this.sds);
    }

    private VirtualNodeSpecListenerTlsValidationTrustGetArgs() {}

    private VirtualNodeSpecListenerTlsValidationTrustGetArgs(VirtualNodeSpecListenerTlsValidationTrustGetArgs $) {
        this.file = $.file;
        this.sds = $.sds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTlsValidationTrustGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTlsValidationTrustGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTlsValidationTrustGetArgs();
        }

        public Builder(VirtualNodeSpecListenerTlsValidationTrustGetArgs defaults) {
            $ = new VirtualNodeSpecListenerTlsValidationTrustGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param file The TLS validation context trust for a local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file The TLS validation context trust for a local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(VirtualNodeSpecListenerTlsValidationTrustFileGetArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param sds The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(@Nullable Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds) {
            $.sds = sds;
            return this;
        }

        /**
         * @param sds The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs sds) {
            return sds(Output.of(sds));
        }

        public VirtualNodeSpecListenerTlsValidationTrustGetArgs build() {
            return $;
        }
    }

}

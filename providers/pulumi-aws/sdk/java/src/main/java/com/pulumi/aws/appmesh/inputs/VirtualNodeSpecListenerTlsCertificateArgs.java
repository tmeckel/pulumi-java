// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateAcmArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateFileArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateSdsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsCertificateArgs Empty = new VirtualNodeSpecListenerTlsCertificateArgs();

    /**
     * An AWS Certificate Manager (ACM) certificate.
     * 
     */
    @Import(name="acm")
    private @Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmArgs> acm;

    /**
     * @return An AWS Certificate Manager (ACM) certificate.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTlsCertificateAcmArgs>> acm() {
        return Optional.ofNullable(this.acm);
    }

    /**
     * A local file certificate.
     * 
     */
    @Import(name="file")
    private @Nullable Output<VirtualNodeSpecListenerTlsCertificateFileArgs> file;

    /**
     * @return A local file certificate.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTlsCertificateFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
    private @Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsArgs> sds;

    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTlsCertificateSdsArgs>> sds() {
        return Optional.ofNullable(this.sds);
    }

    private VirtualNodeSpecListenerTlsCertificateArgs() {}

    private VirtualNodeSpecListenerTlsCertificateArgs(VirtualNodeSpecListenerTlsCertificateArgs $) {
        this.acm = $.acm;
        this.file = $.file;
        this.sds = $.sds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTlsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTlsCertificateArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTlsCertificateArgs();
        }

        public Builder(VirtualNodeSpecListenerTlsCertificateArgs defaults) {
            $ = new VirtualNodeSpecListenerTlsCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acm An AWS Certificate Manager (ACM) certificate.
         * 
         * @return builder
         * 
         */
        public Builder acm(@Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmArgs> acm) {
            $.acm = acm;
            return this;
        }

        /**
         * @param acm An AWS Certificate Manager (ACM) certificate.
         * 
         * @return builder
         * 
         */
        public Builder acm(VirtualNodeSpecListenerTlsCertificateAcmArgs acm) {
            return acm(Output.of(acm));
        }

        /**
         * @param file A local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<VirtualNodeSpecListenerTlsCertificateFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file A local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(VirtualNodeSpecListenerTlsCertificateFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(@Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsArgs> sds) {
            $.sds = sds;
            return this;
        }

        /**
         * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(VirtualNodeSpecListenerTlsCertificateSdsArgs sds) {
            return sds(Output.of(sds));
        }

        public VirtualNodeSpecListenerTlsCertificateArgs build() {
            return $;
        }
    }

}

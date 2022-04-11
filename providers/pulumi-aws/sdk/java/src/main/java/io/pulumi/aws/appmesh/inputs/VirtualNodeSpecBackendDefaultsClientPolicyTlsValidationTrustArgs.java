// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs();

    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    @Import(name="acm")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs> acm;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs> getAcm() {
        return this.acm == null ? Codegen.empty() : this.acm;
    }

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs> file;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs> getFile() {
        return this.file == null ? Codegen.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs> sds;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs> getSds() {
        return this.sds == null ? Codegen.empty() : this.sds;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs(
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs> acm,
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs> file,
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs() {
        this.acm = Codegen.empty();
        this.file = Codegen.empty();
        this.sds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs> acm;
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs> file;
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs> acm) {
            this.acm = acm;
            return this;
        }
        public Builder acm(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmArgs acm) {
            this.acm = Codegen.ofNullable(acm);
            return this;
        }
        public Builder file(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileArgs file) {
            this.file = Codegen.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs sds) {
            this.sds = Codegen.ofNullable(sds);
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs(acm, file, sds);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs();

    /**
     * The name of the secret for a virtual node's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @Import(name="secretName", required=true)
      private final Output<String> secretName;

    public Output<String> getSecretName() {
        return this.secretName;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs(Output<String> secretName) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs() {
        this.secretName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        public Builder secretName(Output<String> secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Output.of(Objects.requireNonNull(secretName));
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs(secretName);
        }
    }
}

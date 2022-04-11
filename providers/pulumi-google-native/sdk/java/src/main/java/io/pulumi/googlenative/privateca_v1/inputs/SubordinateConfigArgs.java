// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.privateca_v1.inputs.SubordinateConfigChainArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a subordinate CA's issuers. This is either a resource name to a known issuing CertificateAuthority, or a PEM issuer certificate chain.
 * 
 */
public final class SubordinateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubordinateConfigArgs Empty = new SubordinateConfigArgs();

    /**
     * This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The resource name is in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    @Import(name="certificateAuthority", required=true)
      private final Output<String> certificateAuthority;

    public Output<String> getCertificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself.
     * 
     */
    @Import(name="pemIssuerChain", required=true)
      private final Output<SubordinateConfigChainArgs> pemIssuerChain;

    public Output<SubordinateConfigChainArgs> getPemIssuerChain() {
        return this.pemIssuerChain;
    }

    public SubordinateConfigArgs(
        Output<String> certificateAuthority,
        Output<SubordinateConfigChainArgs> pemIssuerChain) {
        this.certificateAuthority = Objects.requireNonNull(certificateAuthority, "expected parameter 'certificateAuthority' to be non-null");
        this.pemIssuerChain = Objects.requireNonNull(pemIssuerChain, "expected parameter 'pemIssuerChain' to be non-null");
    }

    private SubordinateConfigArgs() {
        this.certificateAuthority = Codegen.empty();
        this.pemIssuerChain = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubordinateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateAuthority;
        private Output<SubordinateConfigChainArgs> pemIssuerChain;

        public Builder() {
    	      // Empty
        }

        public Builder(SubordinateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.pemIssuerChain = defaults.pemIssuerChain;
        }

        public Builder certificateAuthority(Output<String> certificateAuthority) {
            this.certificateAuthority = Objects.requireNonNull(certificateAuthority);
            return this;
        }
        public Builder certificateAuthority(String certificateAuthority) {
            this.certificateAuthority = Output.of(Objects.requireNonNull(certificateAuthority));
            return this;
        }
        public Builder pemIssuerChain(Output<SubordinateConfigChainArgs> pemIssuerChain) {
            this.pemIssuerChain = Objects.requireNonNull(pemIssuerChain);
            return this;
        }
        public Builder pemIssuerChain(SubordinateConfigChainArgs pemIssuerChain) {
            this.pemIssuerChain = Output.of(Objects.requireNonNull(pemIssuerChain));
            return this;
        }        public SubordinateConfigArgs build() {
            return new SubordinateConfigArgs(certificateAuthority, pemIssuerChain);
        }
    }
}

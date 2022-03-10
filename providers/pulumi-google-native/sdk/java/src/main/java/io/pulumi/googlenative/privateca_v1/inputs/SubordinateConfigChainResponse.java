// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This message describes a subordinate CA's issuer certificate chain. This wrapper exists for compatibility reasons.
 * 
 */
public final class SubordinateConfigChainResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubordinateConfigChainResponse Empty = new SubordinateConfigChainResponse();

    /**
     * Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    @InputImport(name="pemCertificates", required=true)
      private final List<String> pemCertificates;

    public List<String> getPemCertificates() {
        return this.pemCertificates;
    }

    public SubordinateConfigChainResponse(List<String> pemCertificates) {
        this.pemCertificates = Objects.requireNonNull(pemCertificates, "expected parameter 'pemCertificates' to be non-null");
    }

    private SubordinateConfigChainResponse() {
        this.pemCertificates = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubordinateConfigChainResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> pemCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(SubordinateConfigChainResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pemCertificates = defaults.pemCertificates;
        }

        public Builder pemCertificates(List<String> pemCertificates) {
            this.pemCertificates = Objects.requireNonNull(pemCertificates);
            return this;
        }
        public SubordinateConfigChainResponse build() {
            return new SubordinateConfigChainResponse(pemCertificates);
        }
    }
}

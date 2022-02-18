// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SubordinateConfigChainResponse {
    /**
     * Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    private final List<String> pemCertificates;

    @OutputCustomType.Constructor({"pemCertificates"})
    private SubordinateConfigChainResponse(List<String> pemCertificates) {
        this.pemCertificates = Objects.requireNonNull(pemCertificates);
    }

    /**
     * Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    public List<String> getPemCertificates() {
        return this.pemCertificates;
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

        public Builder setPemCertificates(List<String> pemCertificates) {
            this.pemCertificates = Objects.requireNonNull(pemCertificates);
            return this;
        }

        public SubordinateConfigChainResponse build() {
            return new SubordinateConfigChainResponse(pemCertificates);
        }
    }
}

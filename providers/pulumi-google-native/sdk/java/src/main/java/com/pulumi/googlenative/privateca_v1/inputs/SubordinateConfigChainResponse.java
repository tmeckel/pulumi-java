// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This message describes a subordinate CA&#39;s issuer certificate chain. This wrapper exists for compatibility reasons.
 * 
 */
public final class SubordinateConfigChainResponse extends com.pulumi.resources.InvokeArgs {

    public static final SubordinateConfigChainResponse Empty = new SubordinateConfigChainResponse();

    /**
     * Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    @Import(name="pemCertificates", required=true)
    private List<String> pemCertificates;

    /**
     * @return Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    public List<String> pemCertificates() {
        return this.pemCertificates;
    }

    private SubordinateConfigChainResponse() {}

    private SubordinateConfigChainResponse(SubordinateConfigChainResponse $) {
        this.pemCertificates = $.pemCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubordinateConfigChainResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubordinateConfigChainResponse $;

        public Builder() {
            $ = new SubordinateConfigChainResponse();
        }

        public Builder(SubordinateConfigChainResponse defaults) {
            $ = new SubordinateConfigChainResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param pemCertificates Expected to be in leaf-to-root order according to RFC 5246.
         * 
         * @return builder
         * 
         */
        public Builder pemCertificates(List<String> pemCertificates) {
            $.pemCertificates = pemCertificates;
            return this;
        }

        /**
         * @param pemCertificates Expected to be in leaf-to-root order according to RFC 5246.
         * 
         * @return builder
         * 
         */
        public Builder pemCertificates(String... pemCertificates) {
            return pemCertificates(List.of(pemCertificates));
        }

        public SubordinateConfigChainResponse build() {
            $.pemCertificates = Objects.requireNonNull($.pemCertificates, "expected parameter 'pemCertificates' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Options that affect all certificates issued by a CertificateAuthority.
 * 
 */
public final class IssuingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final IssuingOptionsArgs Empty = new IssuingOptionsArgs();

    /**
     * When true, includes a URL to the issuing CA certificate in the "authority information access" X.509 extension.
     * 
     */
    @InputImport(name="includeCaCertUrl", required=true)
    private final Input<Boolean> includeCaCertUrl;

    public Input<Boolean> getIncludeCaCertUrl() {
        return this.includeCaCertUrl;
    }

    /**
     * When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    @InputImport(name="includeCrlAccessUrl", required=true)
    private final Input<Boolean> includeCrlAccessUrl;

    public Input<Boolean> getIncludeCrlAccessUrl() {
        return this.includeCrlAccessUrl;
    }

    public IssuingOptionsArgs(
        Input<Boolean> includeCaCertUrl,
        Input<Boolean> includeCrlAccessUrl) {
        this.includeCaCertUrl = Objects.requireNonNull(includeCaCertUrl, "expected parameter 'includeCaCertUrl' to be non-null");
        this.includeCrlAccessUrl = Objects.requireNonNull(includeCrlAccessUrl, "expected parameter 'includeCrlAccessUrl' to be non-null");
    }

    private IssuingOptionsArgs() {
        this.includeCaCertUrl = Input.empty();
        this.includeCrlAccessUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssuingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> includeCaCertUrl;
        private Input<Boolean> includeCrlAccessUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(IssuingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeCaCertUrl = defaults.includeCaCertUrl;
    	      this.includeCrlAccessUrl = defaults.includeCrlAccessUrl;
        }

        public Builder setIncludeCaCertUrl(Input<Boolean> includeCaCertUrl) {
            this.includeCaCertUrl = Objects.requireNonNull(includeCaCertUrl);
            return this;
        }

        public Builder setIncludeCaCertUrl(Boolean includeCaCertUrl) {
            this.includeCaCertUrl = Input.of(Objects.requireNonNull(includeCaCertUrl));
            return this;
        }

        public Builder setIncludeCrlAccessUrl(Input<Boolean> includeCrlAccessUrl) {
            this.includeCrlAccessUrl = Objects.requireNonNull(includeCrlAccessUrl);
            return this;
        }

        public Builder setIncludeCrlAccessUrl(Boolean includeCrlAccessUrl) {
            this.includeCrlAccessUrl = Input.of(Objects.requireNonNull(includeCrlAccessUrl));
            return this;
        }

        public IssuingOptionsArgs build() {
            return new IssuingOptionsArgs(includeCaCertUrl, includeCrlAccessUrl);
        }
    }
}

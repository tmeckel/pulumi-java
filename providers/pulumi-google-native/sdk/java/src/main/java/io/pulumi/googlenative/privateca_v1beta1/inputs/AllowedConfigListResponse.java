// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperResponse;
import java.util.List;
import java.util.Objects;


public final class AllowedConfigListResponse extends io.pulumi.resources.InvokeArgs {

    public static final AllowedConfigListResponse Empty = new AllowedConfigListResponse();

    /**
     * All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper. If a ReusableConfigWrapper has an empty field, any value will be allowed for that field.
     * 
     */
    @InputImport(name="allowedConfigValues", required=true)
      private final List<ReusableConfigWrapperResponse> allowedConfigValues;

    public List<ReusableConfigWrapperResponse> getAllowedConfigValues() {
        return this.allowedConfigValues;
    }

    public AllowedConfigListResponse(List<ReusableConfigWrapperResponse> allowedConfigValues) {
        this.allowedConfigValues = Objects.requireNonNull(allowedConfigValues, "expected parameter 'allowedConfigValues' to be non-null");
    }

    private AllowedConfigListResponse() {
        this.allowedConfigValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedConfigListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReusableConfigWrapperResponse> allowedConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedConfigListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedConfigValues = defaults.allowedConfigValues;
        }

        public Builder allowedConfigValues(List<ReusableConfigWrapperResponse> allowedConfigValues) {
            this.allowedConfigValues = Objects.requireNonNull(allowedConfigValues);
            return this;
        }
        public AllowedConfigListResponse build() {
            return new AllowedConfigListResponse(allowedConfigValues);
        }
    }
}

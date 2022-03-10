// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of custom domain for Spring Cloud Gateway
 * 
 */
public final class GatewayCustomDomainPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GatewayCustomDomainPropertiesResponse Empty = new GatewayCustomDomainPropertiesResponse();

    /**
     * The thumbprint of bound certificate.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable String thumbprint;

    public Optional<String> getThumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    public GatewayCustomDomainPropertiesResponse(@Nullable String thumbprint) {
        this.thumbprint = thumbprint;
    }

    private GatewayCustomDomainPropertiesResponse() {
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCustomDomainPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCustomDomainPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public GatewayCustomDomainPropertiesResponse build() {
            return new GatewayCustomDomainPropertiesResponse(thumbprint);
        }
    }
}

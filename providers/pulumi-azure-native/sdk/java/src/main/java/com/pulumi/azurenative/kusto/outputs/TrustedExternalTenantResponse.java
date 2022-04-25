// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrustedExternalTenantResponse {
    /**
     * @return GUID representing an external tenant.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private TrustedExternalTenantResponse(@CustomType.Parameter("value") @Nullable String value) {
        this.value = value;
    }

    /**
     * @return GUID representing an external tenant.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustedExternalTenantResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustedExternalTenantResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public TrustedExternalTenantResponse build() {
            return new TrustedExternalTenantResponse(value);
        }
    }
}

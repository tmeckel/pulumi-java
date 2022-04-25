// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azureactivedirectory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class B2CTenantResourcePropertiesResponseBillingConfig {
    /**
     * @return The type of billing. Will be MAU for all new customers. If &#39;Auths&#39;, it can be updated to &#39;MAU&#39;. Cannot be changed if value is &#39;MAU&#39;. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cbilling).
     * 
     */
    private final @Nullable String billingType;
    /**
     * @return The data from which the billing type took effect
     * 
     */
    private final String effectiveStartDateUtc;

    @CustomType.Constructor
    private B2CTenantResourcePropertiesResponseBillingConfig(
        @CustomType.Parameter("billingType") @Nullable String billingType,
        @CustomType.Parameter("effectiveStartDateUtc") String effectiveStartDateUtc) {
        this.billingType = billingType;
        this.effectiveStartDateUtc = effectiveStartDateUtc;
    }

    /**
     * @return The type of billing. Will be MAU for all new customers. If &#39;Auths&#39;, it can be updated to &#39;MAU&#39;. Cannot be changed if value is &#39;MAU&#39;. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cbilling).
     * 
     */
    public Optional<String> billingType() {
        return Optional.ofNullable(this.billingType);
    }
    /**
     * @return The data from which the billing type took effect
     * 
     */
    public String effectiveStartDateUtc() {
        return this.effectiveStartDateUtc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(B2CTenantResourcePropertiesResponseBillingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingType;
        private String effectiveStartDateUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(B2CTenantResourcePropertiesResponseBillingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.effectiveStartDateUtc = defaults.effectiveStartDateUtc;
        }

        public Builder billingType(@Nullable String billingType) {
            this.billingType = billingType;
            return this;
        }
        public Builder effectiveStartDateUtc(String effectiveStartDateUtc) {
            this.effectiveStartDateUtc = Objects.requireNonNull(effectiveStartDateUtc);
            return this;
        }        public B2CTenantResourcePropertiesResponseBillingConfig build() {
            return new B2CTenantResourcePropertiesResponseBillingConfig(billingType, effectiveStartDateUtc);
        }
    }
}

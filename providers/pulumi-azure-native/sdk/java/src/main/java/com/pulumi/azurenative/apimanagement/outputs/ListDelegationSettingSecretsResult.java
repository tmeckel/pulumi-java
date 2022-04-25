// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListDelegationSettingSecretsResult {
    /**
     * @return This is secret value of the validation key in portal settings.
     * 
     */
    private final @Nullable String validationKey;

    @CustomType.Constructor
    private ListDelegationSettingSecretsResult(@CustomType.Parameter("validationKey") @Nullable String validationKey) {
        this.validationKey = validationKey;
    }

    /**
     * @return This is secret value of the validation key in portal settings.
     * 
     */
    public Optional<String> validationKey() {
        return Optional.ofNullable(this.validationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDelegationSettingSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String validationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDelegationSettingSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.validationKey = defaults.validationKey;
        }

        public Builder validationKey(@Nullable String validationKey) {
            this.validationKey = validationKey;
            return this;
        }        public ListDelegationSettingSecretsResult build() {
            return new ListDelegationSettingSecretsResult(validationKey);
        }
    }
}

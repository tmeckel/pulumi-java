// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistrationActivationKeyResult {
    /**
     * @return Azure Stack activation key.
     * 
     */
    private final @Nullable String activationKey;

    @CustomType.Constructor
    private GetRegistrationActivationKeyResult(@CustomType.Parameter("activationKey") @Nullable String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * @return Azure Stack activation key.
     * 
     */
    public Optional<String> activationKey() {
        return Optional.ofNullable(this.activationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationActivationKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationActivationKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
        }

        public Builder activationKey(@Nullable String activationKey) {
            this.activationKey = activationKey;
            return this;
        }        public GetRegistrationActivationKeyResult build() {
            return new GetRegistrationActivationKeyResult(activationKey);
        }
    }
}

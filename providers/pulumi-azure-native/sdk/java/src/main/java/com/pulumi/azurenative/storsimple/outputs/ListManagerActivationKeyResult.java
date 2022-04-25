// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListManagerActivationKeyResult {
    /**
     * @return The activation key for the device.
     * 
     */
    private final String activationKey;

    @CustomType.Constructor
    private ListManagerActivationKeyResult(@CustomType.Parameter("activationKey") String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * @return The activation key for the device.
     * 
     */
    public String activationKey() {
        return this.activationKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListManagerActivationKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListManagerActivationKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
        }

        public Builder activationKey(String activationKey) {
            this.activationKey = Objects.requireNonNull(activationKey);
            return this;
        }        public ListManagerActivationKeyResult build() {
            return new ListManagerActivationKeyResult(activationKey);
        }
    }
}

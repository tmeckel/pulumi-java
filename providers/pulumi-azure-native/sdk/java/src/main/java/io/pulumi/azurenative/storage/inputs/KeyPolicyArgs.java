// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


/**
 * KeyPolicy assigned to the storage account.
 * 
 */
public final class KeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyPolicyArgs Empty = new KeyPolicyArgs();

    /**
     * The key expiration period in days.
     * 
     */
    @Import(name="keyExpirationPeriodInDays", required=true)
      private final Output<Integer> keyExpirationPeriodInDays;

    public Output<Integer> getKeyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    public KeyPolicyArgs(Output<Integer> keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays, "expected parameter 'keyExpirationPeriodInDays' to be non-null");
    }

    private KeyPolicyArgs() {
        this.keyExpirationPeriodInDays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> keyExpirationPeriodInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyExpirationPeriodInDays = defaults.keyExpirationPeriodInDays;
        }

        public Builder keyExpirationPeriodInDays(Output<Integer> keyExpirationPeriodInDays) {
            this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays);
            return this;
        }
        public Builder keyExpirationPeriodInDays(Integer keyExpirationPeriodInDays) {
            this.keyExpirationPeriodInDays = Output.of(Objects.requireNonNull(keyExpirationPeriodInDays));
            return this;
        }        public KeyPolicyArgs build() {
            return new KeyPolicyArgs(keyExpirationPeriodInDays);
        }
    }
}

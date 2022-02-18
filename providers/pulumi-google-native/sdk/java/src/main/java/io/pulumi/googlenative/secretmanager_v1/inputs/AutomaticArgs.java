// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.secretmanager_v1.inputs.CustomerManagedEncryptionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A replication policy that replicates the Secret payload without any restrictions.
 * 
 */
public final class AutomaticArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomaticArgs Empty = new AutomaticArgs();

    /**
     * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    @InputImport(name="customerManagedEncryption")
    private final @Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption;

    public Input<CustomerManagedEncryptionArgs> getCustomerManagedEncryption() {
        return this.customerManagedEncryption == null ? Input.empty() : this.customerManagedEncryption;
    }

    public AutomaticArgs(@Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption) {
        this.customerManagedEncryption = customerManagedEncryption;
    }

    private AutomaticArgs() {
        this.customerManagedEncryption = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryption = defaults.customerManagedEncryption;
        }

        public Builder setCustomerManagedEncryption(@Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption) {
            this.customerManagedEncryption = customerManagedEncryption;
            return this;
        }

        public Builder setCustomerManagedEncryption(@Nullable CustomerManagedEncryptionArgs customerManagedEncryption) {
            this.customerManagedEncryption = Input.ofNullable(customerManagedEncryption);
            return this;
        }

        public AutomaticArgs build() {
            return new AutomaticArgs(customerManagedEncryption);
        }
    }
}

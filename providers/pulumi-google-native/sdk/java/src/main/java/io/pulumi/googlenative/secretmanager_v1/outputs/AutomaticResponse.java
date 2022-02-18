// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.secretmanager_v1.outputs.CustomerManagedEncryptionResponse;
import java.util.Objects;

@OutputCustomType
public final class AutomaticResponse {
    /**
     * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    private final CustomerManagedEncryptionResponse customerManagedEncryption;

    @OutputCustomType.Constructor({"customerManagedEncryption"})
    private AutomaticResponse(CustomerManagedEncryptionResponse customerManagedEncryption) {
        this.customerManagedEncryption = Objects.requireNonNull(customerManagedEncryption);
    }

    /**
     * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    public CustomerManagedEncryptionResponse getCustomerManagedEncryption() {
        return this.customerManagedEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerManagedEncryptionResponse customerManagedEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryption = defaults.customerManagedEncryption;
        }

        public Builder setCustomerManagedEncryption(CustomerManagedEncryptionResponse customerManagedEncryption) {
            this.customerManagedEncryption = Objects.requireNonNull(customerManagedEncryption);
            return this;
        }

        public AutomaticResponse build() {
            return new AutomaticResponse(customerManagedEncryption);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.secretmanager_v1.inputs.CustomerManagedEncryptionResponse;
import java.util.Objects;


/**
 * A replication policy that replicates the Secret payload without any restrictions.
 * 
 */
public final class AutomaticResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutomaticResponse Empty = new AutomaticResponse();

    /**
     * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    @Import(name="customerManagedEncryption", required=true)
    private CustomerManagedEncryptionResponse customerManagedEncryption;

    /**
     * @return Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    public CustomerManagedEncryptionResponse customerManagedEncryption() {
        return this.customerManagedEncryption;
    }

    private AutomaticResponse() {}

    private AutomaticResponse(AutomaticResponse $) {
        this.customerManagedEncryption = $.customerManagedEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticResponse $;

        public Builder() {
            $ = new AutomaticResponse();
        }

        public Builder(AutomaticResponse defaults) {
            $ = new AutomaticResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerManagedEncryption Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedEncryption(CustomerManagedEncryptionResponse customerManagedEncryption) {
            $.customerManagedEncryption = customerManagedEncryption;
            return this;
        }

        public AutomaticResponse build() {
            $.customerManagedEncryption = Objects.requireNonNull($.customerManagedEncryption, "expected parameter 'customerManagedEncryption' to be non-null");
            return $;
        }
    }

}

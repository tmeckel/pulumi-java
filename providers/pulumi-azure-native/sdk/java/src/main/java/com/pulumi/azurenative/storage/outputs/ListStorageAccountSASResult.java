// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListStorageAccountSASResult {
    /**
     * @return List SAS credentials of storage account.
     * 
     */
    private final String accountSasToken;

    @CustomType.Constructor
    private ListStorageAccountSASResult(@CustomType.Parameter("accountSasToken") String accountSasToken) {
        this.accountSasToken = accountSasToken;
    }

    /**
     * @return List SAS credentials of storage account.
     * 
     */
    public String accountSasToken() {
        return this.accountSasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountSASResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountSasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountSASResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountSasToken = defaults.accountSasToken;
        }

        public Builder accountSasToken(String accountSasToken) {
            this.accountSasToken = Objects.requireNonNull(accountSasToken);
            return this;
        }        public ListStorageAccountSASResult build() {
            return new ListStorageAccountSASResult(accountSasToken);
        }
    }
}

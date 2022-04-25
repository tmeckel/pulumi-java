// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureCredentialsResponse {
    /**
     * @return Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
     */
    private final String sasToken;

    @CustomType.Constructor
    private AzureCredentialsResponse(@CustomType.Parameter("sasToken") String sasToken) {
        this.sasToken = sasToken;
    }

    /**
     * @return Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
     */
    public String sasToken() {
        return this.sasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasToken = defaults.sasToken;
        }

        public Builder sasToken(String sasToken) {
            this.sasToken = Objects.requireNonNull(sasToken);
            return this;
        }        public AzureCredentialsResponse build() {
            return new AzureCredentialsResponse(sasToken);
        }
    }
}

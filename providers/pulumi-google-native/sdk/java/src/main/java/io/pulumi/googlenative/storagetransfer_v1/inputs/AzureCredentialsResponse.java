// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Azure credentials For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
 * 
 */
public final class AzureCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureCredentialsResponse Empty = new AzureCredentialsResponse();

    /**
     * Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
     */
    @InputImport(name="sasToken", required=true)
    private final String sasToken;

    public String getSasToken() {
        return this.sasToken;
    }

    public AzureCredentialsResponse(String sasToken) {
        this.sasToken = Objects.requireNonNull(sasToken, "expected parameter 'sasToken' to be non-null");
    }

    private AzureCredentialsResponse() {
        this.sasToken = null;
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

        public Builder setSasToken(String sasToken) {
            this.sasToken = Objects.requireNonNull(sasToken);
            return this;
        }

        public AzureCredentialsResponse build() {
            return new AzureCredentialsResponse(sasToken);
        }
    }
}

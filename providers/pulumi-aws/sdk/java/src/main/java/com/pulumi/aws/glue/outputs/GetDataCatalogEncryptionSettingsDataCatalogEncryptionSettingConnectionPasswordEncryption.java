// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption {
    /**
     * @return A KMS key ARN that is used to encrypt the connection password.
     * 
     */
    private final String awsKmsKeyId;
    /**
     * @return When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
     */
    private final Boolean returnConnectionPasswordEncrypted;

    @CustomType.Constructor
    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption(
        @CustomType.Parameter("awsKmsKeyId") String awsKmsKeyId,
        @CustomType.Parameter("returnConnectionPasswordEncrypted") Boolean returnConnectionPasswordEncrypted) {
        this.awsKmsKeyId = awsKmsKeyId;
        this.returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted;
    }

    /**
     * @return A KMS key ARN that is used to encrypt the connection password.
     * 
     */
    public String awsKmsKeyId() {
        return this.awsKmsKeyId;
    }
    /**
     * @return When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
     */
    public Boolean returnConnectionPasswordEncrypted() {
        return this.returnConnectionPasswordEncrypted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsKmsKeyId;
        private Boolean returnConnectionPasswordEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsKmsKeyId = defaults.awsKmsKeyId;
    	      this.returnConnectionPasswordEncrypted = defaults.returnConnectionPasswordEncrypted;
        }

        public Builder awsKmsKeyId(String awsKmsKeyId) {
            this.awsKmsKeyId = Objects.requireNonNull(awsKmsKeyId);
            return this;
        }
        public Builder returnConnectionPasswordEncrypted(Boolean returnConnectionPasswordEncrypted) {
            this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted);
            return this;
        }        public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption build() {
            return new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption(awsKmsKeyId, returnConnectionPasswordEncrypted);
        }
    }
}

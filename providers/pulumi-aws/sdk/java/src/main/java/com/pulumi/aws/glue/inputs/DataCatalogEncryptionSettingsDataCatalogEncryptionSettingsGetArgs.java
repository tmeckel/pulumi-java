// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs;
import com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs Empty = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs();

    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    @Import(name="connectionPasswordEncryption", required=true)
    private Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> connectionPasswordEncryption;

    /**
     * @return When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    public Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> connectionPasswordEncryption() {
        return this.connectionPasswordEncryption;
    }

    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    @Import(name="encryptionAtRest", required=true)
    private Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> encryptionAtRest;

    /**
     * @return Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    public Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> encryptionAtRest() {
        return this.encryptionAtRest;
    }

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs() {}

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs $) {
        this.connectionPasswordEncryption = $.connectionPasswordEncryption;
        this.encryptionAtRest = $.encryptionAtRest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs $;

        public Builder() {
            $ = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs();
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs defaults) {
            $ = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPasswordEncryption When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
         * 
         * @return builder
         * 
         */
        public Builder connectionPasswordEncryption(Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> connectionPasswordEncryption) {
            $.connectionPasswordEncryption = connectionPasswordEncryption;
            return this;
        }

        /**
         * @param connectionPasswordEncryption When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
         * 
         * @return builder
         * 
         */
        public Builder connectionPasswordEncryption(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs connectionPasswordEncryption) {
            return connectionPasswordEncryption(Output.of(connectionPasswordEncryption));
        }

        /**
         * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtRest(Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> encryptionAtRest) {
            $.encryptionAtRest = encryptionAtRest;
            return this;
        }

        /**
         * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtRest(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs encryptionAtRest) {
            return encryptionAtRest(Output.of(encryptionAtRest));
        }

        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs build() {
            $.connectionPasswordEncryption = Objects.requireNonNull($.connectionPasswordEncryption, "expected parameter 'connectionPasswordEncryption' to be non-null");
            $.encryptionAtRest = Objects.requireNonNull($.encryptionAtRest, "expected parameter 'encryptionAtRest' to be non-null");
            return $;
        }
    }

}

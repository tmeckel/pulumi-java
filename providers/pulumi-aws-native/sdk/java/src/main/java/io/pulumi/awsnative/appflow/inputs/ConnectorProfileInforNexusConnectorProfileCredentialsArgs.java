// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileInforNexusConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileInforNexusConnectorProfileCredentialsArgs Empty = new ConnectorProfileInforNexusConnectorProfileCredentialsArgs();

    /**
     * The Access Key portion of the credentials.
     * 
     */
    @InputImport(name="accessKeyId", required=true)
      private final Input<String> accessKeyId;

    public Input<String> getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * The encryption keys used to encrypt data.
     * 
     */
    @InputImport(name="datakey", required=true)
      private final Input<String> datakey;

    public Input<String> getDatakey() {
        return this.datakey;
    }

    /**
     * The secret key used to sign requests.
     * 
     */
    @InputImport(name="secretAccessKey", required=true)
      private final Input<String> secretAccessKey;

    public Input<String> getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * The identiﬁer for the user.
     * 
     */
    @InputImport(name="userId", required=true)
      private final Input<String> userId;

    public Input<String> getUserId() {
        return this.userId;
    }

    public ConnectorProfileInforNexusConnectorProfileCredentialsArgs(
        Input<String> accessKeyId,
        Input<String> datakey,
        Input<String> secretAccessKey,
        Input<String> userId) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId, "expected parameter 'accessKeyId' to be non-null");
        this.datakey = Objects.requireNonNull(datakey, "expected parameter 'datakey' to be non-null");
        this.secretAccessKey = Objects.requireNonNull(secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private ConnectorProfileInforNexusConnectorProfileCredentialsArgs() {
        this.accessKeyId = Input.empty();
        this.datakey = Input.empty();
        this.secretAccessKey = Input.empty();
        this.userId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileInforNexusConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessKeyId;
        private Input<String> datakey;
        private Input<String> secretAccessKey;
        private Input<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileInforNexusConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.datakey = defaults.datakey;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.userId = defaults.userId;
        }

        public Builder accessKeyId(Input<String> accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = Input.of(Objects.requireNonNull(accessKeyId));
            return this;
        }

        public Builder datakey(Input<String> datakey) {
            this.datakey = Objects.requireNonNull(datakey);
            return this;
        }

        public Builder datakey(String datakey) {
            this.datakey = Input.of(Objects.requireNonNull(datakey));
            return this;
        }

        public Builder secretAccessKey(Input<String> secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Input.of(Objects.requireNonNull(secretAccessKey));
            return this;
        }

        public Builder userId(Input<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Input.of(Objects.requireNonNull(userId));
            return this;
        }
        public ConnectorProfileInforNexusConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileInforNexusConnectorProfileCredentialsArgs(accessKeyId, datakey, secretAccessKey, userId);
        }
    }
}

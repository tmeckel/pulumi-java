// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * AWS access key (see [AWS Security Credentials](https://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)). For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
 * 
 */
public final class AwsAccessKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AwsAccessKeyResponse Empty = new AwsAccessKeyResponse();

    /**
     * AWS access key ID.
     * 
     */
    @InputImport(name="accessKeyId", required=true)
      private final String accessKeyId;

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * AWS secret access key. This field is not returned in RPC responses.
     * 
     */
    @InputImport(name="secretAccessKey", required=true)
      private final String secretAccessKey;

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public AwsAccessKeyResponse(
        String accessKeyId,
        String secretAccessKey) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId, "expected parameter 'accessKeyId' to be non-null");
        this.secretAccessKey = Objects.requireNonNull(secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
    }

    private AwsAccessKeyResponse() {
        this.accessKeyId = null;
        this.secretAccessKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsAccessKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKeyId;
        private String secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsAccessKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }
        public AwsAccessKeyResponse build() {
            return new AwsAccessKeyResponse(accessKeyId, secretAccessKey);
        }
    }
}

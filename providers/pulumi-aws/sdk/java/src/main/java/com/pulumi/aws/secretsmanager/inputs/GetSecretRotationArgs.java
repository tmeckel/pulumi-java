// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecretRotationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretRotationArgs Empty = new GetSecretRotationArgs();

    /**
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * 
     */
    @Import(name="secretId", required=true)
    private String secretId;

    /**
     * @return Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * 
     */
    public String secretId() {
        return this.secretId;
    }

    private GetSecretRotationArgs() {}

    private GetSecretRotationArgs(GetSecretRotationArgs $) {
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretRotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretRotationArgs $;

        public Builder() {
            $ = new GetSecretRotationArgs();
        }

        public Builder(GetSecretRotationArgs defaults) {
            $ = new GetSecretRotationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretId Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            $.secretId = secretId;
            return this;
        }

        public GetSecretRotationArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkforceCognitoConfig {
    /**
     * @return The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    private final String clientId;
    /**
     * @return The id for your Amazon Cognito user pool.
     * 
     */
    private final String userPool;

    @CustomType.Constructor
    private WorkforceCognitoConfig(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("userPool") String userPool) {
        this.clientId = clientId;
        this.userPool = userPool;
    }

    /**
     * @return The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The id for your Amazon Cognito user pool.
     * 
     */
    public String userPool() {
        return this.userPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceCognitoConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String userPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceCognitoConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.userPool = defaults.userPool;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder userPool(String userPool) {
            this.userPool = Objects.requireNonNull(userPool);
            return this;
        }        public WorkforceCognitoConfig build() {
            return new WorkforceCognitoConfig(clientId, userPool);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserPoolClientArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserPoolClientArgs Empty = new GetUserPoolClientArgs();

    /**
     * Client Id of the user pool.
     * 
     */
    @InputImport(name="clientId", required=true)
      private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    /**
     * User pool the client belongs to.
     * 
     */
    @InputImport(name="userPoolId", required=true)
      private final String userPoolId;

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public GetUserPoolClientArgs(
        String clientId,
        String userPoolId) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private GetUserPoolClientArgs() {
        this.clientId = null;
        this.userPoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolClientArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public GetUserPoolClientArgs build() {
            return new GetUserPoolClientArgs(clientId, userPoolId);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerState extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerState Empty = new AuthorizerState();

    /**
     * The credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
     * 
     */
    @InputImport(name="authorizerCredentials")
      private final @Nullable Input<String> authorizerCredentials;

    public Input<String> getAuthorizerCredentials() {
        return this.authorizerCredentials == null ? Input.empty() : this.authorizerCredentials;
    }

    /**
     * The TTL of cached authorizer results in seconds. Defaults to `300`.
     * 
     */
    @InputImport(name="authorizerResultTtlInSeconds")
      private final @Nullable Input<Integer> authorizerResultTtlInSeconds;

    public Input<Integer> getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds == null ? Input.empty() : this.authorizerResultTtlInSeconds;
    }

    /**
     * The authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
     * e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
     * 
     */
    @InputImport(name="authorizerUri")
      private final @Nullable Input<String> authorizerUri;

    public Input<String> getAuthorizerUri() {
        return this.authorizerUri == null ? Input.empty() : this.authorizerUri;
    }

    /**
     * The source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
     * 
     */
    @InputImport(name="identitySource")
      private final @Nullable Input<String> identitySource;

    public Input<String> getIdentitySource() {
        return this.identitySource == null ? Input.empty() : this.identitySource;
    }

    /**
     * A validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
     * 
     */
    @InputImport(name="identityValidationExpression")
      private final @Nullable Input<String> identityValidationExpression;

    public Input<String> getIdentityValidationExpression() {
        return this.identityValidationExpression == null ? Input.empty() : this.identityValidationExpression;
    }

    /**
     * The name of the authorizer
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
     * 
     */
    @InputImport(name="providerArns")
      private final @Nullable Input<List<String>> providerArns;

    public Input<List<String>> getProviderArns() {
        return this.providerArns == null ? Input.empty() : this.providerArns;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @InputImport(name="restApi")
      private final @Nullable Input<String> restApi;

    public Input<String> getRestApi() {
        return this.restApi == null ? Input.empty() : this.restApi;
    }

    /**
     * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AuthorizerState(
        @Nullable Input<String> authorizerCredentials,
        @Nullable Input<Integer> authorizerResultTtlInSeconds,
        @Nullable Input<String> authorizerUri,
        @Nullable Input<String> identitySource,
        @Nullable Input<String> identityValidationExpression,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> providerArns,
        @Nullable Input<String> restApi,
        @Nullable Input<String> type) {
        this.authorizerCredentials = authorizerCredentials;
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
        this.authorizerUri = authorizerUri;
        this.identitySource = identitySource;
        this.identityValidationExpression = identityValidationExpression;
        this.name = name;
        this.providerArns = providerArns;
        this.restApi = restApi;
        this.type = type;
    }

    private AuthorizerState() {
        this.authorizerCredentials = Input.empty();
        this.authorizerResultTtlInSeconds = Input.empty();
        this.authorizerUri = Input.empty();
        this.identitySource = Input.empty();
        this.identityValidationExpression = Input.empty();
        this.name = Input.empty();
        this.providerArns = Input.empty();
        this.restApi = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizerCredentials;
        private @Nullable Input<Integer> authorizerResultTtlInSeconds;
        private @Nullable Input<String> authorizerUri;
        private @Nullable Input<String> identitySource;
        private @Nullable Input<String> identityValidationExpression;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> providerArns;
        private @Nullable Input<String> restApi;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerCredentials = defaults.authorizerCredentials;
    	      this.authorizerResultTtlInSeconds = defaults.authorizerResultTtlInSeconds;
    	      this.authorizerUri = defaults.authorizerUri;
    	      this.identitySource = defaults.identitySource;
    	      this.identityValidationExpression = defaults.identityValidationExpression;
    	      this.name = defaults.name;
    	      this.providerArns = defaults.providerArns;
    	      this.restApi = defaults.restApi;
    	      this.type = defaults.type;
        }

        public Builder authorizerCredentials(@Nullable Input<String> authorizerCredentials) {
            this.authorizerCredentials = authorizerCredentials;
            return this;
        }

        public Builder authorizerCredentials(@Nullable String authorizerCredentials) {
            this.authorizerCredentials = Input.ofNullable(authorizerCredentials);
            return this;
        }

        public Builder authorizerResultTtlInSeconds(@Nullable Input<Integer> authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }

        public Builder authorizerResultTtlInSeconds(@Nullable Integer authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = Input.ofNullable(authorizerResultTtlInSeconds);
            return this;
        }

        public Builder authorizerUri(@Nullable Input<String> authorizerUri) {
            this.authorizerUri = authorizerUri;
            return this;
        }

        public Builder authorizerUri(@Nullable String authorizerUri) {
            this.authorizerUri = Input.ofNullable(authorizerUri);
            return this;
        }

        public Builder identitySource(@Nullable Input<String> identitySource) {
            this.identitySource = identitySource;
            return this;
        }

        public Builder identitySource(@Nullable String identitySource) {
            this.identitySource = Input.ofNullable(identitySource);
            return this;
        }

        public Builder identityValidationExpression(@Nullable Input<String> identityValidationExpression) {
            this.identityValidationExpression = identityValidationExpression;
            return this;
        }

        public Builder identityValidationExpression(@Nullable String identityValidationExpression) {
            this.identityValidationExpression = Input.ofNullable(identityValidationExpression);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder providerArns(@Nullable Input<List<String>> providerArns) {
            this.providerArns = providerArns;
            return this;
        }

        public Builder providerArns(@Nullable List<String> providerArns) {
            this.providerArns = Input.ofNullable(providerArns);
            return this;
        }

        public Builder restApi(@Nullable Input<String> restApi) {
            this.restApi = restApi;
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public AuthorizerState build() {
            return new AuthorizerState(authorizerCredentials, authorizerResultTtlInSeconds, authorizerUri, identitySource, identityValidationExpression, name, providerArns, restApi, type);
        }
    }
}

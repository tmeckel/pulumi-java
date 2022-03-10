// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    /**
     * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
     * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
     * Applicable for WebSocket APIs.
     * 
     */
    @InputImport(name="apiKeySelectionExpression")
      private final @Nullable Input<String> apiKeySelectionExpression;

    public Input<String> getApiKeySelectionExpression() {
        return this.apiKeySelectionExpression == null ? Input.empty() : this.apiKeySelectionExpression;
    }

    /**
     * An OpenAPI specification that defines the set of routes and integrations to create as part of the HTTP APIs. Supported only for HTTP APIs.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
     * 
     */
    @InputImport(name="corsConfiguration")
      private final @Nullable Input<ApiCorsConfigurationArgs> corsConfiguration;

    public Input<ApiCorsConfigurationArgs> getCorsConfiguration() {
        return this.corsConfiguration == null ? Input.empty() : this.corsConfiguration;
    }

    /**
     * Part of _quick create_. Specifies any credentials required for the integration. Applicable for HTTP APIs.
     * 
     */
    @InputImport(name="credentialsArn")
      private final @Nullable Input<String> credentialsArn;

    public Input<String> getCredentialsArn() {
        return this.credentialsArn == null ? Input.empty() : this.credentialsArn;
    }

    /**
     * The description of the API. Must be less than or equal to 1024 characters in length.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether clients can invoke the API by using the default `execute-api` endpoint.
     * By default, clients can invoke the API with the default `{api_id}.execute-api.{region}.amazonaws.com endpoint`.
     * To require that clients use a custom domain name to invoke the API, disable the default endpoint.
     * 
     */
    @InputImport(name="disableExecuteApiEndpoint")
      private final @Nullable Input<Boolean> disableExecuteApiEndpoint;

    public Input<Boolean> getDisableExecuteApiEndpoint() {
        return this.disableExecuteApiEndpoint == null ? Input.empty() : this.disableExecuteApiEndpoint;
    }

    /**
     * Whether warnings should return an error while API Gateway is creating or updating the resource using an OpenAPI specification. Defaults to `false`. Applicable for HTTP APIs.
     * 
     */
    @InputImport(name="failOnWarnings")
      private final @Nullable Input<Boolean> failOnWarnings;

    public Input<Boolean> getFailOnWarnings() {
        return this.failOnWarnings == null ? Input.empty() : this.failOnWarnings;
    }

    /**
     * The name of the API. Must be less than or equal to 128 characters in length.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
     * 
     */
    @InputImport(name="protocolType", required=true)
      private final Input<String> protocolType;

    public Input<String> getProtocolType() {
        return this.protocolType;
    }

    /**
     * Part of _quick create_. Specifies any [route key](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html). Applicable for HTTP APIs.
     * 
     */
    @InputImport(name="routeKey")
      private final @Nullable Input<String> routeKey;

    public Input<String> getRouteKey() {
        return this.routeKey == null ? Input.empty() : this.routeKey;
    }

    /**
     * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
     * Defaults to `$request.method $request.path`.
     * 
     */
    @InputImport(name="routeSelectionExpression")
      private final @Nullable Input<String> routeSelectionExpression;

    public Input<String> getRouteSelectionExpression() {
        return this.routeSelectionExpression == null ? Input.empty() : this.routeSelectionExpression;
    }

    /**
     * A map of tags to assign to the API. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Part of _quick create_. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes.
     * For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN.
     * The type of the integration will be `HTTP_PROXY` or `AWS_PROXY`, respectively. Applicable for HTTP APIs.
     * 
     */
    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * A version identifier for the API. Must be between 1 and 64 characters in length.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ApiArgs(
        @Nullable Input<String> apiKeySelectionExpression,
        @Nullable Input<String> body,
        @Nullable Input<ApiCorsConfigurationArgs> corsConfiguration,
        @Nullable Input<String> credentialsArn,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disableExecuteApiEndpoint,
        @Nullable Input<Boolean> failOnWarnings,
        @Nullable Input<String> name,
        Input<String> protocolType,
        @Nullable Input<String> routeKey,
        @Nullable Input<String> routeSelectionExpression,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> target,
        @Nullable Input<String> version) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
        this.body = body;
        this.corsConfiguration = corsConfiguration;
        this.credentialsArn = credentialsArn;
        this.description = description;
        this.disableExecuteApiEndpoint = disableExecuteApiEndpoint;
        this.failOnWarnings = failOnWarnings;
        this.name = name;
        this.protocolType = Objects.requireNonNull(protocolType, "expected parameter 'protocolType' to be non-null");
        this.routeKey = routeKey;
        this.routeSelectionExpression = routeSelectionExpression;
        this.tags = tags;
        this.target = target;
        this.version = version;
    }

    private ApiArgs() {
        this.apiKeySelectionExpression = Input.empty();
        this.body = Input.empty();
        this.corsConfiguration = Input.empty();
        this.credentialsArn = Input.empty();
        this.description = Input.empty();
        this.disableExecuteApiEndpoint = Input.empty();
        this.failOnWarnings = Input.empty();
        this.name = Input.empty();
        this.protocolType = Input.empty();
        this.routeKey = Input.empty();
        this.routeSelectionExpression = Input.empty();
        this.tags = Input.empty();
        this.target = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiKeySelectionExpression;
        private @Nullable Input<String> body;
        private @Nullable Input<ApiCorsConfigurationArgs> corsConfiguration;
        private @Nullable Input<String> credentialsArn;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disableExecuteApiEndpoint;
        private @Nullable Input<Boolean> failOnWarnings;
        private @Nullable Input<String> name;
        private Input<String> protocolType;
        private @Nullable Input<String> routeKey;
        private @Nullable Input<String> routeSelectionExpression;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> target;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeySelectionExpression = defaults.apiKeySelectionExpression;
    	      this.body = defaults.body;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.credentialsArn = defaults.credentialsArn;
    	      this.description = defaults.description;
    	      this.disableExecuteApiEndpoint = defaults.disableExecuteApiEndpoint;
    	      this.failOnWarnings = defaults.failOnWarnings;
    	      this.name = defaults.name;
    	      this.protocolType = defaults.protocolType;
    	      this.routeKey = defaults.routeKey;
    	      this.routeSelectionExpression = defaults.routeSelectionExpression;
    	      this.tags = defaults.tags;
    	      this.target = defaults.target;
    	      this.version = defaults.version;
        }

        public Builder apiKeySelectionExpression(@Nullable Input<String> apiKeySelectionExpression) {
            this.apiKeySelectionExpression = apiKeySelectionExpression;
            return this;
        }

        public Builder apiKeySelectionExpression(@Nullable String apiKeySelectionExpression) {
            this.apiKeySelectionExpression = Input.ofNullable(apiKeySelectionExpression);
            return this;
        }

        public Builder body(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder corsConfiguration(@Nullable Input<ApiCorsConfigurationArgs> corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder corsConfiguration(@Nullable ApiCorsConfigurationArgs corsConfiguration) {
            this.corsConfiguration = Input.ofNullable(corsConfiguration);
            return this;
        }

        public Builder credentialsArn(@Nullable Input<String> credentialsArn) {
            this.credentialsArn = credentialsArn;
            return this;
        }

        public Builder credentialsArn(@Nullable String credentialsArn) {
            this.credentialsArn = Input.ofNullable(credentialsArn);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder disableExecuteApiEndpoint(@Nullable Input<Boolean> disableExecuteApiEndpoint) {
            this.disableExecuteApiEndpoint = disableExecuteApiEndpoint;
            return this;
        }

        public Builder disableExecuteApiEndpoint(@Nullable Boolean disableExecuteApiEndpoint) {
            this.disableExecuteApiEndpoint = Input.ofNullable(disableExecuteApiEndpoint);
            return this;
        }

        public Builder failOnWarnings(@Nullable Input<Boolean> failOnWarnings) {
            this.failOnWarnings = failOnWarnings;
            return this;
        }

        public Builder failOnWarnings(@Nullable Boolean failOnWarnings) {
            this.failOnWarnings = Input.ofNullable(failOnWarnings);
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

        public Builder protocolType(Input<String> protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }

        public Builder protocolType(String protocolType) {
            this.protocolType = Input.of(Objects.requireNonNull(protocolType));
            return this;
        }

        public Builder routeKey(@Nullable Input<String> routeKey) {
            this.routeKey = routeKey;
            return this;
        }

        public Builder routeKey(@Nullable String routeKey) {
            this.routeKey = Input.ofNullable(routeKey);
            return this;
        }

        public Builder routeSelectionExpression(@Nullable Input<String> routeSelectionExpression) {
            this.routeSelectionExpression = routeSelectionExpression;
            return this;
        }

        public Builder routeSelectionExpression(@Nullable String routeSelectionExpression) {
            this.routeSelectionExpression = Input.ofNullable(routeSelectionExpression);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder target(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public ApiArgs build() {
            return new ApiArgs(apiKeySelectionExpression, body, corsConfiguration, credentialsArn, description, disableExecuteApiEndpoint, failOnWarnings, name, protocolType, routeKey, routeSelectionExpression, tags, target, version);
        }
    }
}

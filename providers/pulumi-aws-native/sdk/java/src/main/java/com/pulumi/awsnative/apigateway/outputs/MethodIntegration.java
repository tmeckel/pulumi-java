// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.outputs;

import com.pulumi.awsnative.apigateway.enums.MethodIntegrationConnectionType;
import com.pulumi.awsnative.apigateway.enums.MethodIntegrationContentHandling;
import com.pulumi.awsnative.apigateway.enums.MethodIntegrationPassthroughBehavior;
import com.pulumi.awsnative.apigateway.enums.MethodIntegrationType;
import com.pulumi.awsnative.apigateway.outputs.MethodIntegrationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MethodIntegration {
    /**
     * @return A list of request parameters whose values API Gateway caches.
     * 
     */
    private final @Nullable List<String> cacheKeyParameters;
    /**
     * @return An API-specific tag group of related cached parameters.
     * 
     */
    private final @Nullable String cacheNamespace;
    /**
     * @return The ID of the VpcLink used for the integration when connectionType=VPC_LINK, otherwise undefined.
     * 
     */
    private final @Nullable String connectionId;
    /**
     * @return The type of the network connection to the integration endpoint.
     * 
     */
    private final @Nullable MethodIntegrationConnectionType connectionType;
    /**
     * @return Specifies how to handle request payload content type conversions.
     * 
     */
    private final @Nullable MethodIntegrationContentHandling contentHandling;
    /**
     * @return The credentials that are required for the integration.
     * 
     */
    private final @Nullable String credentials;
    /**
     * @return The integration&#39;s HTTP method type.
     * 
     */
    private final @Nullable String integrationHttpMethod;
    /**
     * @return The response that API Gateway provides after a method&#39;s backend completes processing a request.
     * 
     */
    private final @Nullable List<MethodIntegrationResponse> integrationResponses;
    /**
     * @return Indicates when API Gateway passes requests to the targeted backend.
     * 
     */
    private final @Nullable MethodIntegrationPassthroughBehavior passthroughBehavior;
    /**
     * @return The request parameters that API Gateway sends with the backend request.
     * 
     */
    private final @Nullable Object requestParameters;
    /**
     * @return A map of Apache Velocity templates that are applied on the request payload.
     * 
     */
    private final @Nullable Object requestTemplates;
    /**
     * @return Custom timeout between 50 and 29,000 milliseconds.
     * 
     */
    private final @Nullable Integer timeoutInMillis;
    /**
     * @return The type of backend that your method is running.
     * 
     */
    private final MethodIntegrationType type;
    /**
     * @return The Uniform Resource Identifier (URI) for the integration.
     * 
     */
    private final @Nullable String uri;

    @CustomType.Constructor
    private MethodIntegration(
        @CustomType.Parameter("cacheKeyParameters") @Nullable List<String> cacheKeyParameters,
        @CustomType.Parameter("cacheNamespace") @Nullable String cacheNamespace,
        @CustomType.Parameter("connectionId") @Nullable String connectionId,
        @CustomType.Parameter("connectionType") @Nullable MethodIntegrationConnectionType connectionType,
        @CustomType.Parameter("contentHandling") @Nullable MethodIntegrationContentHandling contentHandling,
        @CustomType.Parameter("credentials") @Nullable String credentials,
        @CustomType.Parameter("integrationHttpMethod") @Nullable String integrationHttpMethod,
        @CustomType.Parameter("integrationResponses") @Nullable List<MethodIntegrationResponse> integrationResponses,
        @CustomType.Parameter("passthroughBehavior") @Nullable MethodIntegrationPassthroughBehavior passthroughBehavior,
        @CustomType.Parameter("requestParameters") @Nullable Object requestParameters,
        @CustomType.Parameter("requestTemplates") @Nullable Object requestTemplates,
        @CustomType.Parameter("timeoutInMillis") @Nullable Integer timeoutInMillis,
        @CustomType.Parameter("type") MethodIntegrationType type,
        @CustomType.Parameter("uri") @Nullable String uri) {
        this.cacheKeyParameters = cacheKeyParameters;
        this.cacheNamespace = cacheNamespace;
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.contentHandling = contentHandling;
        this.credentials = credentials;
        this.integrationHttpMethod = integrationHttpMethod;
        this.integrationResponses = integrationResponses;
        this.passthroughBehavior = passthroughBehavior;
        this.requestParameters = requestParameters;
        this.requestTemplates = requestTemplates;
        this.timeoutInMillis = timeoutInMillis;
        this.type = type;
        this.uri = uri;
    }

    /**
     * @return A list of request parameters whose values API Gateway caches.
     * 
     */
    public List<String> cacheKeyParameters() {
        return this.cacheKeyParameters == null ? List.of() : this.cacheKeyParameters;
    }
    /**
     * @return An API-specific tag group of related cached parameters.
     * 
     */
    public Optional<String> cacheNamespace() {
        return Optional.ofNullable(this.cacheNamespace);
    }
    /**
     * @return The ID of the VpcLink used for the integration when connectionType=VPC_LINK, otherwise undefined.
     * 
     */
    public Optional<String> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }
    /**
     * @return The type of the network connection to the integration endpoint.
     * 
     */
    public Optional<MethodIntegrationConnectionType> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }
    /**
     * @return Specifies how to handle request payload content type conversions.
     * 
     */
    public Optional<MethodIntegrationContentHandling> contentHandling() {
        return Optional.ofNullable(this.contentHandling);
    }
    /**
     * @return The credentials that are required for the integration.
     * 
     */
    public Optional<String> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The integration&#39;s HTTP method type.
     * 
     */
    public Optional<String> integrationHttpMethod() {
        return Optional.ofNullable(this.integrationHttpMethod);
    }
    /**
     * @return The response that API Gateway provides after a method&#39;s backend completes processing a request.
     * 
     */
    public List<MethodIntegrationResponse> integrationResponses() {
        return this.integrationResponses == null ? List.of() : this.integrationResponses;
    }
    /**
     * @return Indicates when API Gateway passes requests to the targeted backend.
     * 
     */
    public Optional<MethodIntegrationPassthroughBehavior> passthroughBehavior() {
        return Optional.ofNullable(this.passthroughBehavior);
    }
    /**
     * @return The request parameters that API Gateway sends with the backend request.
     * 
     */
    public Optional<Object> requestParameters() {
        return Optional.ofNullable(this.requestParameters);
    }
    /**
     * @return A map of Apache Velocity templates that are applied on the request payload.
     * 
     */
    public Optional<Object> requestTemplates() {
        return Optional.ofNullable(this.requestTemplates);
    }
    /**
     * @return Custom timeout between 50 and 29,000 milliseconds.
     * 
     */
    public Optional<Integer> timeoutInMillis() {
        return Optional.ofNullable(this.timeoutInMillis);
    }
    /**
     * @return The type of backend that your method is running.
     * 
     */
    public MethodIntegrationType type() {
        return this.type;
    }
    /**
     * @return The Uniform Resource Identifier (URI) for the integration.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodIntegration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cacheKeyParameters;
        private @Nullable String cacheNamespace;
        private @Nullable String connectionId;
        private @Nullable MethodIntegrationConnectionType connectionType;
        private @Nullable MethodIntegrationContentHandling contentHandling;
        private @Nullable String credentials;
        private @Nullable String integrationHttpMethod;
        private @Nullable List<MethodIntegrationResponse> integrationResponses;
        private @Nullable MethodIntegrationPassthroughBehavior passthroughBehavior;
        private @Nullable Object requestParameters;
        private @Nullable Object requestTemplates;
        private @Nullable Integer timeoutInMillis;
        private MethodIntegrationType type;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyParameters = defaults.cacheKeyParameters;
    	      this.cacheNamespace = defaults.cacheNamespace;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.contentHandling = defaults.contentHandling;
    	      this.credentials = defaults.credentials;
    	      this.integrationHttpMethod = defaults.integrationHttpMethod;
    	      this.integrationResponses = defaults.integrationResponses;
    	      this.passthroughBehavior = defaults.passthroughBehavior;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestTemplates = defaults.requestTemplates;
    	      this.timeoutInMillis = defaults.timeoutInMillis;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder cacheKeyParameters(@Nullable List<String> cacheKeyParameters) {
            this.cacheKeyParameters = cacheKeyParameters;
            return this;
        }
        public Builder cacheKeyParameters(String... cacheKeyParameters) {
            return cacheKeyParameters(List.of(cacheKeyParameters));
        }
        public Builder cacheNamespace(@Nullable String cacheNamespace) {
            this.cacheNamespace = cacheNamespace;
            return this;
        }
        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Builder connectionType(@Nullable MethodIntegrationConnectionType connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public Builder contentHandling(@Nullable MethodIntegrationContentHandling contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }
        public Builder credentials(@Nullable String credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder integrationHttpMethod(@Nullable String integrationHttpMethod) {
            this.integrationHttpMethod = integrationHttpMethod;
            return this;
        }
        public Builder integrationResponses(@Nullable List<MethodIntegrationResponse> integrationResponses) {
            this.integrationResponses = integrationResponses;
            return this;
        }
        public Builder integrationResponses(MethodIntegrationResponse... integrationResponses) {
            return integrationResponses(List.of(integrationResponses));
        }
        public Builder passthroughBehavior(@Nullable MethodIntegrationPassthroughBehavior passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }
        public Builder requestParameters(@Nullable Object requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }
        public Builder requestTemplates(@Nullable Object requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }
        public Builder timeoutInMillis(@Nullable Integer timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            return this;
        }
        public Builder type(MethodIntegrationType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public MethodIntegration build() {
            return new MethodIntegration(cacheKeyParameters, cacheNamespace, connectionId, connectionType, contentHandling, credentials, integrationHttpMethod, integrationResponses, passthroughBehavior, requestParameters, requestTemplates, timeoutInMillis, type, uri);
        }
    }
}

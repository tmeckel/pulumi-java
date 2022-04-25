// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteResponseState extends com.pulumi.resources.ResourceArgs {

    public static final RouteResponseState Empty = new RouteResponseState();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
     * 
     */
    @Import(name="modelSelectionExpression")
    private @Nullable Output<String> modelSelectionExpression;

    /**
     * @return The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
     * 
     */
    public Optional<Output<String>> modelSelectionExpression() {
        return Optional.ofNullable(this.modelSelectionExpression);
    }

    /**
     * The response models for the route response.
     * 
     */
    @Import(name="responseModels")
    private @Nullable Output<Map<String,String>> responseModels;

    /**
     * @return The response models for the route response.
     * 
     */
    public Optional<Output<Map<String,String>>> responseModels() {
        return Optional.ofNullable(this.responseModels);
    }

    /**
     * The identifier of the `aws.apigatewayv2.Route`.
     * 
     */
    @Import(name="routeId")
    private @Nullable Output<String> routeId;

    /**
     * @return The identifier of the `aws.apigatewayv2.Route`.
     * 
     */
    public Optional<Output<String>> routeId() {
        return Optional.ofNullable(this.routeId);
    }

    /**
     * The route response key.
     * 
     */
    @Import(name="routeResponseKey")
    private @Nullable Output<String> routeResponseKey;

    /**
     * @return The route response key.
     * 
     */
    public Optional<Output<String>> routeResponseKey() {
        return Optional.ofNullable(this.routeResponseKey);
    }

    private RouteResponseState() {}

    private RouteResponseState(RouteResponseState $) {
        this.apiId = $.apiId;
        this.modelSelectionExpression = $.modelSelectionExpression;
        this.responseModels = $.responseModels;
        this.routeId = $.routeId;
        this.routeResponseKey = $.routeResponseKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteResponseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteResponseState $;

        public Builder() {
            $ = new RouteResponseState();
        }

        public Builder(RouteResponseState defaults) {
            $ = new RouteResponseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param modelSelectionExpression The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
         * 
         * @return builder
         * 
         */
        public Builder modelSelectionExpression(@Nullable Output<String> modelSelectionExpression) {
            $.modelSelectionExpression = modelSelectionExpression;
            return this;
        }

        /**
         * @param modelSelectionExpression The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
         * 
         * @return builder
         * 
         */
        public Builder modelSelectionExpression(String modelSelectionExpression) {
            return modelSelectionExpression(Output.of(modelSelectionExpression));
        }

        /**
         * @param responseModels The response models for the route response.
         * 
         * @return builder
         * 
         */
        public Builder responseModels(@Nullable Output<Map<String,String>> responseModels) {
            $.responseModels = responseModels;
            return this;
        }

        /**
         * @param responseModels The response models for the route response.
         * 
         * @return builder
         * 
         */
        public Builder responseModels(Map<String,String> responseModels) {
            return responseModels(Output.of(responseModels));
        }

        /**
         * @param routeId The identifier of the `aws.apigatewayv2.Route`.
         * 
         * @return builder
         * 
         */
        public Builder routeId(@Nullable Output<String> routeId) {
            $.routeId = routeId;
            return this;
        }

        /**
         * @param routeId The identifier of the `aws.apigatewayv2.Route`.
         * 
         * @return builder
         * 
         */
        public Builder routeId(String routeId) {
            return routeId(Output.of(routeId));
        }

        /**
         * @param routeResponseKey The route response key.
         * 
         * @return builder
         * 
         */
        public Builder routeResponseKey(@Nullable Output<String> routeResponseKey) {
            $.routeResponseKey = routeResponseKey;
            return this;
        }

        /**
         * @param routeResponseKey The route response key.
         * 
         * @return builder
         * 
         */
        public Builder routeResponseKey(String routeResponseKey) {
            return routeResponseKey(Output.of(routeResponseKey));
        }

        public RouteResponseState build() {
            return $;
        }
    }

}

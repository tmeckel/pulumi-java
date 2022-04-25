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


public final class IntegrationResponseState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationResponseState Empty = new IntegrationResponseState();

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
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     * 
     */
    @Import(name="contentHandlingStrategy")
    private @Nullable Output<String> contentHandlingStrategy;

    /**
     * @return How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     * 
     */
    public Optional<Output<String>> contentHandlingStrategy() {
        return Optional.ofNullable(this.contentHandlingStrategy);
    }

    /**
     * The identifier of the `aws.apigatewayv2.Integration`.
     * 
     */
    @Import(name="integrationId")
    private @Nullable Output<String> integrationId;

    /**
     * @return The identifier of the `aws.apigatewayv2.Integration`.
     * 
     */
    public Optional<Output<String>> integrationId() {
        return Optional.ofNullable(this.integrationId);
    }

    /**
     * The integration response key.
     * 
     */
    @Import(name="integrationResponseKey")
    private @Nullable Output<String> integrationResponseKey;

    /**
     * @return The integration response key.
     * 
     */
    public Optional<Output<String>> integrationResponseKey() {
        return Optional.ofNullable(this.integrationResponseKey);
    }

    /**
     * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     * 
     */
    @Import(name="responseTemplates")
    private @Nullable Output<Map<String,String>> responseTemplates;

    /**
     * @return A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     * 
     */
    public Optional<Output<Map<String,String>>> responseTemplates() {
        return Optional.ofNullable(this.responseTemplates);
    }

    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     * 
     */
    @Import(name="templateSelectionExpression")
    private @Nullable Output<String> templateSelectionExpression;

    /**
     * @return The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     * 
     */
    public Optional<Output<String>> templateSelectionExpression() {
        return Optional.ofNullable(this.templateSelectionExpression);
    }

    private IntegrationResponseState() {}

    private IntegrationResponseState(IntegrationResponseState $) {
        this.apiId = $.apiId;
        this.contentHandlingStrategy = $.contentHandlingStrategy;
        this.integrationId = $.integrationId;
        this.integrationResponseKey = $.integrationResponseKey;
        this.responseTemplates = $.responseTemplates;
        this.templateSelectionExpression = $.templateSelectionExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationResponseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationResponseState $;

        public Builder() {
            $ = new IntegrationResponseState();
        }

        public Builder(IntegrationResponseState defaults) {
            $ = new IntegrationResponseState(Objects.requireNonNull(defaults));
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
         * @param contentHandlingStrategy How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
         * 
         * @return builder
         * 
         */
        public Builder contentHandlingStrategy(@Nullable Output<String> contentHandlingStrategy) {
            $.contentHandlingStrategy = contentHandlingStrategy;
            return this;
        }

        /**
         * @param contentHandlingStrategy How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
         * 
         * @return builder
         * 
         */
        public Builder contentHandlingStrategy(String contentHandlingStrategy) {
            return contentHandlingStrategy(Output.of(contentHandlingStrategy));
        }

        /**
         * @param integrationId The identifier of the `aws.apigatewayv2.Integration`.
         * 
         * @return builder
         * 
         */
        public Builder integrationId(@Nullable Output<String> integrationId) {
            $.integrationId = integrationId;
            return this;
        }

        /**
         * @param integrationId The identifier of the `aws.apigatewayv2.Integration`.
         * 
         * @return builder
         * 
         */
        public Builder integrationId(String integrationId) {
            return integrationId(Output.of(integrationId));
        }

        /**
         * @param integrationResponseKey The integration response key.
         * 
         * @return builder
         * 
         */
        public Builder integrationResponseKey(@Nullable Output<String> integrationResponseKey) {
            $.integrationResponseKey = integrationResponseKey;
            return this;
        }

        /**
         * @param integrationResponseKey The integration response key.
         * 
         * @return builder
         * 
         */
        public Builder integrationResponseKey(String integrationResponseKey) {
            return integrationResponseKey(Output.of(integrationResponseKey));
        }

        /**
         * @param responseTemplates A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
         * 
         * @return builder
         * 
         */
        public Builder responseTemplates(@Nullable Output<Map<String,String>> responseTemplates) {
            $.responseTemplates = responseTemplates;
            return this;
        }

        /**
         * @param responseTemplates A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
         * 
         * @return builder
         * 
         */
        public Builder responseTemplates(Map<String,String> responseTemplates) {
            return responseTemplates(Output.of(responseTemplates));
        }

        /**
         * @param templateSelectionExpression The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
         * 
         * @return builder
         * 
         */
        public Builder templateSelectionExpression(@Nullable Output<String> templateSelectionExpression) {
            $.templateSelectionExpression = templateSelectionExpression;
            return this;
        }

        /**
         * @param templateSelectionExpression The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
         * 
         * @return builder
         * 
         */
        public Builder templateSelectionExpression(String templateSelectionExpression) {
            return templateSelectionExpression(Output.of(templateSelectionExpression));
        }

        public IntegrationResponseState build() {
            return $;
        }
    }

}

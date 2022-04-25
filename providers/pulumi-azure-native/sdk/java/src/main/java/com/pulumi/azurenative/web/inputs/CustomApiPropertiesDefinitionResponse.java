// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.ApiResourceBackendServiceResponse;
import com.pulumi.azurenative.web.inputs.ApiResourceDefinitionsResponse;
import com.pulumi.azurenative.web.inputs.ConnectionParameterResponse;
import com.pulumi.azurenative.web.inputs.WsdlDefinitionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom API properties
 * 
 */
public final class CustomApiPropertiesDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomApiPropertiesDefinitionResponse Empty = new CustomApiPropertiesDefinitionResponse();

    /**
     * API Definitions
     * 
     */
    @Import(name="apiDefinitions")
    private @Nullable ApiResourceDefinitionsResponse apiDefinitions;

    /**
     * @return API Definitions
     * 
     */
    public Optional<ApiResourceDefinitionsResponse> apiDefinitions() {
        return Optional.ofNullable(this.apiDefinitions);
    }

    /**
     * The API type
     * 
     */
    @Import(name="apiType")
    private @Nullable String apiType;

    /**
     * @return The API type
     * 
     */
    public Optional<String> apiType() {
        return Optional.ofNullable(this.apiType);
    }

    /**
     * The API backend service
     * 
     */
    @Import(name="backendService")
    private @Nullable ApiResourceBackendServiceResponse backendService;

    /**
     * @return The API backend service
     * 
     */
    public Optional<ApiResourceBackendServiceResponse> backendService() {
        return Optional.ofNullable(this.backendService);
    }

    /**
     * Brand color
     * 
     */
    @Import(name="brandColor")
    private @Nullable String brandColor;

    /**
     * @return Brand color
     * 
     */
    public Optional<String> brandColor() {
        return Optional.ofNullable(this.brandColor);
    }

    /**
     * The custom API capabilities
     * 
     */
    @Import(name="capabilities")
    private @Nullable List<String> capabilities;

    /**
     * @return The custom API capabilities
     * 
     */
    public Optional<List<String>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    /**
     * Connection parameters
     * 
     */
    @Import(name="connectionParameters")
    private @Nullable Map<String,ConnectionParameterResponse> connectionParameters;

    /**
     * @return Connection parameters
     * 
     */
    public Optional<Map<String,ConnectionParameterResponse>> connectionParameters() {
        return Optional.ofNullable(this.connectionParameters);
    }

    /**
     * The custom API description
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The custom API description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The display name
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The icon URI
     * 
     */
    @Import(name="iconUri")
    private @Nullable String iconUri;

    /**
     * @return The icon URI
     * 
     */
    public Optional<String> iconUri() {
        return Optional.ofNullable(this.iconUri);
    }

    /**
     * Runtime URLs
     * 
     */
    @Import(name="runtimeUrls")
    private @Nullable List<String> runtimeUrls;

    /**
     * @return Runtime URLs
     * 
     */
    public Optional<List<String>> runtimeUrls() {
        return Optional.ofNullable(this.runtimeUrls);
    }

    /**
     * The JSON representation of the swagger
     * 
     */
    @Import(name="swagger")
    private @Nullable Object swagger;

    /**
     * @return The JSON representation of the swagger
     * 
     */
    public Optional<Object> swagger() {
        return Optional.ofNullable(this.swagger);
    }

    /**
     * The WSDL definition
     * 
     */
    @Import(name="wsdlDefinition")
    private @Nullable WsdlDefinitionResponse wsdlDefinition;

    /**
     * @return The WSDL definition
     * 
     */
    public Optional<WsdlDefinitionResponse> wsdlDefinition() {
        return Optional.ofNullable(this.wsdlDefinition);
    }

    private CustomApiPropertiesDefinitionResponse() {}

    private CustomApiPropertiesDefinitionResponse(CustomApiPropertiesDefinitionResponse $) {
        this.apiDefinitions = $.apiDefinitions;
        this.apiType = $.apiType;
        this.backendService = $.backendService;
        this.brandColor = $.brandColor;
        this.capabilities = $.capabilities;
        this.connectionParameters = $.connectionParameters;
        this.description = $.description;
        this.displayName = $.displayName;
        this.iconUri = $.iconUri;
        this.runtimeUrls = $.runtimeUrls;
        this.swagger = $.swagger;
        this.wsdlDefinition = $.wsdlDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomApiPropertiesDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomApiPropertiesDefinitionResponse $;

        public Builder() {
            $ = new CustomApiPropertiesDefinitionResponse();
        }

        public Builder(CustomApiPropertiesDefinitionResponse defaults) {
            $ = new CustomApiPropertiesDefinitionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiDefinitions API Definitions
         * 
         * @return builder
         * 
         */
        public Builder apiDefinitions(@Nullable ApiResourceDefinitionsResponse apiDefinitions) {
            $.apiDefinitions = apiDefinitions;
            return this;
        }

        /**
         * @param apiType The API type
         * 
         * @return builder
         * 
         */
        public Builder apiType(@Nullable String apiType) {
            $.apiType = apiType;
            return this;
        }

        /**
         * @param backendService The API backend service
         * 
         * @return builder
         * 
         */
        public Builder backendService(@Nullable ApiResourceBackendServiceResponse backendService) {
            $.backendService = backendService;
            return this;
        }

        /**
         * @param brandColor Brand color
         * 
         * @return builder
         * 
         */
        public Builder brandColor(@Nullable String brandColor) {
            $.brandColor = brandColor;
            return this;
        }

        /**
         * @param capabilities The custom API capabilities
         * 
         * @return builder
         * 
         */
        public Builder capabilities(@Nullable List<String> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities The custom API capabilities
         * 
         * @return builder
         * 
         */
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }

        /**
         * @param connectionParameters Connection parameters
         * 
         * @return builder
         * 
         */
        public Builder connectionParameters(@Nullable Map<String,ConnectionParameterResponse> connectionParameters) {
            $.connectionParameters = connectionParameters;
            return this;
        }

        /**
         * @param description The custom API description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param displayName The display name
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param iconUri The icon URI
         * 
         * @return builder
         * 
         */
        public Builder iconUri(@Nullable String iconUri) {
            $.iconUri = iconUri;
            return this;
        }

        /**
         * @param runtimeUrls Runtime URLs
         * 
         * @return builder
         * 
         */
        public Builder runtimeUrls(@Nullable List<String> runtimeUrls) {
            $.runtimeUrls = runtimeUrls;
            return this;
        }

        /**
         * @param runtimeUrls Runtime URLs
         * 
         * @return builder
         * 
         */
        public Builder runtimeUrls(String... runtimeUrls) {
            return runtimeUrls(List.of(runtimeUrls));
        }

        /**
         * @param swagger The JSON representation of the swagger
         * 
         * @return builder
         * 
         */
        public Builder swagger(@Nullable Object swagger) {
            $.swagger = swagger;
            return this;
        }

        /**
         * @param wsdlDefinition The WSDL definition
         * 
         * @return builder
         * 
         */
        public Builder wsdlDefinition(@Nullable WsdlDefinitionResponse wsdlDefinition) {
            $.wsdlDefinition = wsdlDefinition;
            return this;
        }

        public CustomApiPropertiesDefinitionResponse build() {
            return $;
        }
    }

}

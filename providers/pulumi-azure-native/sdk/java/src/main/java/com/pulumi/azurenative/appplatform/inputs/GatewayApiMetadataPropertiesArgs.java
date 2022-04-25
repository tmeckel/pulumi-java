// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API metadata property for Spring Cloud Gateway
 * 
 */
public final class GatewayApiMetadataPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayApiMetadataPropertiesArgs Empty = new GatewayApiMetadataPropertiesArgs();

    /**
     * Detailed description of the APIs available on the Gateway instance (default: `Generated OpenAPI 3 document that describes the API routes configured.`)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Detailed description of the APIs available on the Gateway instance (default: `Generated OpenAPI 3 document that describes the API routes configured.`)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Location of additional documentation for the APIs available on the Gateway instance
     * 
     */
    @Import(name="documentation")
    private @Nullable Output<String> documentation;

    /**
     * @return Location of additional documentation for the APIs available on the Gateway instance
     * 
     */
    public Optional<Output<String>> documentation() {
        return Optional.ofNullable(this.documentation);
    }

    /**
     * Base URL that API consumers will use to access APIs on the Gateway instance.
     * 
     */
    @Import(name="serverUrl")
    private @Nullable Output<String> serverUrl;

    /**
     * @return Base URL that API consumers will use to access APIs on the Gateway instance.
     * 
     */
    public Optional<Output<String>> serverUrl() {
        return Optional.ofNullable(this.serverUrl);
    }

    /**
     * Title describing the context of the APIs available on the Gateway instance (default: `Spring Cloud Gateway for K8S`)
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Title describing the context of the APIs available on the Gateway instance (default: `Spring Cloud Gateway for K8S`)
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Version of APIs available on this Gateway instance (default: `unspecified`).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of APIs available on this Gateway instance (default: `unspecified`).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GatewayApiMetadataPropertiesArgs() {}

    private GatewayApiMetadataPropertiesArgs(GatewayApiMetadataPropertiesArgs $) {
        this.description = $.description;
        this.documentation = $.documentation;
        this.serverUrl = $.serverUrl;
        this.title = $.title;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayApiMetadataPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayApiMetadataPropertiesArgs $;

        public Builder() {
            $ = new GatewayApiMetadataPropertiesArgs();
        }

        public Builder(GatewayApiMetadataPropertiesArgs defaults) {
            $ = new GatewayApiMetadataPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Detailed description of the APIs available on the Gateway instance (default: `Generated OpenAPI 3 document that describes the API routes configured.`)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Detailed description of the APIs available on the Gateway instance (default: `Generated OpenAPI 3 document that describes the API routes configured.`)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param documentation Location of additional documentation for the APIs available on the Gateway instance
         * 
         * @return builder
         * 
         */
        public Builder documentation(@Nullable Output<String> documentation) {
            $.documentation = documentation;
            return this;
        }

        /**
         * @param documentation Location of additional documentation for the APIs available on the Gateway instance
         * 
         * @return builder
         * 
         */
        public Builder documentation(String documentation) {
            return documentation(Output.of(documentation));
        }

        /**
         * @param serverUrl Base URL that API consumers will use to access APIs on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder serverUrl(@Nullable Output<String> serverUrl) {
            $.serverUrl = serverUrl;
            return this;
        }

        /**
         * @param serverUrl Base URL that API consumers will use to access APIs on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder serverUrl(String serverUrl) {
            return serverUrl(Output.of(serverUrl));
        }

        /**
         * @param title Title describing the context of the APIs available on the Gateway instance (default: `Spring Cloud Gateway for K8S`)
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title describing the context of the APIs available on the Gateway instance (default: `Spring Cloud Gateway for K8S`)
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param version Version of APIs available on this Gateway instance (default: `unspecified`).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of APIs available on this Gateway instance (default: `unspecified`).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GatewayApiMetadataPropertiesArgs build() {
            return $;
        }
    }

}

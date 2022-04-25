// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HttpFilterConfiguration supplies additional contextual settings for networkservices.HttpFilter resources enabled by Traffic Director.
 * 
 */
public final class HttpFilterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpFilterConfigArgs Empty = new HttpFilterConfigArgs();

    /**
     * The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    /**
     * @return The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    @Import(name="configTypeUrl")
    private @Nullable Output<String> configTypeUrl;

    /**
     * @return The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    public Optional<Output<String>> configTypeUrl() {
        return Optional.ofNullable(this.configTypeUrl);
    }

    /**
     * Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    @Import(name="filterName")
    private @Nullable Output<String> filterName;

    /**
     * @return Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    public Optional<Output<String>> filterName() {
        return Optional.ofNullable(this.filterName);
    }

    private HttpFilterConfigArgs() {}

    private HttpFilterConfigArgs(HttpFilterConfigArgs $) {
        this.config = $.config;
        this.configTypeUrl = $.configTypeUrl;
        this.filterName = $.filterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpFilterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpFilterConfigArgs $;

        public Builder() {
            $ = new HttpFilterConfigArgs();
        }

        public Builder(HttpFilterConfigArgs defaults) {
            $ = new HttpFilterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @param configTypeUrl The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
         * 
         * @return builder
         * 
         */
        public Builder configTypeUrl(@Nullable Output<String> configTypeUrl) {
            $.configTypeUrl = configTypeUrl;
            return this;
        }

        /**
         * @param configTypeUrl The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
         * 
         * @return builder
         * 
         */
        public Builder configTypeUrl(String configTypeUrl) {
            return configTypeUrl(Output.of(configTypeUrl));
        }

        /**
         * @param filterName Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
         * 
         * @return builder
         * 
         */
        public Builder filterName(@Nullable Output<String> filterName) {
            $.filterName = filterName;
            return this;
        }

        /**
         * @param filterName Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
         * 
         * @return builder
         * 
         */
        public Builder filterName(String filterName) {
            return filterName(Output.of(filterName));
        }

        public HttpFilterConfigArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.DaprMetadataResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dapr component configuration
 * 
 */
public final class DaprComponentResponse extends com.pulumi.resources.InvokeArgs {

    public static final DaprComponentResponse Empty = new DaprComponentResponse();

    /**
     * Component metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable List<DaprMetadataResponse> metadata;

    /**
     * @return Component metadata
     * 
     */
    public Optional<List<DaprMetadataResponse>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Component name
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Component name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Component type
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Component type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Component version
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return Component version
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private DaprComponentResponse() {}

    private DaprComponentResponse(DaprComponentResponse $) {
        this.metadata = $.metadata;
        this.name = $.name;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DaprComponentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DaprComponentResponse $;

        public Builder() {
            $ = new DaprComponentResponse();
        }

        public Builder(DaprComponentResponse defaults) {
            $ = new DaprComponentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata Component metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable List<DaprMetadataResponse> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Component metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(DaprMetadataResponse... metadata) {
            return metadata(List.of(metadata));
        }

        /**
         * @param name Component name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type Component type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param version Component version
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public DaprComponentResponse build() {
            return $;
        }
    }

}

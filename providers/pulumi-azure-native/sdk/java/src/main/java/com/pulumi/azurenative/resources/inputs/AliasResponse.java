// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.azurenative.resources.inputs.AliasPathMetadataResponse;
import com.pulumi.azurenative.resources.inputs.AliasPathResponse;
import com.pulumi.azurenative.resources.inputs.AliasPatternResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The alias type.
 * 
 */
public final class AliasResponse extends com.pulumi.resources.InvokeArgs {

    public static final AliasResponse Empty = new AliasResponse();

    /**
     * The default alias path metadata. Applies to the default path and to any alias path that doesn&#39;t have metadata
     * 
     */
    @Import(name="defaultMetadata", required=true)
    private AliasPathMetadataResponse defaultMetadata;

    /**
     * @return The default alias path metadata. Applies to the default path and to any alias path that doesn&#39;t have metadata
     * 
     */
    public AliasPathMetadataResponse defaultMetadata() {
        return this.defaultMetadata;
    }

    /**
     * The default path for an alias.
     * 
     */
    @Import(name="defaultPath")
    private @Nullable String defaultPath;

    /**
     * @return The default path for an alias.
     * 
     */
    public Optional<String> defaultPath() {
        return Optional.ofNullable(this.defaultPath);
    }

    /**
     * The default pattern for an alias.
     * 
     */
    @Import(name="defaultPattern")
    private @Nullable AliasPatternResponse defaultPattern;

    /**
     * @return The default pattern for an alias.
     * 
     */
    public Optional<AliasPatternResponse> defaultPattern() {
        return Optional.ofNullable(this.defaultPattern);
    }

    /**
     * The alias name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The alias name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The paths for an alias.
     * 
     */
    @Import(name="paths")
    private @Nullable List<AliasPathResponse> paths;

    /**
     * @return The paths for an alias.
     * 
     */
    public Optional<List<AliasPathResponse>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * The type of the alias.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of the alias.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private AliasResponse() {}

    private AliasResponse(AliasResponse $) {
        this.defaultMetadata = $.defaultMetadata;
        this.defaultPath = $.defaultPath;
        this.defaultPattern = $.defaultPattern;
        this.name = $.name;
        this.paths = $.paths;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasResponse $;

        public Builder() {
            $ = new AliasResponse();
        }

        public Builder(AliasResponse defaults) {
            $ = new AliasResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultMetadata The default alias path metadata. Applies to the default path and to any alias path that doesn&#39;t have metadata
         * 
         * @return builder
         * 
         */
        public Builder defaultMetadata(AliasPathMetadataResponse defaultMetadata) {
            $.defaultMetadata = defaultMetadata;
            return this;
        }

        /**
         * @param defaultPath The default path for an alias.
         * 
         * @return builder
         * 
         */
        public Builder defaultPath(@Nullable String defaultPath) {
            $.defaultPath = defaultPath;
            return this;
        }

        /**
         * @param defaultPattern The default pattern for an alias.
         * 
         * @return builder
         * 
         */
        public Builder defaultPattern(@Nullable AliasPatternResponse defaultPattern) {
            $.defaultPattern = defaultPattern;
            return this;
        }

        /**
         * @param name The alias name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param paths The paths for an alias.
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable List<AliasPathResponse> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths The paths for an alias.
         * 
         * @return builder
         * 
         */
        public Builder paths(AliasPathResponse... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param type The type of the alias.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public AliasResponse build() {
            $.defaultMetadata = Objects.requireNonNull($.defaultMetadata, "expected parameter 'defaultMetadata' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis folder.
 * 
 */
public final class SsisFolderResponse extends com.pulumi.resources.InvokeArgs {

    public static final SsisFolderResponse Empty = new SsisFolderResponse();

    /**
     * Metadata description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Metadata description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Metadata id.
     * 
     */
    @Import(name="id")
    private @Nullable Double id;

    /**
     * @return Metadata id.
     * 
     */
    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Metadata name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Metadata name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of SSIS object metadata.
     * Expected value is &#39;Folder&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of SSIS object metadata.
     * Expected value is &#39;Folder&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private SsisFolderResponse() {}

    private SsisFolderResponse(SsisFolderResponse $) {
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsisFolderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsisFolderResponse $;

        public Builder() {
            $ = new SsisFolderResponse();
        }

        public Builder(SsisFolderResponse defaults) {
            $ = new SsisFolderResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Metadata description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param id Metadata id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Double id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Metadata name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type The type of SSIS object metadata.
         * Expected value is &#39;Folder&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SsisFolderResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}

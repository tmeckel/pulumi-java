// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container for code asset versions.
 * 
 */
public final class CodeContainerResponse extends com.pulumi.resources.InvokeArgs {

    public static final CodeContainerResponse Empty = new CodeContainerResponse();

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The asset description text.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
    private @Nullable Map<String,String> properties;

    /**
     * @return The asset property dictionary.
     * 
     */
    public Optional<Map<String,String>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CodeContainerResponse() {}

    private CodeContainerResponse(CodeContainerResponse $) {
        this.description = $.description;
        this.properties = $.properties;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CodeContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodeContainerResponse $;

        public Builder() {
            $ = new CodeContainerResponse();
        }

        public Builder(CodeContainerResponse defaults) {
            $ = new CodeContainerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The asset description text.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param properties The asset property dictionary.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param tags Tag dictionary. Tags can be added, removed, and updated.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public CodeContainerResponse build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A reference to an Azure resource.
 * 
 */
public final class ResourceReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceReferenceArgs Empty = new ResourceReferenceArgs();

    /**
     * The fully qualified Azure resource id.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The fully qualified Azure resource id.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private ResourceReferenceArgs() {}

    private ResourceReferenceArgs(ResourceReferenceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceReferenceArgs $;

        public Builder() {
            $ = new ResourceReferenceArgs();
        }

        public Builder(ResourceReferenceArgs defaults) {
            $ = new ResourceReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The fully qualified Azure resource id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The fully qualified Azure resource id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ResourceReferenceArgs build() {
            return $;
        }
    }

}

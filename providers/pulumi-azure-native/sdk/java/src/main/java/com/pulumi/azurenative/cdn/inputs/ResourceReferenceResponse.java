// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to another resource.
 * 
 */
public final class ResourceReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceReferenceResponse Empty = new ResourceReferenceResponse();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private ResourceReferenceResponse() {}

    private ResourceReferenceResponse(ResourceReferenceResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceReferenceResponse $;

        public Builder() {
            $ = new ResourceReferenceResponse();
        }

        public Builder(ResourceReferenceResponse defaults) {
            $ = new ResourceReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public ResourceReferenceResponse build() {
            return $;
        }
    }

}

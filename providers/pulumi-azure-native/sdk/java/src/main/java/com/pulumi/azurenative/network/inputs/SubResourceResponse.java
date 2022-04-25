// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to another subresource.
 * 
 */
public final class SubResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SubResourceResponse Empty = new SubResourceResponse();

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

    private SubResourceResponse() {}

    private SubResourceResponse(SubResourceResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubResourceResponse $;

        public Builder() {
            $ = new SubResourceResponse();
        }

        public Builder(SubResourceResponse defaults) {
            $ = new SubResourceResponse(Objects.requireNonNull(defaults));
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

        public SubResourceResponse build() {
            return $;
        }
    }

}

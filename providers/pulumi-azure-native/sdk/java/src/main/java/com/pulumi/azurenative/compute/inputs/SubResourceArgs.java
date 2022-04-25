// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubResourceArgs Empty = new SubResourceArgs();

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource Id
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private SubResourceArgs() {}

    private SubResourceArgs(SubResourceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubResourceArgs $;

        public Builder() {
            $ = new SubResourceArgs();
        }

        public Builder(SubResourceArgs defaults) {
            $ = new SubResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public SubResourceArgs build() {
            return $;
        }
    }

}

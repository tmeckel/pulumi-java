// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A container holding only the Tags for a resource, allowing the user to update the tags on a PrivateLinkConnection instance.
 * 
 */
public final class TagsResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagsResourceArgs Empty = new TagsResourceArgs();

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TagsResourceArgs() {}

    private TagsResourceArgs(TagsResourceArgs $) {
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagsResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagsResourceArgs $;

        public Builder() {
            $ = new TagsResourceArgs();
        }

        public Builder(TagsResourceArgs defaults) {
            $ = new TagsResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public TagsResourceArgs build() {
            return $;
        }
    }

}

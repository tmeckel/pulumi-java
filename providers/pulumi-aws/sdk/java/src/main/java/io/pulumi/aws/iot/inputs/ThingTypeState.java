// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.ThingTypePropertiesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingTypeState extends io.pulumi.resources.ResourceArgs {

    public static final ThingTypeState Empty = new ThingTypeState();

    /**
     * The ARN of the created AWS IoT Thing Type.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Whether the thing type is deprecated. If true, no new things could be associated with this type.
     * 
     */
    @Import(name="deprecated")
      private final @Nullable Output<Boolean> deprecated;

    public Output<Boolean> getDeprecated() {
        return this.deprecated == null ? Codegen.empty() : this.deprecated;
    }

    /**
     * The name of the thing type.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * , Configuration block that can contain the following properties of the thing type:
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ThingTypePropertiesGetArgs> properties;

    public Output<ThingTypePropertiesGetArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ThingTypeState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> deprecated,
        @Nullable Output<String> name,
        @Nullable Output<ThingTypePropertiesGetArgs> properties,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.deprecated = deprecated;
        this.name = name;
        this.properties = properties;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ThingTypeState() {
        this.arn = Codegen.empty();
        this.deprecated = Codegen.empty();
        this.name = Codegen.empty();
        this.properties = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> deprecated;
        private @Nullable Output<String> name;
        private @Nullable Output<ThingTypePropertiesGetArgs> properties;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingTypeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deprecated = defaults.deprecated;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder deprecated(@Nullable Output<Boolean> deprecated) {
            this.deprecated = deprecated;
            return this;
        }
        public Builder deprecated(@Nullable Boolean deprecated) {
            this.deprecated = Codegen.ofNullable(deprecated);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder properties(@Nullable Output<ThingTypePropertiesGetArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ThingTypePropertiesGetArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ThingTypeState build() {
            return new ThingTypeState(arn, deprecated, name, properties, tags, tagsAll);
        }
    }
}

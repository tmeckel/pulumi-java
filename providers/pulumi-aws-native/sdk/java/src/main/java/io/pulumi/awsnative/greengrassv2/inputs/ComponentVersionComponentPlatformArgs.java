// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionComponentPlatformArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionComponentPlatformArgs Empty = new ComponentVersionComponentPlatformArgs();

    @Import(name="attributes")
      private final @Nullable Output<Object> attributes;

    public Output<Object> getAttributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ComponentVersionComponentPlatformArgs(
        @Nullable Output<Object> attributes,
        @Nullable Output<String> name) {
        this.attributes = attributes;
        this.name = name;
    }

    private ComponentVersionComponentPlatformArgs() {
        this.attributes = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionComponentPlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> attributes;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionComponentPlatformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
        }

        public Builder attributes(@Nullable Output<Object> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable Object attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ComponentVersionComponentPlatformArgs build() {
            return new ComponentVersionComponentPlatformArgs(attributes, name);
        }
    }
}

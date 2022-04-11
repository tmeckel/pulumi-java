// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.appmesh.inputs.MeshSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MeshArgs extends io.pulumi.resources.ResourceArgs {

    public static final MeshArgs Empty = new MeshArgs();

    /**
     * The name to use for the service mesh. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The service mesh specification to apply.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<MeshSpecArgs> spec;

    public Output<MeshSpecArgs> getSpec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public MeshArgs(
        @Nullable Output<String> name,
        @Nullable Output<MeshSpecArgs> spec,
        @Nullable Output<Map<String,String>> tags) {
        this.name = name;
        this.spec = spec;
        this.tags = tags;
    }

    private MeshArgs() {
        this.name = Codegen.empty();
        this.spec = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<MeshSpecArgs> spec;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.spec = defaults.spec;
    	      this.tags = defaults.tags;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder spec(@Nullable Output<MeshSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable MeshSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public MeshArgs build() {
            return new MeshArgs(name, spec, tags);
        }
    }
}

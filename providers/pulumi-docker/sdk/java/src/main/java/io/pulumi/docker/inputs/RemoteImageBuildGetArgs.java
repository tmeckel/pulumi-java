// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemoteImageBuildGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemoteImageBuildGetArgs Empty = new RemoteImageBuildGetArgs();

    @Import(name="buildArg")
      private final @Nullable Output<Map<String,String>> buildArg;

    public Output<Map<String,String>> getBuildArg() {
        return this.buildArg == null ? Codegen.empty() : this.buildArg;
    }

    @Import(name="dockerfile")
      private final @Nullable Output<String> dockerfile;

    public Output<String> getDockerfile() {
        return this.dockerfile == null ? Codegen.empty() : this.dockerfile;
    }

    @Import(name="forceRemove")
      private final @Nullable Output<Boolean> forceRemove;

    public Output<Boolean> getForceRemove() {
        return this.forceRemove == null ? Codegen.empty() : this.forceRemove;
    }

    @Import(name="label")
      private final @Nullable Output<Map<String,String>> label;

    public Output<Map<String,String>> getLabel() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    @Import(name="noCache")
      private final @Nullable Output<Boolean> noCache;

    public Output<Boolean> getNoCache() {
        return this.noCache == null ? Codegen.empty() : this.noCache;
    }

    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    @Import(name="remove")
      private final @Nullable Output<Boolean> remove;

    public Output<Boolean> getRemove() {
        return this.remove == null ? Codegen.empty() : this.remove;
    }

    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    public RemoteImageBuildGetArgs(
        @Nullable Output<Map<String,String>> buildArg,
        @Nullable Output<String> dockerfile,
        @Nullable Output<Boolean> forceRemove,
        @Nullable Output<Map<String,String>> label,
        @Nullable Output<Boolean> noCache,
        Output<String> path,
        @Nullable Output<Boolean> remove,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> target) {
        this.buildArg = buildArg;
        this.dockerfile = dockerfile;
        this.forceRemove = forceRemove;
        this.label = label;
        this.noCache = noCache;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.remove = remove;
        this.tags = tags;
        this.target = target;
    }

    private RemoteImageBuildGetArgs() {
        this.buildArg = Codegen.empty();
        this.dockerfile = Codegen.empty();
        this.forceRemove = Codegen.empty();
        this.label = Codegen.empty();
        this.noCache = Codegen.empty();
        this.path = Codegen.empty();
        this.remove = Codegen.empty();
        this.tags = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteImageBuildGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> buildArg;
        private @Nullable Output<String> dockerfile;
        private @Nullable Output<Boolean> forceRemove;
        private @Nullable Output<Map<String,String>> label;
        private @Nullable Output<Boolean> noCache;
        private Output<String> path;
        private @Nullable Output<Boolean> remove;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RemoteImageBuildGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildArg = defaults.buildArg;
    	      this.dockerfile = defaults.dockerfile;
    	      this.forceRemove = defaults.forceRemove;
    	      this.label = defaults.label;
    	      this.noCache = defaults.noCache;
    	      this.path = defaults.path;
    	      this.remove = defaults.remove;
    	      this.tags = defaults.tags;
    	      this.target = defaults.target;
        }

        public Builder buildArg(@Nullable Output<Map<String,String>> buildArg) {
            this.buildArg = buildArg;
            return this;
        }
        public Builder buildArg(@Nullable Map<String,String> buildArg) {
            this.buildArg = Codegen.ofNullable(buildArg);
            return this;
        }
        public Builder dockerfile(@Nullable Output<String> dockerfile) {
            this.dockerfile = dockerfile;
            return this;
        }
        public Builder dockerfile(@Nullable String dockerfile) {
            this.dockerfile = Codegen.ofNullable(dockerfile);
            return this;
        }
        public Builder forceRemove(@Nullable Output<Boolean> forceRemove) {
            this.forceRemove = forceRemove;
            return this;
        }
        public Builder forceRemove(@Nullable Boolean forceRemove) {
            this.forceRemove = Codegen.ofNullable(forceRemove);
            return this;
        }
        public Builder label(@Nullable Output<Map<String,String>> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable Map<String,String> label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder noCache(@Nullable Output<Boolean> noCache) {
            this.noCache = noCache;
            return this;
        }
        public Builder noCache(@Nullable Boolean noCache) {
            this.noCache = Codegen.ofNullable(noCache);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder remove(@Nullable Output<Boolean> remove) {
            this.remove = remove;
            return this;
        }
        public Builder remove(@Nullable Boolean remove) {
            this.remove = Codegen.ofNullable(remove);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }        public RemoteImageBuildGetArgs build() {
            return new RemoteImageBuildGetArgs(buildArg, dockerfile, forceRemove, label, noCache, path, remove, tags, target);
        }
    }
}

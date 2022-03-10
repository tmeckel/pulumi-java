// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemoteImageBuildArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemoteImageBuildArgs Empty = new RemoteImageBuildArgs();

    @InputImport(name="buildArg")
      private final @Nullable Input<Map<String,String>> buildArg;

    public Input<Map<String,String>> getBuildArg() {
        return this.buildArg == null ? Input.empty() : this.buildArg;
    }

    @InputImport(name="dockerfile")
      private final @Nullable Input<String> dockerfile;

    public Input<String> getDockerfile() {
        return this.dockerfile == null ? Input.empty() : this.dockerfile;
    }

    @InputImport(name="forceRemove")
      private final @Nullable Input<Boolean> forceRemove;

    public Input<Boolean> getForceRemove() {
        return this.forceRemove == null ? Input.empty() : this.forceRemove;
    }

    @InputImport(name="label")
      private final @Nullable Input<Map<String,String>> label;

    public Input<Map<String,String>> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    @InputImport(name="noCache")
      private final @Nullable Input<Boolean> noCache;

    public Input<Boolean> getNoCache() {
        return this.noCache == null ? Input.empty() : this.noCache;
    }

    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    @InputImport(name="remove")
      private final @Nullable Input<Boolean> remove;

    public Input<Boolean> getRemove() {
        return this.remove == null ? Input.empty() : this.remove;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public RemoteImageBuildArgs(
        @Nullable Input<Map<String,String>> buildArg,
        @Nullable Input<String> dockerfile,
        @Nullable Input<Boolean> forceRemove,
        @Nullable Input<Map<String,String>> label,
        @Nullable Input<Boolean> noCache,
        Input<String> path,
        @Nullable Input<Boolean> remove,
        @Nullable Input<List<String>> tags,
        @Nullable Input<String> target) {
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

    private RemoteImageBuildArgs() {
        this.buildArg = Input.empty();
        this.dockerfile = Input.empty();
        this.forceRemove = Input.empty();
        this.label = Input.empty();
        this.noCache = Input.empty();
        this.path = Input.empty();
        this.remove = Input.empty();
        this.tags = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteImageBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> buildArg;
        private @Nullable Input<String> dockerfile;
        private @Nullable Input<Boolean> forceRemove;
        private @Nullable Input<Map<String,String>> label;
        private @Nullable Input<Boolean> noCache;
        private Input<String> path;
        private @Nullable Input<Boolean> remove;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RemoteImageBuildArgs defaults) {
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

        public Builder buildArg(@Nullable Input<Map<String,String>> buildArg) {
            this.buildArg = buildArg;
            return this;
        }

        public Builder buildArg(@Nullable Map<String,String> buildArg) {
            this.buildArg = Input.ofNullable(buildArg);
            return this;
        }

        public Builder dockerfile(@Nullable Input<String> dockerfile) {
            this.dockerfile = dockerfile;
            return this;
        }

        public Builder dockerfile(@Nullable String dockerfile) {
            this.dockerfile = Input.ofNullable(dockerfile);
            return this;
        }

        public Builder forceRemove(@Nullable Input<Boolean> forceRemove) {
            this.forceRemove = forceRemove;
            return this;
        }

        public Builder forceRemove(@Nullable Boolean forceRemove) {
            this.forceRemove = Input.ofNullable(forceRemove);
            return this;
        }

        public Builder label(@Nullable Input<Map<String,String>> label) {
            this.label = label;
            return this;
        }

        public Builder label(@Nullable Map<String,String> label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder noCache(@Nullable Input<Boolean> noCache) {
            this.noCache = noCache;
            return this;
        }

        public Builder noCache(@Nullable Boolean noCache) {
            this.noCache = Input.ofNullable(noCache);
            return this;
        }

        public Builder path(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder remove(@Nullable Input<Boolean> remove) {
            this.remove = remove;
            return this;
        }

        public Builder remove(@Nullable Boolean remove) {
            this.remove = Input.ofNullable(remove);
            return this;
        }

        public Builder tags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder target(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }
        public RemoteImageBuildArgs build() {
            return new RemoteImageBuildArgs(buildArg, dockerfile, forceRemove, label, noCache, path, remove, tags, target);
        }
    }
}

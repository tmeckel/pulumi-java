// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecVolumeSecretItemGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecVolumeSecretItemGetArgs Empty = new ServiceTemplateSpecVolumeSecretItemGetArgs();

    /**
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Mode bits to use on this file, must be a value between 0000 and 0777. If
     * not specified, the volume defaultMode will be used. This might be in
     * conflict with other options that affect the file mode, like fsGroup, and
     * the result can be other mode bits set.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<Integer> mode;

    public Output<Integer> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * The relative path of the file to map the key to.
     * May not be an absolute path.
     * May not contain the path element '..'.
     * May not start with the string '..'.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    public ServiceTemplateSpecVolumeSecretItemGetArgs(
        Output<String> key,
        @Nullable Output<Integer> mode,
        Output<String> path) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.mode = mode;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private ServiceTemplateSpecVolumeSecretItemGetArgs() {
        this.key = Codegen.empty();
        this.mode = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecVolumeSecretItemGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<Integer> mode;
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecVolumeSecretItemGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder mode(@Nullable Output<Integer> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable Integer mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }        public ServiceTemplateSpecVolumeSecretItemGetArgs build() {
            return new ServiceTemplateSpecVolumeSecretItemGetArgs(key, mode, path);
        }
    }
}

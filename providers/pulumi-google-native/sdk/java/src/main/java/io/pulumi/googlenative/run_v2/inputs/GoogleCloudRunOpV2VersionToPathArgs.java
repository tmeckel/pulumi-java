// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VersionToPath maps a specific version of a secret to a relative file to mount to, relative to VolumeMount's mount_path.
 * 
 */
public final class GoogleCloudRunOpV2VersionToPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2VersionToPathArgs Empty = new GoogleCloudRunOpV2VersionToPathArgs();

    /**
     * Integer octal mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<Integer> mode;

    public Input<Integer> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The relative path of the secret in the container.
     * 
     */
    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public GoogleCloudRunOpV2VersionToPathArgs(
        @Nullable Input<Integer> mode,
        Input<String> path,
        @Nullable Input<String> version) {
        this.mode = mode;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.version = version;
    }

    private GoogleCloudRunOpV2VersionToPathArgs() {
        this.mode = Input.empty();
        this.path = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VersionToPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> mode;
        private Input<String> path;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VersionToPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder setMode(@Nullable Input<Integer> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Integer mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public GoogleCloudRunOpV2VersionToPathArgs build() {
            return new GoogleCloudRunOpV2VersionToPathArgs(mode, path, version);
        }
    }
}

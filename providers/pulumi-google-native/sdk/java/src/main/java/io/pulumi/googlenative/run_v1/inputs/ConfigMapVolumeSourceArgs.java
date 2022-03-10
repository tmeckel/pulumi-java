// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.KeyToPathArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run Adapts a ConfigMap into a volume. The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths.
 * 
 */
public final class ConfigMapVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigMapVolumeSourceArgs Empty = new ConfigMapVolumeSourceArgs();

    /**
     * (Optional) Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @InputImport(name="defaultMode")
      private final @Nullable Input<Integer> defaultMode;

    public Input<Integer> getDefaultMode() {
        return this.defaultMode == null ? Input.empty() : this.defaultMode;
    }

    /**
     * (Optional) If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
     * 
     */
    @InputImport(name="items")
      private final @Nullable Input<List<KeyToPathArgs>> items;

    public Input<List<KeyToPathArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    /**
     * Name of the config.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * (Optional) Specify whether the Secret or its keys must be defined.
     * 
     */
    @InputImport(name="optional")
      private final @Nullable Input<Boolean> optional;

    public Input<Boolean> getOptional() {
        return this.optional == null ? Input.empty() : this.optional;
    }

    public ConfigMapVolumeSourceArgs(
        @Nullable Input<Integer> defaultMode,
        @Nullable Input<List<KeyToPathArgs>> items,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> optional) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    private ConfigMapVolumeSourceArgs() {
        this.defaultMode = Input.empty();
        this.items = Input.empty();
        this.name = Input.empty();
        this.optional = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultMode;
        private @Nullable Input<List<KeyToPathArgs>> items;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder defaultMode(@Nullable Input<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Input.ofNullable(defaultMode);
            return this;
        }

        public Builder items(@Nullable Input<List<KeyToPathArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder items(@Nullable List<KeyToPathArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder optional(@Nullable Input<Boolean> optional) {
            this.optional = optional;
            return this;
        }

        public Builder optional(@Nullable Boolean optional) {
            this.optional = Input.ofNullable(optional);
            return this;
        }
        public ConfigMapVolumeSourceArgs build() {
            return new ConfigMapVolumeSourceArgs(defaultMode, items, name, optional);
        }
    }
}

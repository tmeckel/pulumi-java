// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.KeyToPathArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Adapts a secret into a projected volume.
 * 
 * The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
 * 
 */
public final class SecretProjectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretProjectionArgs Empty = new SecretProjectionArgs();

    /**
     * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    @InputImport(name="items")
      private final @Nullable Input<List<KeyToPathArgs>> items;

    public Input<List<KeyToPathArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specify whether the Secret or its key must be defined
     * 
     */
    @InputImport(name="optional")
      private final @Nullable Input<Boolean> optional;

    public Input<Boolean> getOptional() {
        return this.optional == null ? Input.empty() : this.optional;
    }

    public SecretProjectionArgs(
        @Nullable Input<List<KeyToPathArgs>> items,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> optional) {
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    private SecretProjectionArgs() {
        this.items = Input.empty();
        this.name = Input.empty();
        this.optional = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<KeyToPathArgs>> items;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretProjectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
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
        public SecretProjectionArgs build() {
            return new SecretProjectionArgs(items, name, optional);
        }
    }
}

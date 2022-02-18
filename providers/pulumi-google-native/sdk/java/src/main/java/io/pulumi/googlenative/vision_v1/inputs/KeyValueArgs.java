// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A product label represented as a key-value pair.
 * 
 */
public final class KeyValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyValueArgs Empty = new KeyValueArgs();

    /**
     * The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public KeyValueArgs(
        @Nullable Input<String> key,
        @Nullable Input<String> value) {
        this.key = key;
        this.value = value;
    }

    private KeyValueArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public KeyValueArgs build() {
            return new KeyValueArgs(key, value);
        }
    }
}

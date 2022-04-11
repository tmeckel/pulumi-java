// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricDescriptorLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorLabelGetArgs Empty = new MetricDescriptorLabelGetArgs();

    /**
     * A human-readable description for the label.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    @Import(name="valueType")
      private final @Nullable Output<String> valueType;

    public Output<String> getValueType() {
        return this.valueType == null ? Codegen.empty() : this.valueType;
    }

    public MetricDescriptorLabelGetArgs(
        @Nullable Output<String> description,
        Output<String> key,
        @Nullable Output<String> valueType) {
        this.description = description;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.valueType = valueType;
    }

    private MetricDescriptorLabelGetArgs() {
        this.description = Codegen.empty();
        this.key = Codegen.empty();
        this.valueType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> key;
        private @Nullable Output<String> valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.valueType = defaults.valueType;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder valueType(@Nullable Output<String> valueType) {
            this.valueType = valueType;
            return this;
        }
        public Builder valueType(@Nullable String valueType) {
            this.valueType = Codegen.ofNullable(valueType);
            return this;
        }        public MetricDescriptorLabelGetArgs build() {
            return new MetricDescriptorLabelGetArgs(description, key, valueType);
        }
    }
}

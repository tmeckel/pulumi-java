// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a selector for extracting and matching an MSH field to a value.
 * 
 */
public final class VersionSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VersionSourceArgs Empty = new VersionSourceArgs();

    /**
     * The field to extract from the MSH segment. For example, "3.1" or "18[1].1".
     * 
     */
    @Import(name="mshField")
      private final @Nullable Output<String> mshField;

    public Output<String> getMshField() {
        return this.mshField == null ? Codegen.empty() : this.mshField;
    }

    /**
     * The value to match with the field. For example, "My Application Name" or "2.3".
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public VersionSourceArgs(
        @Nullable Output<String> mshField,
        @Nullable Output<String> value) {
        this.mshField = mshField;
        this.value = value;
    }

    private VersionSourceArgs() {
        this.mshField = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mshField;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mshField = defaults.mshField;
    	      this.value = defaults.value;
        }

        public Builder mshField(@Nullable Output<String> mshField) {
            this.mshField = mshField;
            return this;
        }
        public Builder mshField(@Nullable String mshField) {
            this.mshField = Codegen.ofNullable(mshField);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public VersionSourceArgs build() {
            return new VersionSourceArgs(mshField, value);
        }
    }
}

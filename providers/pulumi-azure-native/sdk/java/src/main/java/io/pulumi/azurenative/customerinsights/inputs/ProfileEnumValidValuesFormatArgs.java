// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Valid enum values in case of an enum property.
 * 
 */
public final class ProfileEnumValidValuesFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProfileEnumValidValuesFormatArgs Empty = new ProfileEnumValidValuesFormatArgs();

    /**
     * Localized names of the enum member.
     * 
     */
    @Import(name="localizedValueNames")
      private final @Nullable Output<Map<String,String>> localizedValueNames;

    public Output<Map<String,String>> getLocalizedValueNames() {
        return this.localizedValueNames == null ? Codegen.empty() : this.localizedValueNames;
    }

    /**
     * The integer value of the enum member.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ProfileEnumValidValuesFormatArgs(
        @Nullable Output<Map<String,String>> localizedValueNames,
        @Nullable Output<Integer> value) {
        this.localizedValueNames = localizedValueNames;
        this.value = value;
    }

    private ProfileEnumValidValuesFormatArgs() {
        this.localizedValueNames = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileEnumValidValuesFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> localizedValueNames;
        private @Nullable Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileEnumValidValuesFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localizedValueNames = defaults.localizedValueNames;
    	      this.value = defaults.value;
        }

        public Builder localizedValueNames(@Nullable Output<Map<String,String>> localizedValueNames) {
            this.localizedValueNames = localizedValueNames;
            return this;
        }
        public Builder localizedValueNames(@Nullable Map<String,String> localizedValueNames) {
            this.localizedValueNames = Codegen.ofNullable(localizedValueNames);
            return this;
        }
        public Builder value(@Nullable Output<Integer> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Integer value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ProfileEnumValidValuesFormatArgs build() {
            return new ProfileEnumValidValuesFormatArgs(localizedValueNames, value);
        }
    }
}

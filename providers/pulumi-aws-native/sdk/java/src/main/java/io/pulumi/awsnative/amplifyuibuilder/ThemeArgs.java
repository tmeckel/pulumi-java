// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder;

import io.pulumi.awsnative.amplifyuibuilder.inputs.ThemeTagsArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ThemeValuesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThemeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeArgs Empty = new ThemeArgs();

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="overrides")
      private final @Nullable Output<List<ThemeValuesArgs>> overrides;

    public Output<List<ThemeValuesArgs>> getOverrides() {
        return this.overrides == null ? Codegen.empty() : this.overrides;
    }

    @Import(name="tags")
      private final @Nullable Output<ThemeTagsArgs> tags;

    public Output<ThemeTagsArgs> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="values", required=true)
      private final Output<List<ThemeValuesArgs>> values;

    public Output<List<ThemeValuesArgs>> getValues() {
        return this.values;
    }

    public ThemeArgs(
        @Nullable Output<String> name,
        @Nullable Output<List<ThemeValuesArgs>> overrides,
        @Nullable Output<ThemeTagsArgs> tags,
        Output<List<ThemeValuesArgs>> values) {
        this.name = name;
        this.overrides = overrides;
        this.tags = tags;
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ThemeArgs() {
        this.name = Codegen.empty();
        this.overrides = Codegen.empty();
        this.tags = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<ThemeValuesArgs>> overrides;
        private @Nullable Output<ThemeTagsArgs> tags;
        private Output<List<ThemeValuesArgs>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.overrides = defaults.overrides;
    	      this.tags = defaults.tags;
    	      this.values = defaults.values;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder overrides(@Nullable Output<List<ThemeValuesArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }
        public Builder overrides(@Nullable List<ThemeValuesArgs> overrides) {
            this.overrides = Codegen.ofNullable(overrides);
            return this;
        }
        public Builder overrides(ThemeValuesArgs... overrides) {
            return overrides(List.of(overrides));
        }
        public Builder tags(@Nullable Output<ThemeTagsArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable ThemeTagsArgs tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder values(Output<List<ThemeValuesArgs>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(List<ThemeValuesArgs> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public Builder values(ThemeValuesArgs... values) {
            return values(List.of(values));
        }        public ThemeArgs build() {
            return new ThemeArgs(name, overrides, tags, values);
        }
    }
}

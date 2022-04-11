// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Selector of a column from a dataset for profile job configuration. One selector includes either a column name or a regular expression
 * 
 */
public final class RulesetColumnSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesetColumnSelectorArgs Empty = new RulesetColumnSelectorArgs();

    /**
     * The name of a column from a dataset
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A regular expression for selecting a column from a dataset
     * 
     */
    @Import(name="regex")
      private final @Nullable Output<String> regex;

    public Output<String> getRegex() {
        return this.regex == null ? Codegen.empty() : this.regex;
    }

    public RulesetColumnSelectorArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> regex) {
        this.name = name;
        this.regex = regex;
    }

    private RulesetColumnSelectorArgs() {
        this.name = Codegen.empty();
        this.regex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetColumnSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> regex;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetColumnSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regex = defaults.regex;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder regex(@Nullable Output<String> regex) {
            this.regex = regex;
            return this;
        }
        public Builder regex(@Nullable String regex) {
            this.regex = Codegen.ofNullable(regex);
            return this;
        }        public RulesetColumnSelectorArgs build() {
            return new RulesetColumnSelectorArgs(name, regex);
        }
    }
}

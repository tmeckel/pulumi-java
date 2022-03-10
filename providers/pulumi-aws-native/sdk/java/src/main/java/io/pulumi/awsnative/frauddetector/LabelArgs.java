// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.frauddetector.inputs.LabelTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelArgs Empty = new LabelArgs();

    /**
     * The label description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the label.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tags associated with this label.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<LabelTagArgs>> tags;

    public Input<List<LabelTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LabelArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<LabelTagArgs>> tags) {
        this.description = description;
        this.name = name;
        this.tags = tags;
    }

    private LabelArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<LabelTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder tags(@Nullable Input<List<LabelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<LabelTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LabelArgs build() {
            return new LabelArgs(description, name, tags);
        }
    }
}

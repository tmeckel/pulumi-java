// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSinkExclusionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSinkExclusionArgs Empty = new ProjectSinkExclusionArgs();

    /**
     * A description of this exclusion.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> getFilter() {
        return this.filter;
    }

    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ProjectSinkExclusionArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        Output<String> filter,
        Output<String> name) {
        this.description = description;
        this.disabled = disabled;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ProjectSinkExclusionArgs() {
        this.description = Codegen.empty();
        this.disabled = Codegen.empty();
        this.filter = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSinkExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private Output<String> filter;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSinkExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ProjectSinkExclusionArgs build() {
            return new ProjectSinkExclusionArgs(description, disabled, filter, name);
        }
    }
}

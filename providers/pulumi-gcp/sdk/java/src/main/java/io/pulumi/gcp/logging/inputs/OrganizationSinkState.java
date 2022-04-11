// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsGetArgs;
import io.pulumi.gcp.logging.inputs.OrganizationSinkExclusionGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSinkState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationSinkState Empty = new OrganizationSinkState();

    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @Import(name="bigqueryOptions")
      private final @Nullable Output<OrganizationSinkBigqueryOptionsGetArgs> bigqueryOptions;

    public Output<OrganizationSinkBigqueryOptionsGetArgs> getBigqueryOptions() {
        return this.bigqueryOptions == null ? Codegen.empty() : this.bigqueryOptions;
    }

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
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    @Import(name="destination")
      private final @Nullable Output<String> destination;

    public Output<String> getDestination() {
        return this.destination == null ? Codegen.empty() : this.destination;
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
     * Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    @Import(name="exclusions")
      private final @Nullable Output<List<OrganizationSinkExclusionGetArgs>> exclusions;

    public Output<List<OrganizationSinkExclusionGetArgs>> getExclusions() {
        return this.exclusions == null ? Codegen.empty() : this.exclusions;
    }

    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * Whether or not to include children organizations in the sink export. If true, logs
     * associated with child projects are also exported; otherwise only logs relating to the provided organization are included.
     * 
     */
    @Import(name="includeChildren")
      private final @Nullable Output<Boolean> includeChildren;

    public Output<Boolean> getIncludeChildren() {
        return this.includeChildren == null ? Codegen.empty() : this.includeChildren;
    }

    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The numeric ID of the organization to be exported to the sink.
     * 
     */
    @Import(name="orgId")
      private final @Nullable Output<String> orgId;

    public Output<String> getOrgId() {
        return this.orgId == null ? Codegen.empty() : this.orgId;
    }

    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    @Import(name="writerIdentity")
      private final @Nullable Output<String> writerIdentity;

    public Output<String> getWriterIdentity() {
        return this.writerIdentity == null ? Codegen.empty() : this.writerIdentity;
    }

    public OrganizationSinkState(
        @Nullable Output<OrganizationSinkBigqueryOptionsGetArgs> bigqueryOptions,
        @Nullable Output<String> description,
        @Nullable Output<String> destination,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<OrganizationSinkExclusionGetArgs>> exclusions,
        @Nullable Output<String> filter,
        @Nullable Output<Boolean> includeChildren,
        @Nullable Output<String> name,
        @Nullable Output<String> orgId,
        @Nullable Output<String> writerIdentity) {
        this.bigqueryOptions = bigqueryOptions;
        this.description = description;
        this.destination = destination;
        this.disabled = disabled;
        this.exclusions = exclusions;
        this.filter = filter;
        this.includeChildren = includeChildren;
        this.name = name;
        this.orgId = orgId;
        this.writerIdentity = writerIdentity;
    }

    private OrganizationSinkState() {
        this.bigqueryOptions = Codegen.empty();
        this.description = Codegen.empty();
        this.destination = Codegen.empty();
        this.disabled = Codegen.empty();
        this.exclusions = Codegen.empty();
        this.filter = Codegen.empty();
        this.includeChildren = Codegen.empty();
        this.name = Codegen.empty();
        this.orgId = Codegen.empty();
        this.writerIdentity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OrganizationSinkBigqueryOptionsGetArgs> bigqueryOptions;
        private @Nullable Output<String> description;
        private @Nullable Output<String> destination;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<OrganizationSinkExclusionGetArgs>> exclusions;
        private @Nullable Output<String> filter;
        private @Nullable Output<Boolean> includeChildren;
        private @Nullable Output<String> name;
        private @Nullable Output<String> orgId;
        private @Nullable Output<String> writerIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSinkState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryOptions = defaults.bigqueryOptions;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.disabled = defaults.disabled;
    	      this.exclusions = defaults.exclusions;
    	      this.filter = defaults.filter;
    	      this.includeChildren = defaults.includeChildren;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.writerIdentity = defaults.writerIdentity;
        }

        public Builder bigqueryOptions(@Nullable Output<OrganizationSinkBigqueryOptionsGetArgs> bigqueryOptions) {
            this.bigqueryOptions = bigqueryOptions;
            return this;
        }
        public Builder bigqueryOptions(@Nullable OrganizationSinkBigqueryOptionsGetArgs bigqueryOptions) {
            this.bigqueryOptions = Codegen.ofNullable(bigqueryOptions);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destination(@Nullable Output<String> destination) {
            this.destination = destination;
            return this;
        }
        public Builder destination(@Nullable String destination) {
            this.destination = Codegen.ofNullable(destination);
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
        public Builder exclusions(@Nullable Output<List<OrganizationSinkExclusionGetArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(@Nullable List<OrganizationSinkExclusionGetArgs> exclusions) {
            this.exclusions = Codegen.ofNullable(exclusions);
            return this;
        }
        public Builder exclusions(OrganizationSinkExclusionGetArgs... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder includeChildren(@Nullable Output<Boolean> includeChildren) {
            this.includeChildren = includeChildren;
            return this;
        }
        public Builder includeChildren(@Nullable Boolean includeChildren) {
            this.includeChildren = Codegen.ofNullable(includeChildren);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder orgId(@Nullable Output<String> orgId) {
            this.orgId = orgId;
            return this;
        }
        public Builder orgId(@Nullable String orgId) {
            this.orgId = Codegen.ofNullable(orgId);
            return this;
        }
        public Builder writerIdentity(@Nullable Output<String> writerIdentity) {
            this.writerIdentity = writerIdentity;
            return this;
        }
        public Builder writerIdentity(@Nullable String writerIdentity) {
            this.writerIdentity = Codegen.ofNullable(writerIdentity);
            return this;
        }        public OrganizationSinkState build() {
            return new OrganizationSinkState(bigqueryOptions, description, destination, disabled, exclusions, filter, includeChildren, name, orgId, writerIdentity);
        }
    }
}

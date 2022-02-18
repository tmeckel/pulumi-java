// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.logging_v2.inputs.BigQueryOptionsArgs;
import io.pulumi.googlenative.logging_v2.inputs.LogExclusionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountSinkArgs Empty = new BillingAccountSinkArgs();

    /**
     * Optional. Options that affect sinks exporting data to BigQuery.
     * 
     */
    @InputImport(name="bigqueryOptions")
    private final @Nullable Input<BigQueryOptionsArgs> bigqueryOptions;

    public Input<BigQueryOptionsArgs> getBigqueryOptions() {
        return this.bigqueryOptions == null ? Input.empty() : this.bigqueryOptions;
    }

    @InputImport(name="billingAccountId", required=true)
    private final Input<String> billingAccountId;

    public Input<String> getBillingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Optional. A description of this sink.The maximum length of the description is 8000 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The export destination: "storage.googleapis.com/[GCS_BUCKET]" "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]" "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set when the sink is created, must have permission to write to the destination or else the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
     * 
     */
    @InputImport(name="destination", required=true)
    private final Input<String> destination;

    public Input<String> getDestination() {
        return this.destination;
    }

    /**
     * Optional. If set to true, then this sink is disabled and it does not export any log entries.
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * Optional. Log entries that match any of these exclusion filters will not be exported.If a log entry is matched by both filter and one of exclusion_filters it will not be exported.
     * 
     */
    @InputImport(name="exclusions")
    private final @Nullable Input<List<LogExclusionArgs>> exclusions;

    public Input<List<LogExclusionArgs>> getExclusions() {
        return this.exclusions == null ? Input.empty() : this.exclusions;
    }

    /**
     * Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and that match the filter.For example:logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink's parent resource are available for export. If the field is true, then log entries from all the projects, folders, and billing accounts contained in the sink's parent resource are also available for export. Whether a particular log entry from the children is exported depends on the sink's filter expression.For example, if this field is true, then the filter resource.type=gce_instance would export all Compute Engine VM instance log entries from all projects in the sink's parent.To only export entries from certain child projects, filter on the project part of the log name:logName:("projects/test-project1/" OR "projects/test-project2/") AND resource.type=gce_instance
     * 
     */
    @InputImport(name="includeChildren")
    private final @Nullable Input<Boolean> includeChildren;

    public Input<Boolean> getIncludeChildren() {
        return this.includeChildren == null ? Input.empty() : this.includeChildren;
    }

    /**
     * The client-assigned sink identifier, unique within the project.For example: "my-syslog-errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="uniqueWriterIdentity")
    private final @Nullable Input<String> uniqueWriterIdentity;

    public Input<String> getUniqueWriterIdentity() {
        return this.uniqueWriterIdentity == null ? Input.empty() : this.uniqueWriterIdentity;
    }

    public BillingAccountSinkArgs(
        @Nullable Input<BigQueryOptionsArgs> bigqueryOptions,
        Input<String> billingAccountId,
        @Nullable Input<String> description,
        Input<String> destination,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<List<LogExclusionArgs>> exclusions,
        @Nullable Input<String> filter,
        @Nullable Input<Boolean> includeChildren,
        @Nullable Input<String> name,
        @Nullable Input<String> uniqueWriterIdentity) {
        this.bigqueryOptions = bigqueryOptions;
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.description = description;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.disabled = disabled;
        this.exclusions = exclusions;
        this.filter = filter;
        this.includeChildren = includeChildren;
        this.name = name;
        this.uniqueWriterIdentity = uniqueWriterIdentity;
    }

    private BillingAccountSinkArgs() {
        this.bigqueryOptions = Input.empty();
        this.billingAccountId = Input.empty();
        this.description = Input.empty();
        this.destination = Input.empty();
        this.disabled = Input.empty();
        this.exclusions = Input.empty();
        this.filter = Input.empty();
        this.includeChildren = Input.empty();
        this.name = Input.empty();
        this.uniqueWriterIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BigQueryOptionsArgs> bigqueryOptions;
        private Input<String> billingAccountId;
        private @Nullable Input<String> description;
        private Input<String> destination;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<List<LogExclusionArgs>> exclusions;
        private @Nullable Input<String> filter;
        private @Nullable Input<Boolean> includeChildren;
        private @Nullable Input<String> name;
        private @Nullable Input<String> uniqueWriterIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryOptions = defaults.bigqueryOptions;
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.disabled = defaults.disabled;
    	      this.exclusions = defaults.exclusions;
    	      this.filter = defaults.filter;
    	      this.includeChildren = defaults.includeChildren;
    	      this.name = defaults.name;
    	      this.uniqueWriterIdentity = defaults.uniqueWriterIdentity;
        }

        public Builder setBigqueryOptions(@Nullable Input<BigQueryOptionsArgs> bigqueryOptions) {
            this.bigqueryOptions = bigqueryOptions;
            return this;
        }

        public Builder setBigqueryOptions(@Nullable BigQueryOptionsArgs bigqueryOptions) {
            this.bigqueryOptions = Input.ofNullable(bigqueryOptions);
            return this;
        }

        public Builder setBillingAccountId(Input<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }

        public Builder setBillingAccountId(String billingAccountId) {
            this.billingAccountId = Input.of(Objects.requireNonNull(billingAccountId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestination(Input<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setExclusions(@Nullable Input<List<LogExclusionArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setExclusions(@Nullable List<LogExclusionArgs> exclusions) {
            this.exclusions = Input.ofNullable(exclusions);
            return this;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setIncludeChildren(@Nullable Input<Boolean> includeChildren) {
            this.includeChildren = includeChildren;
            return this;
        }

        public Builder setIncludeChildren(@Nullable Boolean includeChildren) {
            this.includeChildren = Input.ofNullable(includeChildren);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setUniqueWriterIdentity(@Nullable Input<String> uniqueWriterIdentity) {
            this.uniqueWriterIdentity = uniqueWriterIdentity;
            return this;
        }

        public Builder setUniqueWriterIdentity(@Nullable String uniqueWriterIdentity) {
            this.uniqueWriterIdentity = Input.ofNullable(uniqueWriterIdentity);
            return this;
        }

        public BillingAccountSinkArgs build() {
            return new BillingAccountSinkArgs(bigqueryOptions, billingAccountId, description, destination, disabled, exclusions, filter, includeChildren, name, uniqueWriterIdentity);
        }
    }
}

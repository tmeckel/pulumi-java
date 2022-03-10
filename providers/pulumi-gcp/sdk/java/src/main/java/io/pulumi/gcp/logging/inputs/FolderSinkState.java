// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsGetArgs;
import io.pulumi.gcp.logging.inputs.FolderSinkExclusionGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderSinkState extends io.pulumi.resources.ResourceArgs {

    public static final FolderSinkState Empty = new FolderSinkState();

    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @InputImport(name="bigqueryOptions")
      private final @Nullable Input<FolderSinkBigqueryOptionsGetArgs> bigqueryOptions;

    public Input<FolderSinkBigqueryOptionsGetArgs> getBigqueryOptions() {
        return this.bigqueryOptions == null ? Input.empty() : this.bigqueryOptions;
    }

    /**
     * A description of this exclusion.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<String> destination;

    public Input<String> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    @InputImport(name="exclusions")
      private final @Nullable Input<List<FolderSinkExclusionGetArgs>> exclusions;

    public Input<List<FolderSinkExclusionGetArgs>> getExclusions() {
        return this.exclusions == null ? Input.empty() : this.exclusions;
    }

    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     * 
     */
    @InputImport(name="folder")
      private final @Nullable Input<String> folder;

    public Input<String> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * Whether or not to include children folders in the sink export. If true, logs
     * associated with child projects are also exported; otherwise only logs relating to the provided folder are included.
     * 
     */
    @InputImport(name="includeChildren")
      private final @Nullable Input<Boolean> includeChildren;

    public Input<Boolean> getIncludeChildren() {
        return this.includeChildren == null ? Input.empty() : this.includeChildren;
    }

    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    @InputImport(name="writerIdentity")
      private final @Nullable Input<String> writerIdentity;

    public Input<String> getWriterIdentity() {
        return this.writerIdentity == null ? Input.empty() : this.writerIdentity;
    }

    public FolderSinkState(
        @Nullable Input<FolderSinkBigqueryOptionsGetArgs> bigqueryOptions,
        @Nullable Input<String> description,
        @Nullable Input<String> destination,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<List<FolderSinkExclusionGetArgs>> exclusions,
        @Nullable Input<String> filter,
        @Nullable Input<String> folder,
        @Nullable Input<Boolean> includeChildren,
        @Nullable Input<String> name,
        @Nullable Input<String> writerIdentity) {
        this.bigqueryOptions = bigqueryOptions;
        this.description = description;
        this.destination = destination;
        this.disabled = disabled;
        this.exclusions = exclusions;
        this.filter = filter;
        this.folder = folder;
        this.includeChildren = includeChildren;
        this.name = name;
        this.writerIdentity = writerIdentity;
    }

    private FolderSinkState() {
        this.bigqueryOptions = Input.empty();
        this.description = Input.empty();
        this.destination = Input.empty();
        this.disabled = Input.empty();
        this.exclusions = Input.empty();
        this.filter = Input.empty();
        this.folder = Input.empty();
        this.includeChildren = Input.empty();
        this.name = Input.empty();
        this.writerIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderSinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FolderSinkBigqueryOptionsGetArgs> bigqueryOptions;
        private @Nullable Input<String> description;
        private @Nullable Input<String> destination;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<List<FolderSinkExclusionGetArgs>> exclusions;
        private @Nullable Input<String> filter;
        private @Nullable Input<String> folder;
        private @Nullable Input<Boolean> includeChildren;
        private @Nullable Input<String> name;
        private @Nullable Input<String> writerIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderSinkState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryOptions = defaults.bigqueryOptions;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.disabled = defaults.disabled;
    	      this.exclusions = defaults.exclusions;
    	      this.filter = defaults.filter;
    	      this.folder = defaults.folder;
    	      this.includeChildren = defaults.includeChildren;
    	      this.name = defaults.name;
    	      this.writerIdentity = defaults.writerIdentity;
        }

        public Builder bigqueryOptions(@Nullable Input<FolderSinkBigqueryOptionsGetArgs> bigqueryOptions) {
            this.bigqueryOptions = bigqueryOptions;
            return this;
        }

        public Builder bigqueryOptions(@Nullable FolderSinkBigqueryOptionsGetArgs bigqueryOptions) {
            this.bigqueryOptions = Input.ofNullable(bigqueryOptions);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder destination(@Nullable Input<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder disabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder exclusions(@Nullable Input<List<FolderSinkExclusionGetArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder exclusions(@Nullable List<FolderSinkExclusionGetArgs> exclusions) {
            this.exclusions = Input.ofNullable(exclusions);
            return this;
        }

        public Builder filter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder folder(@Nullable Input<String> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(@Nullable String folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder includeChildren(@Nullable Input<Boolean> includeChildren) {
            this.includeChildren = includeChildren;
            return this;
        }

        public Builder includeChildren(@Nullable Boolean includeChildren) {
            this.includeChildren = Input.ofNullable(includeChildren);
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

        public Builder writerIdentity(@Nullable Input<String> writerIdentity) {
            this.writerIdentity = writerIdentity;
            return this;
        }

        public Builder writerIdentity(@Nullable String writerIdentity) {
            this.writerIdentity = Input.ofNullable(writerIdentity);
            return this;
        }
        public FolderSinkState build() {
            return new FolderSinkState(bigqueryOptions, description, destination, disabled, exclusions, filter, folder, includeChildren, name, writerIdentity);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigtableadmin_v2.enums.TableGranularity;
import io.pulumi.googlenative.bigtableadmin_v2.inputs.SplitArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * The column families configured for this table, mapped by column family ID. Views: `SCHEMA_VIEW`, `FULL`
     * 
     */
    @InputImport(name="columnFamilies")
    private final @Nullable Input<Map<String,String>> columnFamilies;

    public Input<Map<String,String>> getColumnFamilies() {
        return this.columnFamilies == null ? Input.empty() : this.columnFamilies;
    }

    /**
     * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table. Timestamps not matching the granularity will be rejected. If unspecified at creation time, the value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
     * 
     */
    @InputImport(name="granularity")
    private final @Nullable Input<TableGranularity> granularity;

    public Input<TableGranularity> getGranularity() {
        return this.granularity == null ? Input.empty() : this.granularity;
    }

    /**
     * The optional list of row keys that will be used to initially split the table into several tablets (tablets are similar to HBase regions). Given two split keys, `s1` and `s2`, three tablets will be created, spanning the key ranges: `[, s1), [s1, s2), [s2, )`. Example: * Row keys := `["a", "apple", "custom", "customer_1", "customer_2",` `"other", "zz"]` * initial_split_keys := `["apple", "customer_1", "customer_2", "other"]` * Key assignment: - Tablet 1 `[, apple) => {"a"}.` - Tablet 2 `[apple, customer_1) => {"apple", "custom"}.` - Tablet 3 `[customer_1, customer_2) => {"customer_1"}.` - Tablet 4 `[customer_2, other) => {"customer_2"}.` - Tablet 5 `[other, ) => {"other", "zz"}.`
     * 
     */
    @InputImport(name="initialSplits")
    private final @Nullable Input<List<SplitArgs>> initialSplits;

    public Input<List<SplitArgs>> getInitialSplits() {
        return this.initialSplits == null ? Input.empty() : this.initialSplits;
    }

    @InputImport(name="instanceId", required=true)
    private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * The unique name of the table. Values are of the form `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The name by which the new table should be referred to within the parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`. Maximum 50 characters.
     * 
     */
    @InputImport(name="tableId", required=true)
    private final Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId;
    }

    public TableArgs(
        @Nullable Input<Map<String,String>> columnFamilies,
        @Nullable Input<TableGranularity> granularity,
        @Nullable Input<List<SplitArgs>> initialSplits,
        Input<String> instanceId,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> tableId) {
        this.columnFamilies = columnFamilies;
        this.granularity = granularity;
        this.initialSplits = initialSplits;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.project = project;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private TableArgs() {
        this.columnFamilies = Input.empty();
        this.granularity = Input.empty();
        this.initialSplits = Input.empty();
        this.instanceId = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> columnFamilies;
        private @Nullable Input<TableGranularity> granularity;
        private @Nullable Input<List<SplitArgs>> initialSplits;
        private Input<String> instanceId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFamilies = defaults.columnFamilies;
    	      this.granularity = defaults.granularity;
    	      this.initialSplits = defaults.initialSplits;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder setColumnFamilies(@Nullable Input<Map<String,String>> columnFamilies) {
            this.columnFamilies = columnFamilies;
            return this;
        }

        public Builder setColumnFamilies(@Nullable Map<String,String> columnFamilies) {
            this.columnFamilies = Input.ofNullable(columnFamilies);
            return this;
        }

        public Builder setGranularity(@Nullable Input<TableGranularity> granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder setGranularity(@Nullable TableGranularity granularity) {
            this.granularity = Input.ofNullable(granularity);
            return this;
        }

        public Builder setInitialSplits(@Nullable Input<List<SplitArgs>> initialSplits) {
            this.initialSplits = initialSplits;
            return this;
        }

        public Builder setInitialSplits(@Nullable List<SplitArgs> initialSplits) {
            this.initialSplits = Input.ofNullable(initialSplits);
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTableId(Input<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Input.of(Objects.requireNonNull(tableId));
            return this;
        }

        public TableArgs build() {
            return new TableArgs(columnFamilies, granularity, initialSplits, instanceId, name, project, tableId);
        }
    }
}

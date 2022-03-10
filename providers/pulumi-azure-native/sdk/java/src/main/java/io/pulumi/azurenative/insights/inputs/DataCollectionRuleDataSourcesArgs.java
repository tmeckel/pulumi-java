// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ExtensionDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.PerfCounterDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.SyslogDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.WindowsEventLogDataSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specification of data sources.
 * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
 * 
 */
public final class DataCollectionRuleDataSourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDataSourcesArgs Empty = new DataCollectionRuleDataSourcesArgs();

    /**
     * The list of Azure VM extension data source configurations.
     * 
     */
    @InputImport(name="extensions")
      private final @Nullable Input<List<ExtensionDataSourceArgs>> extensions;

    public Input<List<ExtensionDataSourceArgs>> getExtensions() {
        return this.extensions == null ? Input.empty() : this.extensions;
    }

    /**
     * The list of performance counter data source configurations.
     * 
     */
    @InputImport(name="performanceCounters")
      private final @Nullable Input<List<PerfCounterDataSourceArgs>> performanceCounters;

    public Input<List<PerfCounterDataSourceArgs>> getPerformanceCounters() {
        return this.performanceCounters == null ? Input.empty() : this.performanceCounters;
    }

    /**
     * The list of Syslog data source configurations.
     * 
     */
    @InputImport(name="syslog")
      private final @Nullable Input<List<SyslogDataSourceArgs>> syslog;

    public Input<List<SyslogDataSourceArgs>> getSyslog() {
        return this.syslog == null ? Input.empty() : this.syslog;
    }

    /**
     * The list of Windows Event Log data source configurations.
     * 
     */
    @InputImport(name="windowsEventLogs")
      private final @Nullable Input<List<WindowsEventLogDataSourceArgs>> windowsEventLogs;

    public Input<List<WindowsEventLogDataSourceArgs>> getWindowsEventLogs() {
        return this.windowsEventLogs == null ? Input.empty() : this.windowsEventLogs;
    }

    public DataCollectionRuleDataSourcesArgs(
        @Nullable Input<List<ExtensionDataSourceArgs>> extensions,
        @Nullable Input<List<PerfCounterDataSourceArgs>> performanceCounters,
        @Nullable Input<List<SyslogDataSourceArgs>> syslog,
        @Nullable Input<List<WindowsEventLogDataSourceArgs>> windowsEventLogs) {
        this.extensions = extensions;
        this.performanceCounters = performanceCounters;
        this.syslog = syslog;
        this.windowsEventLogs = windowsEventLogs;
    }

    private DataCollectionRuleDataSourcesArgs() {
        this.extensions = Input.empty();
        this.performanceCounters = Input.empty();
        this.syslog = Input.empty();
        this.windowsEventLogs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDataSourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ExtensionDataSourceArgs>> extensions;
        private @Nullable Input<List<PerfCounterDataSourceArgs>> performanceCounters;
        private @Nullable Input<List<SyslogDataSourceArgs>> syslog;
        private @Nullable Input<List<WindowsEventLogDataSourceArgs>> windowsEventLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleDataSourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.performanceCounters = defaults.performanceCounters;
    	      this.syslog = defaults.syslog;
    	      this.windowsEventLogs = defaults.windowsEventLogs;
        }

        public Builder extensions(@Nullable Input<List<ExtensionDataSourceArgs>> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder extensions(@Nullable List<ExtensionDataSourceArgs> extensions) {
            this.extensions = Input.ofNullable(extensions);
            return this;
        }

        public Builder performanceCounters(@Nullable Input<List<PerfCounterDataSourceArgs>> performanceCounters) {
            this.performanceCounters = performanceCounters;
            return this;
        }

        public Builder performanceCounters(@Nullable List<PerfCounterDataSourceArgs> performanceCounters) {
            this.performanceCounters = Input.ofNullable(performanceCounters);
            return this;
        }

        public Builder syslog(@Nullable Input<List<SyslogDataSourceArgs>> syslog) {
            this.syslog = syslog;
            return this;
        }

        public Builder syslog(@Nullable List<SyslogDataSourceArgs> syslog) {
            this.syslog = Input.ofNullable(syslog);
            return this;
        }

        public Builder windowsEventLogs(@Nullable Input<List<WindowsEventLogDataSourceArgs>> windowsEventLogs) {
            this.windowsEventLogs = windowsEventLogs;
            return this;
        }

        public Builder windowsEventLogs(@Nullable List<WindowsEventLogDataSourceArgs> windowsEventLogs) {
            this.windowsEventLogs = Input.ofNullable(windowsEventLogs);
            return this;
        }
        public DataCollectionRuleDataSourcesArgs build() {
            return new DataCollectionRuleDataSourcesArgs(extensions, performanceCounters, syslog, windowsEventLogs);
        }
    }
}

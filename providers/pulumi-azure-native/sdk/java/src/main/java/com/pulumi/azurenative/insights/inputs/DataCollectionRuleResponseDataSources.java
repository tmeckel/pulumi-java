// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.ExtensionDataSourceResponse;
import com.pulumi.azurenative.insights.inputs.PerfCounterDataSourceResponse;
import com.pulumi.azurenative.insights.inputs.SyslogDataSourceResponse;
import com.pulumi.azurenative.insights.inputs.WindowsEventLogDataSourceResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification of data sources.
 * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
 * 
 */
public final class DataCollectionRuleResponseDataSources extends com.pulumi.resources.InvokeArgs {

    public static final DataCollectionRuleResponseDataSources Empty = new DataCollectionRuleResponseDataSources();

    /**
     * The list of Azure VM extension data source configurations.
     * 
     */
    @Import(name="extensions")
    private @Nullable List<ExtensionDataSourceResponse> extensions;

    /**
     * @return The list of Azure VM extension data source configurations.
     * 
     */
    public Optional<List<ExtensionDataSourceResponse>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * The list of performance counter data source configurations.
     * 
     */
    @Import(name="performanceCounters")
    private @Nullable List<PerfCounterDataSourceResponse> performanceCounters;

    /**
     * @return The list of performance counter data source configurations.
     * 
     */
    public Optional<List<PerfCounterDataSourceResponse>> performanceCounters() {
        return Optional.ofNullable(this.performanceCounters);
    }

    /**
     * The list of Syslog data source configurations.
     * 
     */
    @Import(name="syslog")
    private @Nullable List<SyslogDataSourceResponse> syslog;

    /**
     * @return The list of Syslog data source configurations.
     * 
     */
    public Optional<List<SyslogDataSourceResponse>> syslog() {
        return Optional.ofNullable(this.syslog);
    }

    /**
     * The list of Windows Event Log data source configurations.
     * 
     */
    @Import(name="windowsEventLogs")
    private @Nullable List<WindowsEventLogDataSourceResponse> windowsEventLogs;

    /**
     * @return The list of Windows Event Log data source configurations.
     * 
     */
    public Optional<List<WindowsEventLogDataSourceResponse>> windowsEventLogs() {
        return Optional.ofNullable(this.windowsEventLogs);
    }

    private DataCollectionRuleResponseDataSources() {}

    private DataCollectionRuleResponseDataSources(DataCollectionRuleResponseDataSources $) {
        this.extensions = $.extensions;
        this.performanceCounters = $.performanceCounters;
        this.syslog = $.syslog;
        this.windowsEventLogs = $.windowsEventLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleResponseDataSources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleResponseDataSources $;

        public Builder() {
            $ = new DataCollectionRuleResponseDataSources();
        }

        public Builder(DataCollectionRuleResponseDataSources defaults) {
            $ = new DataCollectionRuleResponseDataSources(Objects.requireNonNull(defaults));
        }

        /**
         * @param extensions The list of Azure VM extension data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable List<ExtensionDataSourceResponse> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions The list of Azure VM extension data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder extensions(ExtensionDataSourceResponse... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param performanceCounters The list of performance counter data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(@Nullable List<PerfCounterDataSourceResponse> performanceCounters) {
            $.performanceCounters = performanceCounters;
            return this;
        }

        /**
         * @param performanceCounters The list of performance counter data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(PerfCounterDataSourceResponse... performanceCounters) {
            return performanceCounters(List.of(performanceCounters));
        }

        /**
         * @param syslog The list of Syslog data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder syslog(@Nullable List<SyslogDataSourceResponse> syslog) {
            $.syslog = syslog;
            return this;
        }

        /**
         * @param syslog The list of Syslog data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder syslog(SyslogDataSourceResponse... syslog) {
            return syslog(List.of(syslog));
        }

        /**
         * @param windowsEventLogs The list of Windows Event Log data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(@Nullable List<WindowsEventLogDataSourceResponse> windowsEventLogs) {
            $.windowsEventLogs = windowsEventLogs;
            return this;
        }

        /**
         * @param windowsEventLogs The list of Windows Event Log data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(WindowsEventLogDataSourceResponse... windowsEventLogs) {
            return windowsEventLogs(List.of(windowsEventLogs));
        }

        public DataCollectionRuleResponseDataSources build() {
            return $;
        }
    }

}

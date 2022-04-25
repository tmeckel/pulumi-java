// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the logging behavior for transfer operations. For cloud-to-cloud transfers, logs are sent to Cloud Logging. See [Read transfer logs](https://cloud.google.com/storage-transfer/docs/read-transfer-logs) for details. For transfers to or from a POSIX file system, logs are stored in the Cloud Storage bucket that is the source or sink of the transfer. See [Managing Transfer for on-premises jobs] (https://cloud.google.com/storage-transfer/docs/managing-on-prem-jobs#viewing-logs) for details.
 * 
 */
public final class LoggingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoggingConfigResponse Empty = new LoggingConfigResponse();

    /**
     * For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
     */
    @Import(name="enableOnpremGcsTransferLogs", required=true)
    private Boolean enableOnpremGcsTransferLogs;

    /**
     * @return For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
     */
    public Boolean enableOnpremGcsTransferLogs() {
        return this.enableOnpremGcsTransferLogs;
    }

    /**
     * States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @Import(name="logActionStates", required=true)
    private List<String> logActionStates;

    /**
     * @return States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    public List<String> logActionStates() {
        return this.logActionStates;
    }

    /**
     * Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @Import(name="logActions", required=true)
    private List<String> logActions;

    /**
     * @return Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    public List<String> logActions() {
        return this.logActions;
    }

    private LoggingConfigResponse() {}

    private LoggingConfigResponse(LoggingConfigResponse $) {
        this.enableOnpremGcsTransferLogs = $.enableOnpremGcsTransferLogs;
        this.logActionStates = $.logActionStates;
        this.logActions = $.logActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigResponse $;

        public Builder() {
            $ = new LoggingConfigResponse();
        }

        public Builder(LoggingConfigResponse defaults) {
            $ = new LoggingConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableOnpremGcsTransferLogs For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
         * 
         * @return builder
         * 
         */
        public Builder enableOnpremGcsTransferLogs(Boolean enableOnpremGcsTransferLogs) {
            $.enableOnpremGcsTransferLogs = enableOnpremGcsTransferLogs;
            return this;
        }

        /**
         * @param logActionStates States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActionStates(List<String> logActionStates) {
            $.logActionStates = logActionStates;
            return this;
        }

        /**
         * @param logActionStates States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActionStates(String... logActionStates) {
            return logActionStates(List.of(logActionStates));
        }

        /**
         * @param logActions Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActions(List<String> logActions) {
            $.logActions = logActions;
            return this;
        }

        /**
         * @param logActions Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActions(String... logActions) {
            return logActions(List.of(logActions));
        }

        public LoggingConfigResponse build() {
            $.enableOnpremGcsTransferLogs = Objects.requireNonNull($.enableOnpremGcsTransferLogs, "expected parameter 'enableOnpremGcsTransferLogs' to be non-null");
            $.logActionStates = Objects.requireNonNull($.logActionStates, "expected parameter 'logActionStates' to be non-null");
            $.logActions = Objects.requireNonNull($.logActions, "expected parameter 'logActions' to be non-null");
            return $;
        }
    }

}

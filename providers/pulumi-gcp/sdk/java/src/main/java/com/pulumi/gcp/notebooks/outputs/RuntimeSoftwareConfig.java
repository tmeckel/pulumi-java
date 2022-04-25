// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeSoftwareConfig {
    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    private final @Nullable String customGpuDriverPath;
    /**
     * @return Verifies core internal services are running. Default: True.
     * 
     */
    private final @Nullable Boolean enableHealthMonitoring;
    /**
     * @return Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    private final @Nullable Boolean idleShutdown;
    /**
     * @return Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    private final @Nullable Integer idleShutdownTimeout;
    /**
     * @return Install Nvidia Driver automatically.
     * 
     */
    private final @Nullable Boolean installGpuDriver;
    /**
     * @return Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    private final @Nullable String notebookUpgradeSchedule;
    /**
     * @return Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    private final @Nullable String postStartupScript;

    @CustomType.Constructor
    private RuntimeSoftwareConfig(
        @CustomType.Parameter("customGpuDriverPath") @Nullable String customGpuDriverPath,
        @CustomType.Parameter("enableHealthMonitoring") @Nullable Boolean enableHealthMonitoring,
        @CustomType.Parameter("idleShutdown") @Nullable Boolean idleShutdown,
        @CustomType.Parameter("idleShutdownTimeout") @Nullable Integer idleShutdownTimeout,
        @CustomType.Parameter("installGpuDriver") @Nullable Boolean installGpuDriver,
        @CustomType.Parameter("notebookUpgradeSchedule") @Nullable String notebookUpgradeSchedule,
        @CustomType.Parameter("postStartupScript") @Nullable String postStartupScript) {
        this.customGpuDriverPath = customGpuDriverPath;
        this.enableHealthMonitoring = enableHealthMonitoring;
        this.idleShutdown = idleShutdown;
        this.idleShutdownTimeout = idleShutdownTimeout;
        this.installGpuDriver = installGpuDriver;
        this.notebookUpgradeSchedule = notebookUpgradeSchedule;
        this.postStartupScript = postStartupScript;
    }

    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    public Optional<String> customGpuDriverPath() {
        return Optional.ofNullable(this.customGpuDriverPath);
    }
    /**
     * @return Verifies core internal services are running. Default: True.
     * 
     */
    public Optional<Boolean> enableHealthMonitoring() {
        return Optional.ofNullable(this.enableHealthMonitoring);
    }
    /**
     * @return Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    public Optional<Boolean> idleShutdown() {
        return Optional.ofNullable(this.idleShutdown);
    }
    /**
     * @return Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    public Optional<Integer> idleShutdownTimeout() {
        return Optional.ofNullable(this.idleShutdownTimeout);
    }
    /**
     * @return Install Nvidia Driver automatically.
     * 
     */
    public Optional<Boolean> installGpuDriver() {
        return Optional.ofNullable(this.installGpuDriver);
    }
    /**
     * @return Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    public Optional<String> notebookUpgradeSchedule() {
        return Optional.ofNullable(this.notebookUpgradeSchedule);
    }
    /**
     * @return Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    public Optional<String> postStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeSoftwareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customGpuDriverPath;
        private @Nullable Boolean enableHealthMonitoring;
        private @Nullable Boolean idleShutdown;
        private @Nullable Integer idleShutdownTimeout;
        private @Nullable Boolean installGpuDriver;
        private @Nullable String notebookUpgradeSchedule;
        private @Nullable String postStartupScript;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.enableHealthMonitoring = defaults.enableHealthMonitoring;
    	      this.idleShutdown = defaults.idleShutdown;
    	      this.idleShutdownTimeout = defaults.idleShutdownTimeout;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.notebookUpgradeSchedule = defaults.notebookUpgradeSchedule;
    	      this.postStartupScript = defaults.postStartupScript;
        }

        public Builder customGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }
        public Builder enableHealthMonitoring(@Nullable Boolean enableHealthMonitoring) {
            this.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }
        public Builder idleShutdown(@Nullable Boolean idleShutdown) {
            this.idleShutdown = idleShutdown;
            return this;
        }
        public Builder idleShutdownTimeout(@Nullable Integer idleShutdownTimeout) {
            this.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }
        public Builder installGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }
        public Builder notebookUpgradeSchedule(@Nullable String notebookUpgradeSchedule) {
            this.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }
        public Builder postStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }        public RuntimeSoftwareConfig build() {
            return new RuntimeSoftwareConfig(customGpuDriverPath, enableHealthMonitoring, idleShutdown, idleShutdownTimeout, installGpuDriver, notebookUpgradeSchedule, postStartupScript);
        }
    }
}

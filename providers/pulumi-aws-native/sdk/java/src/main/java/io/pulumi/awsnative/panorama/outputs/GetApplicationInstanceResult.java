// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.outputs;

import io.pulumi.awsnative.panorama.enums.ApplicationInstanceHealthStatus;
import io.pulumi.awsnative.panorama.enums.ApplicationInstanceStatus;
import io.pulumi.awsnative.panorama.enums.ApplicationInstanceStatusFilter;
import io.pulumi.awsnative.panorama.outputs.ApplicationInstanceTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApplicationInstanceResult {
    private final @Nullable String applicationInstanceId;
    private final @Nullable String arn;
    private final @Nullable Integer createdTime;
    private final @Nullable String defaultRuntimeContextDeviceName;
    private final @Nullable String deviceId;
    private final @Nullable ApplicationInstanceHealthStatus healthStatus;
    private final @Nullable Integer lastUpdatedTime;
    private final @Nullable ApplicationInstanceStatus status;
    private final @Nullable String statusDescription;
    private final @Nullable ApplicationInstanceStatusFilter statusFilter;
    private final @Nullable List<ApplicationInstanceTag> tags;

    @OutputCustomType.Constructor
    private GetApplicationInstanceResult(
        @OutputCustomType.Parameter("applicationInstanceId") @Nullable String applicationInstanceId,
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("createdTime") @Nullable Integer createdTime,
        @OutputCustomType.Parameter("defaultRuntimeContextDeviceName") @Nullable String defaultRuntimeContextDeviceName,
        @OutputCustomType.Parameter("deviceId") @Nullable String deviceId,
        @OutputCustomType.Parameter("healthStatus") @Nullable ApplicationInstanceHealthStatus healthStatus,
        @OutputCustomType.Parameter("lastUpdatedTime") @Nullable Integer lastUpdatedTime,
        @OutputCustomType.Parameter("status") @Nullable ApplicationInstanceStatus status,
        @OutputCustomType.Parameter("statusDescription") @Nullable String statusDescription,
        @OutputCustomType.Parameter("statusFilter") @Nullable ApplicationInstanceStatusFilter statusFilter,
        @OutputCustomType.Parameter("tags") @Nullable List<ApplicationInstanceTag> tags) {
        this.applicationInstanceId = applicationInstanceId;
        this.arn = arn;
        this.createdTime = createdTime;
        this.defaultRuntimeContextDeviceName = defaultRuntimeContextDeviceName;
        this.deviceId = deviceId;
        this.healthStatus = healthStatus;
        this.lastUpdatedTime = lastUpdatedTime;
        this.status = status;
        this.statusDescription = statusDescription;
        this.statusFilter = statusFilter;
        this.tags = tags;
    }

    public Optional<String> getApplicationInstanceId() {
        return Optional.ofNullable(this.applicationInstanceId);
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Integer> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> getDefaultRuntimeContextDeviceName() {
        return Optional.ofNullable(this.defaultRuntimeContextDeviceName);
    }
    public Optional<String> getDeviceId() {
        return Optional.ofNullable(this.deviceId);
    }
    public Optional<ApplicationInstanceHealthStatus> getHealthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }
    public Optional<Integer> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<ApplicationInstanceStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> getStatusDescription() {
        return Optional.ofNullable(this.statusDescription);
    }
    public Optional<ApplicationInstanceStatusFilter> getStatusFilter() {
        return Optional.ofNullable(this.statusFilter);
    }
    public List<ApplicationInstanceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationInstanceId;
        private @Nullable String arn;
        private @Nullable Integer createdTime;
        private @Nullable String defaultRuntimeContextDeviceName;
        private @Nullable String deviceId;
        private @Nullable ApplicationInstanceHealthStatus healthStatus;
        private @Nullable Integer lastUpdatedTime;
        private @Nullable ApplicationInstanceStatus status;
        private @Nullable String statusDescription;
        private @Nullable ApplicationInstanceStatusFilter statusFilter;
        private @Nullable List<ApplicationInstanceTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationInstanceId = defaults.applicationInstanceId;
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.defaultRuntimeContextDeviceName = defaults.defaultRuntimeContextDeviceName;
    	      this.deviceId = defaults.deviceId;
    	      this.healthStatus = defaults.healthStatus;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.status = defaults.status;
    	      this.statusDescription = defaults.statusDescription;
    	      this.statusFilter = defaults.statusFilter;
    	      this.tags = defaults.tags;
        }

        public Builder applicationInstanceId(@Nullable String applicationInstanceId) {
            this.applicationInstanceId = applicationInstanceId;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder createdTime(@Nullable Integer createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder defaultRuntimeContextDeviceName(@Nullable String defaultRuntimeContextDeviceName) {
            this.defaultRuntimeContextDeviceName = defaultRuntimeContextDeviceName;
            return this;
        }

        public Builder deviceId(@Nullable String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder healthStatus(@Nullable ApplicationInstanceHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable Integer lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder status(@Nullable ApplicationInstanceStatus status) {
            this.status = status;
            return this;
        }

        public Builder statusDescription(@Nullable String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }

        public Builder statusFilter(@Nullable ApplicationInstanceStatusFilter statusFilter) {
            this.statusFilter = statusFilter;
            return this;
        }

        public Builder tags(@Nullable List<ApplicationInstanceTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetApplicationInstanceResult build() {
            return new GetApplicationInstanceResult(applicationInstanceId, arn, createdTime, defaultRuntimeContextDeviceName, deviceId, healthStatus, lastUpdatedTime, status, statusDescription, statusFilter, tags);
        }
    }
}

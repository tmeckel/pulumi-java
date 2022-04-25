// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3DataDistributionType;
import com.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3InputMode;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoringScheduleEndpointInput {
    private final String endpointName;
    /**
     * @return Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    private final String localPath;
    /**
     * @return Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    private final @Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType;
    /**
     * @return Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    private final @Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode;

    @CustomType.Constructor
    private MonitoringScheduleEndpointInput(
        @CustomType.Parameter("endpointName") String endpointName,
        @CustomType.Parameter("localPath") String localPath,
        @CustomType.Parameter("s3DataDistributionType") @Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType,
        @CustomType.Parameter("s3InputMode") @Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode) {
        this.endpointName = endpointName;
        this.localPath = localPath;
        this.s3DataDistributionType = s3DataDistributionType;
        this.s3InputMode = s3InputMode;
    }

    public String endpointName() {
        return this.endpointName;
    }
    /**
     * @return Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    public String localPath() {
        return this.localPath;
    }
    /**
     * @return Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    public Optional<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType() {
        return Optional.ofNullable(this.s3DataDistributionType);
    }
    /**
     * @return Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    public Optional<MonitoringScheduleEndpointInputS3InputMode> s3InputMode() {
        return Optional.ofNullable(this.s3InputMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleEndpointInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointName;
        private String localPath;
        private @Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType;
        private @Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleEndpointInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.localPath = defaults.localPath;
    	      this.s3DataDistributionType = defaults.s3DataDistributionType;
    	      this.s3InputMode = defaults.s3InputMode;
        }

        public Builder endpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }
        public Builder localPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public Builder s3DataDistributionType(@Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType) {
            this.s3DataDistributionType = s3DataDistributionType;
            return this;
        }
        public Builder s3InputMode(@Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode) {
            this.s3InputMode = s3InputMode;
            return this;
        }        public MonitoringScheduleEndpointInput build() {
            return new MonitoringScheduleEndpointInput(endpointName, localPath, s3DataDistributionType, s3InputMode);
        }
    }
}

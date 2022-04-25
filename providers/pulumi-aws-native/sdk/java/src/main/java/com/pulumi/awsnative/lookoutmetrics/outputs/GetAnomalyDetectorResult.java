// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.outputs;

import com.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorConfig;
import com.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorMetricSet;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAnomalyDetectorResult {
    /**
     * @return Configuration options for the AnomalyDetector
     * 
     */
    private final @Nullable AnomalyDetectorConfig anomalyDetectorConfig;
    /**
     * @return A description for the AnomalyDetector.
     * 
     */
    private final @Nullable String anomalyDetectorDescription;
    private final @Nullable String arn;
    /**
     * @return KMS key used to encrypt the AnomalyDetector data
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * @return List of metric sets for anomaly detection
     * 
     */
    private final @Nullable List<AnomalyDetectorMetricSet> metricSetList;

    @CustomType.Constructor
    private GetAnomalyDetectorResult(
        @CustomType.Parameter("anomalyDetectorConfig") @Nullable AnomalyDetectorConfig anomalyDetectorConfig,
        @CustomType.Parameter("anomalyDetectorDescription") @Nullable String anomalyDetectorDescription,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("metricSetList") @Nullable List<AnomalyDetectorMetricSet> metricSetList) {
        this.anomalyDetectorConfig = anomalyDetectorConfig;
        this.anomalyDetectorDescription = anomalyDetectorDescription;
        this.arn = arn;
        this.kmsKeyArn = kmsKeyArn;
        this.metricSetList = metricSetList;
    }

    /**
     * @return Configuration options for the AnomalyDetector
     * 
     */
    public Optional<AnomalyDetectorConfig> anomalyDetectorConfig() {
        return Optional.ofNullable(this.anomalyDetectorConfig);
    }
    /**
     * @return A description for the AnomalyDetector.
     * 
     */
    public Optional<String> anomalyDetectorDescription() {
        return Optional.ofNullable(this.anomalyDetectorDescription);
    }
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return KMS key used to encrypt the AnomalyDetector data
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return List of metric sets for anomaly detection
     * 
     */
    public List<AnomalyDetectorMetricSet> metricSetList() {
        return this.metricSetList == null ? List.of() : this.metricSetList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnomalyDetectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnomalyDetectorConfig anomalyDetectorConfig;
        private @Nullable String anomalyDetectorDescription;
        private @Nullable String arn;
        private @Nullable String kmsKeyArn;
        private @Nullable List<AnomalyDetectorMetricSet> metricSetList;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnomalyDetectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyDetectorConfig = defaults.anomalyDetectorConfig;
    	      this.anomalyDetectorDescription = defaults.anomalyDetectorDescription;
    	      this.arn = defaults.arn;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.metricSetList = defaults.metricSetList;
        }

        public Builder anomalyDetectorConfig(@Nullable AnomalyDetectorConfig anomalyDetectorConfig) {
            this.anomalyDetectorConfig = anomalyDetectorConfig;
            return this;
        }
        public Builder anomalyDetectorDescription(@Nullable String anomalyDetectorDescription) {
            this.anomalyDetectorDescription = anomalyDetectorDescription;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder metricSetList(@Nullable List<AnomalyDetectorMetricSet> metricSetList) {
            this.metricSetList = metricSetList;
            return this;
        }
        public Builder metricSetList(AnomalyDetectorMetricSet... metricSetList) {
            return metricSetList(List.of(metricSetList));
        }        public GetAnomalyDetectorResult build() {
            return new GetAnomalyDetectorResult(anomalyDetectorConfig, anomalyDetectorDescription, arn, kmsKeyArn, metricSetList);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringOutputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The output configuration for monitoring jobs.
 * 
 */
public final class MonitoringScheduleMonitoringOutputConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringOutputConfigArgs Empty = new MonitoringScheduleMonitoringOutputConfigArgs();

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
     */
    @Import(name="monitoringOutputs", required=true)
    private Output<List<MonitoringScheduleMonitoringOutputArgs>> monitoringOutputs;

    /**
     * @return Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
     */
    public Output<List<MonitoringScheduleMonitoringOutputArgs>> monitoringOutputs() {
        return this.monitoringOutputs;
    }

    private MonitoringScheduleMonitoringOutputConfigArgs() {}

    private MonitoringScheduleMonitoringOutputConfigArgs(MonitoringScheduleMonitoringOutputConfigArgs $) {
        this.kmsKeyId = $.kmsKeyId;
        this.monitoringOutputs = $.monitoringOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleMonitoringOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleMonitoringOutputConfigArgs $;

        public Builder() {
            $ = new MonitoringScheduleMonitoringOutputConfigArgs();
        }

        public Builder(MonitoringScheduleMonitoringOutputConfigArgs defaults) {
            $ = new MonitoringScheduleMonitoringOutputConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyId The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param monitoringOutputs Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
         * 
         * @return builder
         * 
         */
        public Builder monitoringOutputs(Output<List<MonitoringScheduleMonitoringOutputArgs>> monitoringOutputs) {
            $.monitoringOutputs = monitoringOutputs;
            return this;
        }

        /**
         * @param monitoringOutputs Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
         * 
         * @return builder
         * 
         */
        public Builder monitoringOutputs(List<MonitoringScheduleMonitoringOutputArgs> monitoringOutputs) {
            return monitoringOutputs(Output.of(monitoringOutputs));
        }

        /**
         * @param monitoringOutputs Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
         * 
         * @return builder
         * 
         */
        public Builder monitoringOutputs(MonitoringScheduleMonitoringOutputArgs... monitoringOutputs) {
            return monitoringOutputs(List.of(monitoringOutputs));
        }

        public MonitoringScheduleMonitoringOutputConfigArgs build() {
            $.monitoringOutputs = Objects.requireNonNull($.monitoringOutputs, "expected parameter 'monitoringOutputs' to be non-null");
            return $;
        }
    }

}

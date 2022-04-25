// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkingStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkingStorageArgs Empty = new WorkingStorageArgs();

    /**
     * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     * 
     */
    @Import(name="diskId", required=true)
    private Output<String> diskId;

    /**
     * @return Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="gatewayArn", required=true)
    private Output<String> gatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    public Output<String> gatewayArn() {
        return this.gatewayArn;
    }

    private WorkingStorageArgs() {}

    private WorkingStorageArgs(WorkingStorageArgs $) {
        this.diskId = $.diskId;
        this.gatewayArn = $.gatewayArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkingStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkingStorageArgs $;

        public Builder() {
            $ = new WorkingStorageArgs();
        }

        public Builder(WorkingStorageArgs defaults) {
            $ = new WorkingStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskId Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
         * 
         * @return builder
         * 
         */
        public Builder diskId(Output<String> diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param diskId Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
         * 
         * @return builder
         * 
         */
        public Builder diskId(String diskId) {
            return diskId(Output.of(diskId));
        }

        /**
         * @param gatewayArn The Amazon Resource Name (ARN) of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayArn(Output<String> gatewayArn) {
            $.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * @param gatewayArn The Amazon Resource Name (ARN) of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayArn(String gatewayArn) {
            return gatewayArn(Output.of(gatewayArn));
        }

        public WorkingStorageArgs build() {
            $.diskId = Objects.requireNonNull($.diskId, "expected parameter 'diskId' to be non-null");
            $.gatewayArn = Objects.requireNonNull($.gatewayArn, "expected parameter 'gatewayArn' to be non-null");
            return $;
        }
    }

}

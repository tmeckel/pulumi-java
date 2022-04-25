// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UploadBufferArgs extends com.pulumi.resources.ResourceArgs {

    public static final UploadBufferArgs Empty = new UploadBufferArgs();

    /**
     * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     * 
     */
    @Import(name="diskId")
    private @Nullable Output<String> diskId;

    /**
     * @return Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     * 
     */
    public Optional<Output<String>> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * Local disk path. For example, `/dev/nvme1n1`.
     * 
     */
    @Import(name="diskPath")
    private @Nullable Output<String> diskPath;

    /**
     * @return Local disk path. For example, `/dev/nvme1n1`.
     * 
     */
    public Optional<Output<String>> diskPath() {
        return Optional.ofNullable(this.diskPath);
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

    private UploadBufferArgs() {}

    private UploadBufferArgs(UploadBufferArgs $) {
        this.diskId = $.diskId;
        this.diskPath = $.diskPath;
        this.gatewayArn = $.gatewayArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UploadBufferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UploadBufferArgs $;

        public Builder() {
            $ = new UploadBufferArgs();
        }

        public Builder(UploadBufferArgs defaults) {
            $ = new UploadBufferArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskId Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable Output<String> diskId) {
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
         * @param diskPath Local disk path. For example, `/dev/nvme1n1`.
         * 
         * @return builder
         * 
         */
        public Builder diskPath(@Nullable Output<String> diskPath) {
            $.diskPath = diskPath;
            return this;
        }

        /**
         * @param diskPath Local disk path. For example, `/dev/nvme1n1`.
         * 
         * @return builder
         * 
         */
        public Builder diskPath(String diskPath) {
            return diskPath(Output.of(diskPath));
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

        public UploadBufferArgs build() {
            $.gatewayArn = Objects.requireNonNull($.gatewayArn, "expected parameter 'gatewayArn' to be non-null");
            return $;
        }
    }

}

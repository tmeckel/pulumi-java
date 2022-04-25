// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentArgs Empty = new VolumeAttachmentArgs();

    /**
     * The device name to expose to the instance (for
     * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name to expose to the instance (for
     * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Set to `true` if you want to force the
     * volume to detach. Useful if previous attempts failed, but use this option only
     * as a last resort, as this can result in **data loss**. See
     * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
     * 
     */
    @Import(name="forceDetach")
    private @Nullable Output<Boolean> forceDetach;

    /**
     * @return Set to `true` if you want to force the
     * volume to detach. Useful if previous attempts failed, but use this option only
     * as a last resort, as this can result in **data loss**. See
     * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
     * 
     */
    public Optional<Output<Boolean>> forceDetach() {
        return Optional.ofNullable(this.forceDetach);
    }

    /**
     * ID of the Instance to attach to
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return ID of the Instance to attach to
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Set this to true if you do not wish
     * to detach the volume from the instance to which it is attached at destroy
     * time, and instead just remove the attachment from this provider state. This is
     * useful when destroying an instance which has volumes created by some other
     * means attached.
     * 
     */
    @Import(name="skipDestroy")
    private @Nullable Output<Boolean> skipDestroy;

    /**
     * @return Set this to true if you do not wish
     * to detach the volume from the instance to which it is attached at destroy
     * time, and instead just remove the attachment from this provider state. This is
     * useful when destroying an instance which has volumes created by some other
     * means attached.
     * 
     */
    public Optional<Output<Boolean>> skipDestroy() {
        return Optional.ofNullable(this.skipDestroy);
    }

    /**
     * Set this to true to ensure that the target instance is stopped
     * before trying to detach the volume. Stops the instance, if it is not already stopped.
     * 
     */
    @Import(name="stopInstanceBeforeDetaching")
    private @Nullable Output<Boolean> stopInstanceBeforeDetaching;

    /**
     * @return Set this to true to ensure that the target instance is stopped
     * before trying to detach the volume. Stops the instance, if it is not already stopped.
     * 
     */
    public Optional<Output<Boolean>> stopInstanceBeforeDetaching() {
        return Optional.ofNullable(this.stopInstanceBeforeDetaching);
    }

    /**
     * ID of the Volume to be attached
     * 
     */
    @Import(name="volumeId", required=true)
    private Output<String> volumeId;

    /**
     * @return ID of the Volume to be attached
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    private VolumeAttachmentArgs() {}

    private VolumeAttachmentArgs(VolumeAttachmentArgs $) {
        this.deviceName = $.deviceName;
        this.forceDetach = $.forceDetach;
        this.instanceId = $.instanceId;
        this.skipDestroy = $.skipDestroy;
        this.stopInstanceBeforeDetaching = $.stopInstanceBeforeDetaching;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeAttachmentArgs $;

        public Builder() {
            $ = new VolumeAttachmentArgs();
        }

        public Builder(VolumeAttachmentArgs defaults) {
            $ = new VolumeAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName The device name to expose to the instance (for
         * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name to expose to the instance (for
         * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param forceDetach Set to `true` if you want to force the
         * volume to detach. Useful if previous attempts failed, but use this option only
         * as a last resort, as this can result in **data loss**. See
         * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder forceDetach(@Nullable Output<Boolean> forceDetach) {
            $.forceDetach = forceDetach;
            return this;
        }

        /**
         * @param forceDetach Set to `true` if you want to force the
         * volume to detach. Useful if previous attempts failed, but use this option only
         * as a last resort, as this can result in **data loss**. See
         * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder forceDetach(Boolean forceDetach) {
            return forceDetach(Output.of(forceDetach));
        }

        /**
         * @param instanceId ID of the Instance to attach to
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the Instance to attach to
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param skipDestroy Set this to true if you do not wish
         * to detach the volume from the instance to which it is attached at destroy
         * time, and instead just remove the attachment from this provider state. This is
         * useful when destroying an instance which has volumes created by some other
         * means attached.
         * 
         * @return builder
         * 
         */
        public Builder skipDestroy(@Nullable Output<Boolean> skipDestroy) {
            $.skipDestroy = skipDestroy;
            return this;
        }

        /**
         * @param skipDestroy Set this to true if you do not wish
         * to detach the volume from the instance to which it is attached at destroy
         * time, and instead just remove the attachment from this provider state. This is
         * useful when destroying an instance which has volumes created by some other
         * means attached.
         * 
         * @return builder
         * 
         */
        public Builder skipDestroy(Boolean skipDestroy) {
            return skipDestroy(Output.of(skipDestroy));
        }

        /**
         * @param stopInstanceBeforeDetaching Set this to true to ensure that the target instance is stopped
         * before trying to detach the volume. Stops the instance, if it is not already stopped.
         * 
         * @return builder
         * 
         */
        public Builder stopInstanceBeforeDetaching(@Nullable Output<Boolean> stopInstanceBeforeDetaching) {
            $.stopInstanceBeforeDetaching = stopInstanceBeforeDetaching;
            return this;
        }

        /**
         * @param stopInstanceBeforeDetaching Set this to true to ensure that the target instance is stopped
         * before trying to detach the volume. Stops the instance, if it is not already stopped.
         * 
         * @return builder
         * 
         */
        public Builder stopInstanceBeforeDetaching(Boolean stopInstanceBeforeDetaching) {
            return stopInstanceBeforeDetaching(Output.of(stopInstanceBeforeDetaching));
        }

        /**
         * @param volumeId ID of the Volume to be attached
         * 
         * @return builder
         * 
         */
        public Builder volumeId(Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId ID of the Volume to be attached
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public VolumeAttachmentArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.volumeId = Objects.requireNonNull($.volumeId, "expected parameter 'volumeId' to be non-null");
            return $;
        }
    }

}

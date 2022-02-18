// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.inputs.LocalDiskInitializeParamsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Local attached disk resource.
 * 
 */
public final class LocalDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalDiskArgs Empty = new LocalDiskArgs();

    /**
     * Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    @InputImport(name="initializeParams")
    private final @Nullable Input<LocalDiskInitializeParamsArgs> initializeParams;

    public Input<LocalDiskInitializeParamsArgs> getInitializeParams() {
        return this.initializeParams == null ? Input.empty() : this.initializeParams;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * NVME * SCSI
     * 
     */
    @InputImport(name="interface")
    private final @Nullable Input<String> $interface;

    public Input<String> get$interface() {
        return this.$interface == null ? Input.empty() : this.$interface;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource.
     * 
     */
    @InputImport(name="source")
    private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT. Valid values: * PERSISTENT * SCRATCH
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public LocalDiskArgs(
        @Nullable Input<LocalDiskInitializeParamsArgs> initializeParams,
        @Nullable Input<String> $interface,
        @Nullable Input<String> mode,
        @Nullable Input<String> source,
        @Nullable Input<String> type) {
        this.initializeParams = initializeParams;
        this.$interface = $interface;
        this.mode = mode;
        this.source = source;
        this.type = type;
    }

    private LocalDiskArgs() {
        this.initializeParams = Input.empty();
        this.$interface = Input.empty();
        this.mode = Input.empty();
        this.source = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LocalDiskInitializeParamsArgs> initializeParams;
        private @Nullable Input<String> $interface;
        private @Nullable Input<String> mode;
        private @Nullable Input<String> source;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initializeParams = defaults.initializeParams;
    	      this.$interface = defaults.$interface;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setInitializeParams(@Nullable Input<LocalDiskInitializeParamsArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }

        public Builder setInitializeParams(@Nullable LocalDiskInitializeParamsArgs initializeParams) {
            this.initializeParams = Input.ofNullable(initializeParams);
            return this;
        }

        public Builder set$interface(@Nullable Input<String> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = Input.ofNullable($interface);
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public LocalDiskArgs build() {
            return new LocalDiskArgs(initializeParams, $interface, mode, source, type);
        }
    }
}

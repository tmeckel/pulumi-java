// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkerConfigResponse {
    /**
     * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    private final String diskSizeGb;
    /**
     * Machine type of a worker, such as `e2-medium`. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). If left blank, Cloud Build will use a sensible default.
     * 
     */
    private final String machineType;

    @OutputCustomType.Constructor({"diskSizeGb","machineType"})
    private WorkerConfigResponse(
        String diskSizeGb,
        String machineType) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.machineType = Objects.requireNonNull(machineType);
    }

    /**
     * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Machine type of a worker, such as `e2-medium`. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). If left blank, Cloud Build will use a sensible default.
     * 
     */
    public String getMachineType() {
        return this.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskSizeGb;
        private String machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public WorkerConfigResponse build() {
            return new WorkerConfigResponse(diskSizeGb, machineType);
        }
    }
}

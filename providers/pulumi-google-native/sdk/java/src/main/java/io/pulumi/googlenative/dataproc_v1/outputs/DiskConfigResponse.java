// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiskConfigResponse {
    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
     */
    private final Integer bootDiskSizeGb;
    /**
     * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive), "pd-ssd" (Persistent Disk Solid State Drive), or "pd-standard" (Persistent Disk Hard Disk Drive). See Disk types (https://cloud.google.com/compute/docs/disks#disk-types).
     * 
     */
    private final String bootDiskType;
    /**
     * Optional. Interface type of local SSDs (default is "scsi"). Valid values: "scsi" (Small Computer System Interface), "nvme" (Non-Volatile Memory Express). See local SSD performance (https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * 
     */
    private final String localSsdInterface;
    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
     */
    private final Integer numLocalSsds;

    @OutputCustomType.Constructor({"bootDiskSizeGb","bootDiskType","localSsdInterface","numLocalSsds"})
    private DiskConfigResponse(
        Integer bootDiskSizeGb,
        String bootDiskType,
        String localSsdInterface,
        Integer numLocalSsds) {
        this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb);
        this.bootDiskType = Objects.requireNonNull(bootDiskType);
        this.localSsdInterface = Objects.requireNonNull(localSsdInterface);
        this.numLocalSsds = Objects.requireNonNull(numLocalSsds);
    }

    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
     */
    public Integer getBootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }
    /**
     * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive), "pd-ssd" (Persistent Disk Solid State Drive), or "pd-standard" (Persistent Disk Hard Disk Drive). See Disk types (https://cloud.google.com/compute/docs/disks#disk-types).
     * 
     */
    public String getBootDiskType() {
        return this.bootDiskType;
    }
    /**
     * Optional. Interface type of local SSDs (default is "scsi"). Valid values: "scsi" (Small Computer System Interface), "nvme" (Non-Volatile Memory Express). See local SSD performance (https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * 
     */
    public String getLocalSsdInterface() {
        return this.localSsdInterface;
    }
    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
     */
    public Integer getNumLocalSsds() {
        return this.numLocalSsds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bootDiskSizeGb;
        private String bootDiskType;
        private String localSsdInterface;
        private Integer numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.localSsdInterface = defaults.localSsdInterface;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder setBootDiskSizeGb(Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb);
            return this;
        }

        public Builder setBootDiskType(String bootDiskType) {
            this.bootDiskType = Objects.requireNonNull(bootDiskType);
            return this;
        }

        public Builder setLocalSsdInterface(String localSsdInterface) {
            this.localSsdInterface = Objects.requireNonNull(localSsdInterface);
            return this;
        }

        public Builder setNumLocalSsds(Integer numLocalSsds) {
            this.numLocalSsds = Objects.requireNonNull(numLocalSsds);
            return this;
        }

        public DiskConfigResponse build() {
            return new DiskConfigResponse(bootDiskSizeGb, bootDiskType, localSsdInterface, numLocalSsds);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VmUtilizationMetricsResponse {
    /**
     * Average CPU usage, percent.
     * 
     */
    private final Integer cpuAveragePercent;
    /**
     * Max CPU usage, percent.
     * 
     */
    private final Integer cpuMaxPercent;
    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    private final String diskIoRateAverageKbps;
    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    private final String diskIoRateMaxKbps;
    /**
     * Average memory usage, percent.
     * 
     */
    private final Integer memoryAveragePercent;
    /**
     * Max memory usage, percent.
     * 
     */
    private final Integer memoryMaxPercent;
    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    private final String networkThroughputAverageKbps;
    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    private final String networkThroughputMaxKbps;

    @OutputCustomType.Constructor({"cpuAveragePercent","cpuMaxPercent","diskIoRateAverageKbps","diskIoRateMaxKbps","memoryAveragePercent","memoryMaxPercent","networkThroughputAverageKbps","networkThroughputMaxKbps"})
    private VmUtilizationMetricsResponse(
        Integer cpuAveragePercent,
        Integer cpuMaxPercent,
        String diskIoRateAverageKbps,
        String diskIoRateMaxKbps,
        Integer memoryAveragePercent,
        Integer memoryMaxPercent,
        String networkThroughputAverageKbps,
        String networkThroughputMaxKbps) {
        this.cpuAveragePercent = Objects.requireNonNull(cpuAveragePercent);
        this.cpuMaxPercent = Objects.requireNonNull(cpuMaxPercent);
        this.diskIoRateAverageKbps = Objects.requireNonNull(diskIoRateAverageKbps);
        this.diskIoRateMaxKbps = Objects.requireNonNull(diskIoRateMaxKbps);
        this.memoryAveragePercent = Objects.requireNonNull(memoryAveragePercent);
        this.memoryMaxPercent = Objects.requireNonNull(memoryMaxPercent);
        this.networkThroughputAverageKbps = Objects.requireNonNull(networkThroughputAverageKbps);
        this.networkThroughputMaxKbps = Objects.requireNonNull(networkThroughputMaxKbps);
    }

    /**
     * Average CPU usage, percent.
     * 
     */
    public Integer getCpuAveragePercent() {
        return this.cpuAveragePercent;
    }
    /**
     * Max CPU usage, percent.
     * 
     */
    public Integer getCpuMaxPercent() {
        return this.cpuMaxPercent;
    }
    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    public String getDiskIoRateAverageKbps() {
        return this.diskIoRateAverageKbps;
    }
    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    public String getDiskIoRateMaxKbps() {
        return this.diskIoRateMaxKbps;
    }
    /**
     * Average memory usage, percent.
     * 
     */
    public Integer getMemoryAveragePercent() {
        return this.memoryAveragePercent;
    }
    /**
     * Max memory usage, percent.
     * 
     */
    public Integer getMemoryMaxPercent() {
        return this.memoryMaxPercent;
    }
    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public String getNetworkThroughputAverageKbps() {
        return this.networkThroughputAverageKbps;
    }
    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public String getNetworkThroughputMaxKbps() {
        return this.networkThroughputMaxKbps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuAveragePercent;
        private Integer cpuMaxPercent;
        private String diskIoRateAverageKbps;
        private String diskIoRateMaxKbps;
        private Integer memoryAveragePercent;
        private Integer memoryMaxPercent;
        private String networkThroughputAverageKbps;
        private String networkThroughputMaxKbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuAveragePercent = defaults.cpuAveragePercent;
    	      this.cpuMaxPercent = defaults.cpuMaxPercent;
    	      this.diskIoRateAverageKbps = defaults.diskIoRateAverageKbps;
    	      this.diskIoRateMaxKbps = defaults.diskIoRateMaxKbps;
    	      this.memoryAveragePercent = defaults.memoryAveragePercent;
    	      this.memoryMaxPercent = defaults.memoryMaxPercent;
    	      this.networkThroughputAverageKbps = defaults.networkThroughputAverageKbps;
    	      this.networkThroughputMaxKbps = defaults.networkThroughputMaxKbps;
        }

        public Builder setCpuAveragePercent(Integer cpuAveragePercent) {
            this.cpuAveragePercent = Objects.requireNonNull(cpuAveragePercent);
            return this;
        }

        public Builder setCpuMaxPercent(Integer cpuMaxPercent) {
            this.cpuMaxPercent = Objects.requireNonNull(cpuMaxPercent);
            return this;
        }

        public Builder setDiskIoRateAverageKbps(String diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = Objects.requireNonNull(diskIoRateAverageKbps);
            return this;
        }

        public Builder setDiskIoRateMaxKbps(String diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = Objects.requireNonNull(diskIoRateMaxKbps);
            return this;
        }

        public Builder setMemoryAveragePercent(Integer memoryAveragePercent) {
            this.memoryAveragePercent = Objects.requireNonNull(memoryAveragePercent);
            return this;
        }

        public Builder setMemoryMaxPercent(Integer memoryMaxPercent) {
            this.memoryMaxPercent = Objects.requireNonNull(memoryMaxPercent);
            return this;
        }

        public Builder setNetworkThroughputAverageKbps(String networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = Objects.requireNonNull(networkThroughputAverageKbps);
            return this;
        }

        public Builder setNetworkThroughputMaxKbps(String networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = Objects.requireNonNull(networkThroughputMaxKbps);
            return this;
        }

        public VmUtilizationMetricsResponse build() {
            return new VmUtilizationMetricsResponse(cpuAveragePercent, cpuMaxPercent, diskIoRateAverageKbps, diskIoRateMaxKbps, memoryAveragePercent, memoryMaxPercent, networkThroughputAverageKbps, networkThroughputMaxKbps);
        }
    }
}

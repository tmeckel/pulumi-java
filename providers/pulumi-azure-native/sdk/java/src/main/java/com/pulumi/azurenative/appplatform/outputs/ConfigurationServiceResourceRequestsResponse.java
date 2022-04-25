// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConfigurationServiceResourceRequestsResponse {
    /**
     * @return Cpu allocated to each Application Configuration Service instance
     * 
     */
    private final String cpu;
    /**
     * @return Instance count of the Application Configuration Service
     * 
     */
    private final Integer instanceCount;
    /**
     * @return Memory allocated to each Application Configuration Service instance
     * 
     */
    private final String memory;

    @CustomType.Constructor
    private ConfigurationServiceResourceRequestsResponse(
        @CustomType.Parameter("cpu") String cpu,
        @CustomType.Parameter("instanceCount") Integer instanceCount,
        @CustomType.Parameter("memory") String memory) {
        this.cpu = cpu;
        this.instanceCount = instanceCount;
        this.memory = memory;
    }

    /**
     * @return Cpu allocated to each Application Configuration Service instance
     * 
     */
    public String cpu() {
        return this.cpu;
    }
    /**
     * @return Instance count of the Application Configuration Service
     * 
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }
    /**
     * @return Memory allocated to each Application Configuration Service instance
     * 
     */
    public String memory() {
        return this.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpu;
        private Integer instanceCount;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceCount = defaults.instanceCount;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(String cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }
        public Builder memory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }        public ConfigurationServiceResourceRequestsResponse build() {
            return new ConfigurationServiceResourceRequestsResponse(cpu, instanceCount, memory);
        }
    }
}

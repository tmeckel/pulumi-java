// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AcceleratorConfigResponse {
    /**
     * @return Count of cores of this accelerator.
     * 
     */
    private final String coreCount;
    /**
     * @return Type of this accelerator.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AcceleratorConfigResponse(
        @CustomType.Parameter("coreCount") String coreCount,
        @CustomType.Parameter("type") String type) {
        this.coreCount = coreCount;
        this.type = type;
    }

    /**
     * @return Count of cores of this accelerator.
     * 
     */
    public String coreCount() {
        return this.coreCount;
    }
    /**
     * @return Type of this accelerator.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coreCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(String coreCount) {
            this.coreCount = Objects.requireNonNull(coreCount);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AcceleratorConfigResponse build() {
            return new AcceleratorConfigResponse(coreCount, type);
        }
    }
}

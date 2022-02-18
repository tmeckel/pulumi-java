// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceLimitResponse {
    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    private final String maximum;
    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    private final String minimum;
    /**
     * Resource name "cpu", "memory" or gpu-specific string.
     * 
     */
    private final String resourceType;

    @OutputCustomType.Constructor({"maximum","minimum","resourceType"})
    private ResourceLimitResponse(
        String maximum,
        String minimum,
        String resourceType) {
        this.maximum = Objects.requireNonNull(maximum);
        this.minimum = Objects.requireNonNull(minimum);
        this.resourceType = Objects.requireNonNull(resourceType);
    }

    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    public String getMaximum() {
        return this.maximum;
    }
    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    public String getMinimum() {
        return this.minimum;
    }
    /**
     * Resource name "cpu", "memory" or gpu-specific string.
     * 
     */
    public String getPropResourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maximum;
        private String minimum;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setMaximum(String maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }

        public Builder setMinimum(String minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public ResourceLimitResponse build() {
            return new ResourceLimitResponse(maximum, minimum, resourceType);
        }
    }
}

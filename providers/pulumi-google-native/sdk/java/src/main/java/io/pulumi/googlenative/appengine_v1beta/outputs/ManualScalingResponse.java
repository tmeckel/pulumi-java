// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ManualScalingResponse {
    /**
     * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
     * 
     */
    private final Integer instances;

    @OutputCustomType.Constructor({"instances"})
    private ManualScalingResponse(Integer instances) {
        this.instances = Objects.requireNonNull(instances);
    }

    /**
     * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
     * 
     */
    public Integer getInstances() {
        return this.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instances;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
        }

        public Builder setInstances(Integer instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public ManualScalingResponse build() {
            return new ManualScalingResponse(instances);
        }
    }
}

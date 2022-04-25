// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
 * 
 */
public final class ManualScalingResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManualScalingResponse Empty = new ManualScalingResponse();

    /**
     * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
     * 
     */
    @Import(name="instances", required=true)
    private Integer instances;

    /**
     * @return Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
     * 
     */
    public Integer instances() {
        return this.instances;
    }

    private ManualScalingResponse() {}

    private ManualScalingResponse(ManualScalingResponse $) {
        this.instances = $.instances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManualScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManualScalingResponse $;

        public Builder() {
            $ = new ManualScalingResponse();
        }

        public Builder(ManualScalingResponse defaults) {
            $ = new ManualScalingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param instances Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
         * 
         * @return builder
         * 
         */
        public Builder instances(Integer instances) {
            $.instances = instances;
            return this;
        }

        public ManualScalingResponse build() {
            $.instances = Objects.requireNonNull($.instances, "expected parameter 'instances' to be non-null");
            return $;
        }
    }

}

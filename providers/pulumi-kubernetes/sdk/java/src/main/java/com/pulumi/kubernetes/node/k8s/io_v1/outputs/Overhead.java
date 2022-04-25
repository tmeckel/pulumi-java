// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class Overhead {
    /**
     * @return PodFixed represents the fixed resource overhead associated with running a pod.
     * 
     */
    private final @Nullable Map<String,String> podFixed;

    @CustomType.Constructor
    private Overhead(@CustomType.Parameter("podFixed") @Nullable Map<String,String> podFixed) {
        this.podFixed = podFixed;
    }

    /**
     * @return PodFixed represents the fixed resource overhead associated with running a pod.
     * 
     */
    public Map<String,String> podFixed() {
        return this.podFixed == null ? Map.of() : this.podFixed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Overhead defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> podFixed;

        public Builder() {
    	      // Empty
        }

        public Builder(Overhead defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podFixed = defaults.podFixed;
        }

        public Builder podFixed(@Nullable Map<String,String> podFixed) {
            this.podFixed = podFixed;
            return this;
        }        public Overhead build() {
            return new Overhead(podFixed);
        }
    }
}

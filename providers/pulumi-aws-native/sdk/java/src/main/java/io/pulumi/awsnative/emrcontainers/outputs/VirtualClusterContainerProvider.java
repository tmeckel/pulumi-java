// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers.outputs;

import io.pulumi.awsnative.emrcontainers.outputs.VirtualClusterContainerInfo;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualClusterContainerProvider {
    /**
     * The ID of the container cluster
     * 
     */
    private final String id;
    private final VirtualClusterContainerInfo info;
    /**
     * The type of the container provider
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private VirtualClusterContainerProvider(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("info") VirtualClusterContainerInfo info,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.info = info;
        this.type = type;
    }

    /**
     * The ID of the container cluster
     * 
    */
    public String getId() {
        return this.id;
    }
    public VirtualClusterContainerInfo getInfo() {
        return this.info;
    }
    /**
     * The type of the container provider
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private VirtualClusterContainerInfo info;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterContainerProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.info = defaults.info;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder info(VirtualClusterContainerInfo info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VirtualClusterContainerProvider build() {
            return new VirtualClusterContainerProvider(id, info, type);
        }
    }
}

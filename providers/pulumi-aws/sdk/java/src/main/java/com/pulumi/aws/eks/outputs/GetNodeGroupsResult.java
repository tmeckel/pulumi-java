// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNodeGroupsResult {
    private final String clusterName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A set of all node group names in an EKS Cluster.
     * 
     */
    private final List<String> names;

    @CustomType.Constructor
    private GetNodeGroupsResult(
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("names") List<String> names) {
        this.clusterName = clusterName;
        this.id = id;
        this.names = names;
    }

    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A set of all node group names in an EKS Cluster.
     * 
     */
    public List<String> names() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String id;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public GetNodeGroupsResult build() {
            return new GetNodeGroupsResult(clusterName, id, names);
        }
    }
}

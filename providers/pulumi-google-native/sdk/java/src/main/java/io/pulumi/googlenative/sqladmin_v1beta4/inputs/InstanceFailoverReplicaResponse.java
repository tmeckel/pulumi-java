// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The name and status of the failover replica.
 * 
 */
public final class InstanceFailoverReplicaResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceFailoverReplicaResponse Empty = new InstanceFailoverReplicaResponse();

    /**
     * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
     * 
     */
    @InputImport(name="available", required=true)
    private final Boolean available;

    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn't include the project ID.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public InstanceFailoverReplicaResponse(
        Boolean available,
        String name) {
        this.available = Objects.requireNonNull(available, "expected parameter 'available' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private InstanceFailoverReplicaResponse() {
        this.available = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFailoverReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean available;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFailoverReplicaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.name = defaults.name;
        }

        public Builder setAvailable(Boolean available) {
            this.available = Objects.requireNonNull(available);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public InstanceFailoverReplicaResponse build() {
            return new InstanceFailoverReplicaResponse(available, name);
        }
    }
}

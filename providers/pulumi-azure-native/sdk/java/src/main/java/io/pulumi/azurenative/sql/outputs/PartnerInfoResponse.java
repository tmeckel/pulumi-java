// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PartnerInfoResponse {
    /**
     * Resource identifier of the partner server.
     * 
     */
    private final String id;
    /**
     * Geo location of the partner server.
     * 
     */
    private final String location;
    /**
     * Replication role of the partner server.
     * 
     */
    private final String replicationRole;

    @OutputCustomType.Constructor
    private PartnerInfoResponse(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("replicationRole") String replicationRole) {
        this.id = id;
        this.location = location;
        this.replicationRole = replicationRole;
    }

    /**
     * Resource identifier of the partner server.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Geo location of the partner server.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Replication role of the partner server.
     * 
    */
    public String getReplicationRole() {
        return this.replicationRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String replicationRole;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.replicationRole = defaults.replicationRole;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder replicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }
        public PartnerInfoResponse build() {
            return new PartnerInfoResponse(id, location, replicationRole);
        }
    }
}

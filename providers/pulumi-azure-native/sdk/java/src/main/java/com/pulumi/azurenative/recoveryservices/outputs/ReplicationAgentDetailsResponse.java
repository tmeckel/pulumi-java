// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReplicationAgentDetailsResponse {
    /**
     * @return The health of the replication agent.
     * 
     */
    private final String health;
    /**
     * @return The health errors.
     * 
     */
    private final List<HealthErrorResponse> healthErrors;
    /**
     * @return The replication agent Id.
     * 
     */
    private final String id;
    /**
     * @return The last heartbeat received from the replication agent.
     * 
     */
    private final String lastHeartbeatUtc;
    /**
     * @return The replication agent name.
     * 
     */
    private final String name;
    /**
     * @return The replication agent version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private ReplicationAgentDetailsResponse(
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("healthErrors") List<HealthErrorResponse> healthErrors,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastHeartbeatUtc") String lastHeartbeatUtc,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("version") String version) {
        this.health = health;
        this.healthErrors = healthErrors;
        this.id = id;
        this.lastHeartbeatUtc = lastHeartbeatUtc;
        this.name = name;
        this.version = version;
    }

    /**
     * @return The health of the replication agent.
     * 
     */
    public String health() {
        return this.health;
    }
    /**
     * @return The health errors.
     * 
     */
    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors;
    }
    /**
     * @return The replication agent Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The last heartbeat received from the replication agent.
     * 
     */
    public String lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    /**
     * @return The replication agent name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The replication agent version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationAgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String id;
        private String lastHeartbeatUtc;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationAgentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ReplicationAgentDetailsResponse build() {
            return new ReplicationAgentDetailsResponse(health, healthErrors, id, lastHeartbeatUtc, name, version);
        }
    }
}

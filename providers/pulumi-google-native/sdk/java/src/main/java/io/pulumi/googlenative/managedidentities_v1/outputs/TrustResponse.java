// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TrustResponse {
    /**
     * The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * The last heartbeat time when the trust was known to be connected.
     * 
     */
    private final String lastTrustHeartbeatTime;
    /**
     * Optional. The trust authentication type, which decides whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    private final Boolean selectiveAuthentication;
    /**
     * The current state of the trust.
     * 
     */
    private final String state;
    /**
     * Additional information about the current state of the trust, if available.
     * 
     */
    private final String stateDescription;
    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    private final List<String> targetDnsIpAddresses;
    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    private final String targetDomainName;
    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * 
     */
    private final String trustDirection;
    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * 
     */
    private final String trustHandshakeSecret;
    /**
     * The type of trust represented by the trust resource.
     * 
     */
    private final String trustType;
    /**
     * The last update time.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private TrustResponse(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("lastTrustHeartbeatTime") String lastTrustHeartbeatTime,
        @OutputCustomType.Parameter("selectiveAuthentication") Boolean selectiveAuthentication,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("stateDescription") String stateDescription,
        @OutputCustomType.Parameter("targetDnsIpAddresses") List<String> targetDnsIpAddresses,
        @OutputCustomType.Parameter("targetDomainName") String targetDomainName,
        @OutputCustomType.Parameter("trustDirection") String trustDirection,
        @OutputCustomType.Parameter("trustHandshakeSecret") String trustHandshakeSecret,
        @OutputCustomType.Parameter("trustType") String trustType,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.lastTrustHeartbeatTime = lastTrustHeartbeatTime;
        this.selectiveAuthentication = selectiveAuthentication;
        this.state = state;
        this.stateDescription = stateDescription;
        this.targetDnsIpAddresses = targetDnsIpAddresses;
        this.targetDomainName = targetDomainName;
        this.trustDirection = trustDirection;
        this.trustHandshakeSecret = trustHandshakeSecret;
        this.trustType = trustType;
        this.updateTime = updateTime;
    }

    /**
     * The time the instance was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The last heartbeat time when the trust was known to be connected.
     * 
    */
    public String getLastTrustHeartbeatTime() {
        return this.lastTrustHeartbeatTime;
    }
    /**
     * Optional. The trust authentication type, which decides whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
    */
    public Boolean getSelectiveAuthentication() {
        return this.selectiveAuthentication;
    }
    /**
     * The current state of the trust.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Additional information about the current state of the trust, if available.
     * 
    */
    public String getStateDescription() {
        return this.stateDescription;
    }
    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
    */
    public List<String> getTargetDnsIpAddresses() {
        return this.targetDnsIpAddresses;
    }
    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
    */
    public String getTargetDomainName() {
        return this.targetDomainName;
    }
    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * 
    */
    public String getTrustDirection() {
        return this.trustDirection;
    }
    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * 
    */
    public String getTrustHandshakeSecret() {
        return this.trustHandshakeSecret;
    }
    /**
     * The type of trust represented by the trust resource.
     * 
    */
    public String getTrustType() {
        return this.trustType;
    }
    /**
     * The last update time.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String lastTrustHeartbeatTime;
        private Boolean selectiveAuthentication;
        private String state;
        private String stateDescription;
        private List<String> targetDnsIpAddresses;
        private String targetDomainName;
        private String trustDirection;
        private String trustHandshakeSecret;
        private String trustType;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.lastTrustHeartbeatTime = defaults.lastTrustHeartbeatTime;
    	      this.selectiveAuthentication = defaults.selectiveAuthentication;
    	      this.state = defaults.state;
    	      this.stateDescription = defaults.stateDescription;
    	      this.targetDnsIpAddresses = defaults.targetDnsIpAddresses;
    	      this.targetDomainName = defaults.targetDomainName;
    	      this.trustDirection = defaults.trustDirection;
    	      this.trustHandshakeSecret = defaults.trustHandshakeSecret;
    	      this.trustType = defaults.trustType;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder lastTrustHeartbeatTime(String lastTrustHeartbeatTime) {
            this.lastTrustHeartbeatTime = Objects.requireNonNull(lastTrustHeartbeatTime);
            return this;
        }

        public Builder selectiveAuthentication(Boolean selectiveAuthentication) {
            this.selectiveAuthentication = Objects.requireNonNull(selectiveAuthentication);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder stateDescription(String stateDescription) {
            this.stateDescription = Objects.requireNonNull(stateDescription);
            return this;
        }

        public Builder targetDnsIpAddresses(List<String> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = Objects.requireNonNull(targetDnsIpAddresses);
            return this;
        }

        public Builder targetDomainName(String targetDomainName) {
            this.targetDomainName = Objects.requireNonNull(targetDomainName);
            return this;
        }

        public Builder trustDirection(String trustDirection) {
            this.trustDirection = Objects.requireNonNull(trustDirection);
            return this;
        }

        public Builder trustHandshakeSecret(String trustHandshakeSecret) {
            this.trustHandshakeSecret = Objects.requireNonNull(trustHandshakeSecret);
            return this;
        }

        public Builder trustType(String trustType) {
            this.trustType = Objects.requireNonNull(trustType);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public TrustResponse build() {
            return new TrustResponse(createTime, lastTrustHeartbeatTime, selectiveAuthentication, state, stateDescription, targetDnsIpAddresses, targetDomainName, trustDirection, trustHandshakeSecret, trustType, updateTime);
        }
    }
}

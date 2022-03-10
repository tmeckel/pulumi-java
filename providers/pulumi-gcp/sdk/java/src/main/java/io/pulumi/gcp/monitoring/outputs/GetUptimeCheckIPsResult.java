// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.GetUptimeCheckIPsUptimeCheckIp;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetUptimeCheckIPsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of uptime check IPs used by Stackdriver Monitoring. Each `uptime_check_ip` contains:
     * 
     */
    private final List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps;

    @OutputCustomType.Constructor
    private GetUptimeCheckIPsResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("uptimeCheckIps") List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps) {
        this.id = id;
        this.uptimeCheckIps = uptimeCheckIps;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A list of uptime check IPs used by Stackdriver Monitoring. Each `uptime_check_ip` contains:
     * 
    */
    public List<GetUptimeCheckIPsUptimeCheckIp> getUptimeCheckIps() {
        return this.uptimeCheckIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUptimeCheckIPsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUptimeCheckIPsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.uptimeCheckIps = defaults.uptimeCheckIps;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder uptimeCheckIps(List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps) {
            this.uptimeCheckIps = Objects.requireNonNull(uptimeCheckIps);
            return this;
        }
        public GetUptimeCheckIPsResult build() {
            return new GetUptimeCheckIPsResult(id, uptimeCheckIps);
        }
    }
}

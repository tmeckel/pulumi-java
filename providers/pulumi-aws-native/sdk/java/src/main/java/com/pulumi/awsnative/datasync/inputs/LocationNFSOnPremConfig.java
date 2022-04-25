// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Contains a list of Amazon Resource Names (ARNs) of agents that are used to connect an NFS server.
 * 
 */
public final class LocationNFSOnPremConfig extends com.pulumi.resources.InvokeArgs {

    public static final LocationNFSOnPremConfig Empty = new LocationNFSOnPremConfig();

    /**
     * ARN(s) of the agent(s) to use for an NFS location.
     * 
     */
    @Import(name="agentArns", required=true)
    private List<String> agentArns;

    /**
     * @return ARN(s) of the agent(s) to use for an NFS location.
     * 
     */
    public List<String> agentArns() {
        return this.agentArns;
    }

    private LocationNFSOnPremConfig() {}

    private LocationNFSOnPremConfig(LocationNFSOnPremConfig $) {
        this.agentArns = $.agentArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationNFSOnPremConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationNFSOnPremConfig $;

        public Builder() {
            $ = new LocationNFSOnPremConfig();
        }

        public Builder(LocationNFSOnPremConfig defaults) {
            $ = new LocationNFSOnPremConfig(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentArns ARN(s) of the agent(s) to use for an NFS location.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(List<String> agentArns) {
            $.agentArns = agentArns;
            return this;
        }

        /**
         * @param agentArns ARN(s) of the agent(s) to use for an NFS location.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }

        public LocationNFSOnPremConfig build() {
            $.agentArns = Objects.requireNonNull($.agentArns, "expected parameter 'agentArns' to be non-null");
            return $;
        }
    }

}

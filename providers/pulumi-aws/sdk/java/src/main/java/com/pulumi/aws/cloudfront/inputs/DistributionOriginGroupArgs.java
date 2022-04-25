// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupFailoverCriteriaArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupMemberArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupArgs Empty = new DistributionOriginGroupArgs();

    /**
     * The failover criteria for when to failover to the secondary origin
     * 
     */
    @Import(name="failoverCriteria", required=true)
    private Output<DistributionOriginGroupFailoverCriteriaArgs> failoverCriteria;

    /**
     * @return The failover criteria for when to failover to the secondary origin
     * 
     */
    public Output<DistributionOriginGroupFailoverCriteriaArgs> failoverCriteria() {
        return this.failoverCriteria;
    }

    /**
     * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    @Import(name="members", required=true)
    private Output<List<DistributionOriginGroupMemberArgs>> members;

    /**
     * @return Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    public Output<List<DistributionOriginGroupMemberArgs>> members() {
        return this.members;
    }

    /**
     * The unique identifier of the member origin
     * 
     */
    @Import(name="originId", required=true)
    private Output<String> originId;

    /**
     * @return The unique identifier of the member origin
     * 
     */
    public Output<String> originId() {
        return this.originId;
    }

    private DistributionOriginGroupArgs() {}

    private DistributionOriginGroupArgs(DistributionOriginGroupArgs $) {
        this.failoverCriteria = $.failoverCriteria;
        this.members = $.members;
        this.originId = $.originId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroupArgs $;

        public Builder() {
            $ = new DistributionOriginGroupArgs();
        }

        public Builder(DistributionOriginGroupArgs defaults) {
            $ = new DistributionOriginGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverCriteria The failover criteria for when to failover to the secondary origin
         * 
         * @return builder
         * 
         */
        public Builder failoverCriteria(Output<DistributionOriginGroupFailoverCriteriaArgs> failoverCriteria) {
            $.failoverCriteria = failoverCriteria;
            return this;
        }

        /**
         * @param failoverCriteria The failover criteria for when to failover to the secondary origin
         * 
         * @return builder
         * 
         */
        public Builder failoverCriteria(DistributionOriginGroupFailoverCriteriaArgs failoverCriteria) {
            return failoverCriteria(Output.of(failoverCriteria));
        }

        /**
         * @param members Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
         * 
         * @return builder
         * 
         */
        public Builder members(Output<List<DistributionOriginGroupMemberArgs>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
         * 
         * @return builder
         * 
         */
        public Builder members(List<DistributionOriginGroupMemberArgs> members) {
            return members(Output.of(members));
        }

        /**
         * @param members Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
         * 
         * @return builder
         * 
         */
        public Builder members(DistributionOriginGroupMemberArgs... members) {
            return members(List.of(members));
        }

        /**
         * @param originId The unique identifier of the member origin
         * 
         * @return builder
         * 
         */
        public Builder originId(Output<String> originId) {
            $.originId = originId;
            return this;
        }

        /**
         * @param originId The unique identifier of the member origin
         * 
         * @return builder
         * 
         */
        public Builder originId(String originId) {
            return originId(Output.of(originId));
        }

        public DistributionOriginGroupArgs build() {
            $.failoverCriteria = Objects.requireNonNull($.failoverCriteria, "expected parameter 'failoverCriteria' to be non-null");
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.originId = Objects.requireNonNull($.originId, "expected parameter 'originId' to be non-null");
            return $;
        }
    }

}

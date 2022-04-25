// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.LimitResponseArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
 *  * How are requests for this priority level limited?
 *  * What should be done with requests that exceed the limit?
 * 
 */
public final class LimitedPriorityLevelConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LimitedPriorityLevelConfigurationArgs Empty = new LimitedPriorityLevelConfigurationArgs();

    /**
     * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    @Import(name="assuredConcurrencyShares")
    private @Nullable Output<Integer> assuredConcurrencyShares;

    /**
     * @return `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    public Optional<Output<Integer>> assuredConcurrencyShares() {
        return Optional.ofNullable(this.assuredConcurrencyShares);
    }

    /**
     * `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    @Import(name="limitResponse")
    private @Nullable Output<LimitResponseArgs> limitResponse;

    /**
     * @return `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    public Optional<Output<LimitResponseArgs>> limitResponse() {
        return Optional.ofNullable(this.limitResponse);
    }

    private LimitedPriorityLevelConfigurationArgs() {}

    private LimitedPriorityLevelConfigurationArgs(LimitedPriorityLevelConfigurationArgs $) {
        this.assuredConcurrencyShares = $.assuredConcurrencyShares;
        this.limitResponse = $.limitResponse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LimitedPriorityLevelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LimitedPriorityLevelConfigurationArgs $;

        public Builder() {
            $ = new LimitedPriorityLevelConfigurationArgs();
        }

        public Builder(LimitedPriorityLevelConfigurationArgs defaults) {
            $ = new LimitedPriorityLevelConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assuredConcurrencyShares `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
         * 
         *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
         * 
         * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
         * 
         * @return builder
         * 
         */
        public Builder assuredConcurrencyShares(@Nullable Output<Integer> assuredConcurrencyShares) {
            $.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }

        /**
         * @param assuredConcurrencyShares `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
         * 
         *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
         * 
         * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
         * 
         * @return builder
         * 
         */
        public Builder assuredConcurrencyShares(Integer assuredConcurrencyShares) {
            return assuredConcurrencyShares(Output.of(assuredConcurrencyShares));
        }

        /**
         * @param limitResponse `limitResponse` indicates what to do with requests that can not be executed right now
         * 
         * @return builder
         * 
         */
        public Builder limitResponse(@Nullable Output<LimitResponseArgs> limitResponse) {
            $.limitResponse = limitResponse;
            return this;
        }

        /**
         * @param limitResponse `limitResponse` indicates what to do with requests that can not be executed right now
         * 
         * @return builder
         * 
         */
        public Builder limitResponse(LimitResponseArgs limitResponse) {
            return limitResponse(Output.of(limitResponse));
        }

        public LimitedPriorityLevelConfigurationArgs build() {
            return $;
        }
    }

}

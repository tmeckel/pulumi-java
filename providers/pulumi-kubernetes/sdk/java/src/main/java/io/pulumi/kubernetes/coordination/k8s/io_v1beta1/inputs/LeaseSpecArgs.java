// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.coordination.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LeaseSpec is a specification of a Lease.
 * 
 */
public final class LeaseSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final LeaseSpecArgs Empty = new LeaseSpecArgs();

    /**
     * acquireTime is a time when the current lease was acquired.
     * 
     */
    @Import(name="acquireTime")
      private final @Nullable Output<String> acquireTime;

    public Output<String> getAcquireTime() {
        return this.acquireTime == null ? Codegen.empty() : this.acquireTime;
    }

    /**
     * holderIdentity contains the identity of the holder of a current lease.
     * 
     */
    @Import(name="holderIdentity")
      private final @Nullable Output<String> holderIdentity;

    public Output<String> getHolderIdentity() {
        return this.holderIdentity == null ? Codegen.empty() : this.holderIdentity;
    }

    /**
     * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
     * 
     */
    @Import(name="leaseDurationSeconds")
      private final @Nullable Output<Integer> leaseDurationSeconds;

    public Output<Integer> getLeaseDurationSeconds() {
        return this.leaseDurationSeconds == null ? Codegen.empty() : this.leaseDurationSeconds;
    }

    /**
     * leaseTransitions is the number of transitions of a lease between holders.
     * 
     */
    @Import(name="leaseTransitions")
      private final @Nullable Output<Integer> leaseTransitions;

    public Output<Integer> getLeaseTransitions() {
        return this.leaseTransitions == null ? Codegen.empty() : this.leaseTransitions;
    }

    /**
     * renewTime is a time when the current holder of a lease has last updated the lease.
     * 
     */
    @Import(name="renewTime")
      private final @Nullable Output<String> renewTime;

    public Output<String> getRenewTime() {
        return this.renewTime == null ? Codegen.empty() : this.renewTime;
    }

    public LeaseSpecArgs(
        @Nullable Output<String> acquireTime,
        @Nullable Output<String> holderIdentity,
        @Nullable Output<Integer> leaseDurationSeconds,
        @Nullable Output<Integer> leaseTransitions,
        @Nullable Output<String> renewTime) {
        this.acquireTime = acquireTime;
        this.holderIdentity = holderIdentity;
        this.leaseDurationSeconds = leaseDurationSeconds;
        this.leaseTransitions = leaseTransitions;
        this.renewTime = renewTime;
    }

    private LeaseSpecArgs() {
        this.acquireTime = Codegen.empty();
        this.holderIdentity = Codegen.empty();
        this.leaseDurationSeconds = Codegen.empty();
        this.leaseTransitions = Codegen.empty();
        this.renewTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LeaseSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acquireTime;
        private @Nullable Output<String> holderIdentity;
        private @Nullable Output<Integer> leaseDurationSeconds;
        private @Nullable Output<Integer> leaseTransitions;
        private @Nullable Output<String> renewTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LeaseSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acquireTime = defaults.acquireTime;
    	      this.holderIdentity = defaults.holderIdentity;
    	      this.leaseDurationSeconds = defaults.leaseDurationSeconds;
    	      this.leaseTransitions = defaults.leaseTransitions;
    	      this.renewTime = defaults.renewTime;
        }

        public Builder acquireTime(@Nullable Output<String> acquireTime) {
            this.acquireTime = acquireTime;
            return this;
        }
        public Builder acquireTime(@Nullable String acquireTime) {
            this.acquireTime = Codegen.ofNullable(acquireTime);
            return this;
        }
        public Builder holderIdentity(@Nullable Output<String> holderIdentity) {
            this.holderIdentity = holderIdentity;
            return this;
        }
        public Builder holderIdentity(@Nullable String holderIdentity) {
            this.holderIdentity = Codegen.ofNullable(holderIdentity);
            return this;
        }
        public Builder leaseDurationSeconds(@Nullable Output<Integer> leaseDurationSeconds) {
            this.leaseDurationSeconds = leaseDurationSeconds;
            return this;
        }
        public Builder leaseDurationSeconds(@Nullable Integer leaseDurationSeconds) {
            this.leaseDurationSeconds = Codegen.ofNullable(leaseDurationSeconds);
            return this;
        }
        public Builder leaseTransitions(@Nullable Output<Integer> leaseTransitions) {
            this.leaseTransitions = leaseTransitions;
            return this;
        }
        public Builder leaseTransitions(@Nullable Integer leaseTransitions) {
            this.leaseTransitions = Codegen.ofNullable(leaseTransitions);
            return this;
        }
        public Builder renewTime(@Nullable Output<String> renewTime) {
            this.renewTime = renewTime;
            return this;
        }
        public Builder renewTime(@Nullable String renewTime) {
            this.renewTime = Codegen.ofNullable(renewTime);
            return this;
        }        public LeaseSpecArgs build() {
            return new LeaseSpecArgs(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
        }
    }
}

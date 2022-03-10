// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodDisruptionBudgetSpec {
    /**
     * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * 
     */
    private final @Nullable Either<Integer,String> maxUnavailable;
    /**
     * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
     * 
     */
    private final @Nullable Either<Integer,String> minAvailable;
    /**
     * Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an empty ({}) selector will select all pods within the namespace.
     * 
     */
    private final @Nullable LabelSelector selector;

    @OutputCustomType.Constructor
    private PodDisruptionBudgetSpec(
        @OutputCustomType.Parameter("maxUnavailable") @Nullable Either<Integer,String> maxUnavailable,
        @OutputCustomType.Parameter("minAvailable") @Nullable Either<Integer,String> minAvailable,
        @OutputCustomType.Parameter("selector") @Nullable LabelSelector selector) {
        this.maxUnavailable = maxUnavailable;
        this.minAvailable = minAvailable;
        this.selector = selector;
    }

    /**
     * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * 
    */
    public Optional<Either<Integer,String>> getMaxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }
    /**
     * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
     * 
    */
    public Optional<Either<Integer,String>> getMinAvailable() {
        return Optional.ofNullable(this.minAvailable);
    }
    /**
     * Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an empty ({}) selector will select all pods within the namespace.
     * 
    */
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDisruptionBudgetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<Integer,String> maxUnavailable;
        private @Nullable Either<Integer,String> minAvailable;
        private @Nullable LabelSelector selector;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDisruptionBudgetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.minAvailable = defaults.minAvailable;
    	      this.selector = defaults.selector;
        }

        public Builder maxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        public Builder minAvailable(@Nullable Either<Integer,String> minAvailable) {
            this.minAvailable = minAvailable;
            return this;
        }

        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        public PodDisruptionBudgetSpec build() {
            return new PodDisruptionBudgetSpec(maxUnavailable, minAvailable, selector);
        }
    }
}

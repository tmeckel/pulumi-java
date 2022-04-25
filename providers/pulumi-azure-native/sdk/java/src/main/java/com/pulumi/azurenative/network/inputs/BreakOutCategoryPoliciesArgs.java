// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Virtual Appliance Sku Properties.
 * 
 */
public final class BreakOutCategoryPoliciesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BreakOutCategoryPoliciesArgs Empty = new BreakOutCategoryPoliciesArgs();

    /**
     * Flag to control breakout of o365 allow category.
     * 
     */
    @Import(name="allow")
    private @Nullable Output<Boolean> allow;

    /**
     * @return Flag to control breakout of o365 allow category.
     * 
     */
    public Optional<Output<Boolean>> allow() {
        return Optional.ofNullable(this.allow);
    }

    /**
     * Flag to control breakout of o365 default category.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Flag to control breakout of o365 default category.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * Flag to control breakout of o365 optimize category.
     * 
     */
    @Import(name="optimize")
    private @Nullable Output<Boolean> optimize;

    /**
     * @return Flag to control breakout of o365 optimize category.
     * 
     */
    public Optional<Output<Boolean>> optimize() {
        return Optional.ofNullable(this.optimize);
    }

    private BreakOutCategoryPoliciesArgs() {}

    private BreakOutCategoryPoliciesArgs(BreakOutCategoryPoliciesArgs $) {
        this.allow = $.allow;
        this.default_ = $.default_;
        this.optimize = $.optimize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BreakOutCategoryPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BreakOutCategoryPoliciesArgs $;

        public Builder() {
            $ = new BreakOutCategoryPoliciesArgs();
        }

        public Builder(BreakOutCategoryPoliciesArgs defaults) {
            $ = new BreakOutCategoryPoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allow Flag to control breakout of o365 allow category.
         * 
         * @return builder
         * 
         */
        public Builder allow(@Nullable Output<Boolean> allow) {
            $.allow = allow;
            return this;
        }

        /**
         * @param allow Flag to control breakout of o365 allow category.
         * 
         * @return builder
         * 
         */
        public Builder allow(Boolean allow) {
            return allow(Output.of(allow));
        }

        /**
         * @param default_ Flag to control breakout of o365 default category.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Flag to control breakout of o365 default category.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param optimize Flag to control breakout of o365 optimize category.
         * 
         * @return builder
         * 
         */
        public Builder optimize(@Nullable Output<Boolean> optimize) {
            $.optimize = optimize;
            return this;
        }

        /**
         * @param optimize Flag to control breakout of o365 optimize category.
         * 
         * @return builder
         * 
         */
        public Builder optimize(Boolean optimize) {
            return optimize(Output.of(optimize));
        }

        public BreakOutCategoryPoliciesArgs build() {
            return $;
        }
    }

}

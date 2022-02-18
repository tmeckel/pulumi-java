// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.ConditionIam;
import io.pulumi.googlenative.compute_beta.enums.ConditionOp;
import io.pulumi.googlenative.compute_beta.enums.ConditionSys;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class ConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="iam")
    private final @Nullable Input<ConditionIam> iam;

    public Input<ConditionIam> getIam() {
        return this.iam == null ? Input.empty() : this.iam;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="op")
    private final @Nullable Input<ConditionOp> op;

    public Input<ConditionOp> getOp() {
        return this.op == null ? Input.empty() : this.op;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="svc")
    private final @Nullable Input<String> svc;

    public Input<String> getSvc() {
        return this.svc == null ? Input.empty() : this.svc;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="sys")
    private final @Nullable Input<ConditionSys> sys;

    public Input<ConditionSys> getSys() {
        return this.sys == null ? Input.empty() : this.sys;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ConditionArgs(
        @Nullable Input<ConditionIam> iam,
        @Nullable Input<ConditionOp> op,
        @Nullable Input<String> svc,
        @Nullable Input<ConditionSys> sys,
        @Nullable Input<List<String>> values) {
        this.iam = iam;
        this.op = op;
        this.svc = svc;
        this.sys = sys;
        this.values = values;
    }

    private ConditionArgs() {
        this.iam = Input.empty();
        this.op = Input.empty();
        this.svc = Input.empty();
        this.sys = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConditionIam> iam;
        private @Nullable Input<ConditionOp> op;
        private @Nullable Input<String> svc;
        private @Nullable Input<ConditionSys> sys;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder setIam(@Nullable Input<ConditionIam> iam) {
            this.iam = iam;
            return this;
        }

        public Builder setIam(@Nullable ConditionIam iam) {
            this.iam = Input.ofNullable(iam);
            return this;
        }

        public Builder setOp(@Nullable Input<ConditionOp> op) {
            this.op = op;
            return this;
        }

        public Builder setOp(@Nullable ConditionOp op) {
            this.op = Input.ofNullable(op);
            return this;
        }

        public Builder setSvc(@Nullable Input<String> svc) {
            this.svc = svc;
            return this;
        }

        public Builder setSvc(@Nullable String svc) {
            this.svc = Input.ofNullable(svc);
            return this;
        }

        public Builder setSys(@Nullable Input<ConditionSys> sys) {
            this.sys = sys;
            return this;
        }

        public Builder setSys(@Nullable ConditionSys sys) {
            this.sys = Input.ofNullable(sys);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public ConditionArgs build() {
            return new ConditionArgs(iam, op, svc, sys, values);
        }
    }
}

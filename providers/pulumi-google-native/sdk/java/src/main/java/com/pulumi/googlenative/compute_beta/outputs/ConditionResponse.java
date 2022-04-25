// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConditionResponse {
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final String iam;
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final String op;
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final String svc;
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final String sys;
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private ConditionResponse(
        @CustomType.Parameter("iam") String iam,
        @CustomType.Parameter("op") String op,
        @CustomType.Parameter("svc") String svc,
        @CustomType.Parameter("sys") String sys,
        @CustomType.Parameter("values") List<String> values) {
        this.iam = iam;
        this.op = op;
        this.svc = svc;
        this.sys = sys;
        this.values = values;
    }

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public String iam() {
        return this.iam;
    }
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public String op() {
        return this.op;
    }
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public String svc() {
        return this.svc;
    }
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public String sys() {
        return this.sys;
    }
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iam;
        private String op;
        private String svc;
        private String sys;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder iam(String iam) {
            this.iam = Objects.requireNonNull(iam);
            return this;
        }
        public Builder op(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }
        public Builder svc(String svc) {
            this.svc = Objects.requireNonNull(svc);
            return this;
        }
        public Builder sys(String sys) {
            this.sys = Objects.requireNonNull(sys);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ConditionResponse build() {
            return new ConditionResponse(iam, op, svc, sys, values);
        }
    }
}

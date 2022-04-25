// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelCustomExpr;
import java.util.Objects;

@CustomType
public final class AccessLevelCustom {
    /**
     * @return Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * 
     */
    private final AccessLevelCustomExpr expr;

    @CustomType.Constructor
    private AccessLevelCustom(@CustomType.Parameter("expr") AccessLevelCustomExpr expr) {
        this.expr = expr;
    }

    /**
     * @return Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * 
     */
    public AccessLevelCustomExpr expr() {
        return this.expr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelCustom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelCustomExpr expr;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder expr(AccessLevelCustomExpr expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }        public AccessLevelCustom build() {
            return new AccessLevelCustom(expr);
        }
    }
}

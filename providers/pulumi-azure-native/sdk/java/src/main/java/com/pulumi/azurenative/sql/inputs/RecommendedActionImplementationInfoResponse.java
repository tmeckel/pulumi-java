// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information for manual implementation for an Azure SQL Database, Server or Elastic Pool Recommended Action.
 * 
 */
public final class RecommendedActionImplementationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecommendedActionImplementationInfoResponse Empty = new RecommendedActionImplementationInfoResponse();

    /**
     * Gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell.
     * 
     */
    @Import(name="method", required=true)
    private String method;

    /**
     * @return Gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell.
     * 
     */
    public String method() {
        return this.method;
    }

    /**
     * Gets the manual implementation script. e.g., T-SQL script that could be executed on the database.
     * 
     */
    @Import(name="script", required=true)
    private String script;

    /**
     * @return Gets the manual implementation script. e.g., T-SQL script that could be executed on the database.
     * 
     */
    public String script() {
        return this.script;
    }

    private RecommendedActionImplementationInfoResponse() {}

    private RecommendedActionImplementationInfoResponse(RecommendedActionImplementationInfoResponse $) {
        this.method = $.method;
        this.script = $.script;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecommendedActionImplementationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecommendedActionImplementationInfoResponse $;

        public Builder() {
            $ = new RecommendedActionImplementationInfoResponse();
        }

        public Builder(RecommendedActionImplementationInfoResponse defaults) {
            $ = new RecommendedActionImplementationInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param method Gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            $.method = method;
            return this;
        }

        /**
         * @param script Gets the manual implementation script. e.g., T-SQL script that could be executed on the database.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            $.script = script;
            return this;
        }

        public RecommendedActionImplementationInfoResponse build() {
            $.method = Objects.requireNonNull($.method, "expected parameter 'method' to be non-null");
            $.script = Objects.requireNonNull($.script, "expected parameter 'script' to be non-null");
            return $;
        }
    }

}

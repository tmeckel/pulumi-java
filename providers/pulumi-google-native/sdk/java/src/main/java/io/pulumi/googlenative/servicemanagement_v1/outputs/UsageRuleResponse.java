// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UsageRuleResponse {
    /**
     * If true, the selected method allows unregistered calls, e.g. calls that don't identify any user or application.
     * 
     */
    private final Boolean allowUnregisteredCalls;
    /**
     * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    private final String selector;
    /**
     * If true, the selected method should skip service control and the control plane features, such as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to bypass checks for internal methods, such as service health check methods.
     * 
     */
    private final Boolean skipServiceControl;

    @OutputCustomType.Constructor
    private UsageRuleResponse(
        @OutputCustomType.Parameter("allowUnregisteredCalls") Boolean allowUnregisteredCalls,
        @OutputCustomType.Parameter("selector") String selector,
        @OutputCustomType.Parameter("skipServiceControl") Boolean skipServiceControl) {
        this.allowUnregisteredCalls = allowUnregisteredCalls;
        this.selector = selector;
        this.skipServiceControl = skipServiceControl;
    }

    /**
     * If true, the selected method allows unregistered calls, e.g. calls that don't identify any user or application.
     * 
    */
    public Boolean getAllowUnregisteredCalls() {
        return this.allowUnregisteredCalls;
    }
    /**
     * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
    */
    public String getSelector() {
        return this.selector;
    }
    /**
     * If true, the selected method should skip service control and the control plane features, such as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to bypass checks for internal methods, such as service health check methods.
     * 
    */
    public Boolean getSkipServiceControl() {
        return this.skipServiceControl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsageRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowUnregisteredCalls;
        private String selector;
        private Boolean skipServiceControl;

        public Builder() {
    	      // Empty
        }

        public Builder(UsageRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowUnregisteredCalls = defaults.allowUnregisteredCalls;
    	      this.selector = defaults.selector;
    	      this.skipServiceControl = defaults.skipServiceControl;
        }

        public Builder allowUnregisteredCalls(Boolean allowUnregisteredCalls) {
            this.allowUnregisteredCalls = Objects.requireNonNull(allowUnregisteredCalls);
            return this;
        }

        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder skipServiceControl(Boolean skipServiceControl) {
            this.skipServiceControl = Objects.requireNonNull(skipServiceControl);
            return this;
        }
        public UsageRuleResponse build() {
            return new UsageRuleResponse(allowUnregisteredCalls, selector, skipServiceControl);
        }
    }
}

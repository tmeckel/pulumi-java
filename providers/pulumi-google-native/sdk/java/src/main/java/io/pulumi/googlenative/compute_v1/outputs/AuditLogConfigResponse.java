// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AuditLogConfigResponse {
    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    private final List<String> exemptedMembers;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final Boolean ignoreChildExemptions;
    /**
     * The log type that this config enables.
     * 
     */
    private final String logType;

    @OutputCustomType.Constructor({"exemptedMembers","ignoreChildExemptions","logType"})
    private AuditLogConfigResponse(
        List<String> exemptedMembers,
        Boolean ignoreChildExemptions,
        String logType) {
        this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
        this.ignoreChildExemptions = Objects.requireNonNull(ignoreChildExemptions);
        this.logType = Objects.requireNonNull(logType);
    }

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    public List<String> getExemptedMembers() {
        return this.exemptedMembers;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    public Boolean getIgnoreChildExemptions() {
        return this.ignoreChildExemptions;
    }
    /**
     * The log type that this config enables.
     * 
     */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exemptedMembers;
        private Boolean ignoreChildExemptions;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.ignoreChildExemptions = defaults.ignoreChildExemptions;
    	      this.logType = defaults.logType;
        }

        public Builder setExemptedMembers(List<String> exemptedMembers) {
            this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
            return this;
        }

        public Builder setIgnoreChildExemptions(Boolean ignoreChildExemptions) {
            this.ignoreChildExemptions = Objects.requireNonNull(ignoreChildExemptions);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public AuditLogConfigResponse build() {
            return new AuditLogConfigResponse(exemptedMembers, ignoreChildExemptions, logType);
        }
    }
}

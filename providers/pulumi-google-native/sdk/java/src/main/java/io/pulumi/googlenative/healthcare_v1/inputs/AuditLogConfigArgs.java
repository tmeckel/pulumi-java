// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.enums.AuditLogConfigLogType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class AuditLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuditLogConfigArgs Empty = new AuditLogConfigArgs();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @InputImport(name="exemptedMembers")
    private final @Nullable Input<List<String>> exemptedMembers;

    public Input<List<String>> getExemptedMembers() {
        return this.exemptedMembers == null ? Input.empty() : this.exemptedMembers;
    }

    /**
     * The log type that this config enables.
     * 
     */
    @InputImport(name="logType")
    private final @Nullable Input<AuditLogConfigLogType> logType;

    public Input<AuditLogConfigLogType> getLogType() {
        return this.logType == null ? Input.empty() : this.logType;
    }

    public AuditLogConfigArgs(
        @Nullable Input<List<String>> exemptedMembers,
        @Nullable Input<AuditLogConfigLogType> logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    private AuditLogConfigArgs() {
        this.exemptedMembers = Input.empty();
        this.logType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> exemptedMembers;
        private @Nullable Input<AuditLogConfigLogType> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder setExemptedMembers(@Nullable Input<List<String>> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder setExemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = Input.ofNullable(exemptedMembers);
            return this;
        }

        public Builder setLogType(@Nullable Input<AuditLogConfigLogType> logType) {
            this.logType = logType;
            return this;
        }

        public Builder setLogType(@Nullable AuditLogConfigLogType logType) {
            this.logType = Input.ofNullable(logType);
            return this;
        }

        public AuditLogConfigArgs build() {
            return new AuditLogConfigArgs(exemptedMembers, logType);
        }
    }
}

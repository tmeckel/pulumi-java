// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Provides the configuration for logging a type of permissions. Example: { &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34;, &#34;exempted_members&#34;: [ &#34;user:jose@example.com&#34; ] }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34; } ] } This enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class AuditLogConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuditLogConfigResponse Empty = new AuditLogConfigResponse();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @Import(name="exemptedMembers", required=true)
    private List<String> exemptedMembers;

    /**
     * @return Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    public List<String> exemptedMembers() {
        return this.exemptedMembers;
    }

    /**
     * The log type that this config enables.
     * 
     */
    @Import(name="logType", required=true)
    private String logType;

    /**
     * @return The log type that this config enables.
     * 
     */
    public String logType() {
        return this.logType;
    }

    private AuditLogConfigResponse() {}

    private AuditLogConfigResponse(AuditLogConfigResponse $) {
        this.exemptedMembers = $.exemptedMembers;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuditLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuditLogConfigResponse $;

        public Builder() {
            $ = new AuditLogConfigResponse();
        }

        public Builder(AuditLogConfigResponse defaults) {
            $ = new AuditLogConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param exemptedMembers Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
         * 
         * @return builder
         * 
         */
        public Builder exemptedMembers(List<String> exemptedMembers) {
            $.exemptedMembers = exemptedMembers;
            return this;
        }

        /**
         * @param exemptedMembers Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
         * 
         * @return builder
         * 
         */
        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }

        /**
         * @param logType The log type that this config enables.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            $.logType = logType;
            return this;
        }

        public AuditLogConfigResponse build() {
            $.exemptedMembers = Objects.requireNonNull($.exemptedMembers, "expected parameter 'exemptedMembers' to be non-null");
            $.logType = Objects.requireNonNull($.logType, "expected parameter 'logType' to be non-null");
            return $;
        }
    }

}

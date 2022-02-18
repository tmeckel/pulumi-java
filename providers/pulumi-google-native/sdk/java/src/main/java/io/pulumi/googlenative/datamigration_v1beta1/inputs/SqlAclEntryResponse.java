// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An entry for an Access Control list.
 * 
 */
public final class SqlAclEntryResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlAclEntryResponse Empty = new SqlAclEntryResponse();

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
     */
    @InputImport(name="expireTime", required=true)
    private final String expireTime;

    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * A label to identify this entry.
     * 
     */
    @InputImport(name="label", required=true)
    private final String label;

    public String getLabel() {
        return this.label;
    }

    /**
     * Input only. The time-to-leave of this access control entry.
     * 
     */
    @InputImport(name="ttl", required=true)
    private final String ttl;

    public String getTtl() {
        return this.ttl;
    }

    /**
     * The allowlisted value for the access control list.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public SqlAclEntryResponse(
        String expireTime,
        String label,
        String ttl,
        String value) {
        this.expireTime = Objects.requireNonNull(expireTime, "expected parameter 'expireTime' to be non-null");
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SqlAclEntryResponse() {
        this.expireTime = null;
        this.label = null;
        this.ttl = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlAclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expireTime;
        private String label;
        private String ttl;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlAclEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
    	      this.label = defaults.label;
    	      this.ttl = defaults.ttl;
    	      this.value = defaults.value;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public SqlAclEntryResponse build() {
            return new SqlAclEntryResponse(expireTime, label, ttl, value);
        }
    }
}

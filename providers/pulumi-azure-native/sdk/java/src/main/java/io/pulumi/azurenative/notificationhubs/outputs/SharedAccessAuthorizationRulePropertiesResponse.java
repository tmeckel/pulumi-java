// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SharedAccessAuthorizationRulePropertiesResponse {
    /**
     * A string that describes the claim type
     * 
     */
    private final String claimType;
    /**
     * A string that describes the claim value
     * 
     */
    private final String claimValue;
    /**
     * The created time for this rule
     * 
     */
    private final String createdTime;
    /**
     * A string that describes the authorization rule.
     * 
     */
    private final String keyName;
    /**
     * The last modified time for this rule
     * 
     */
    private final String modifiedTime;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String primaryKey;
    /**
     * The revision number for the rule
     * 
     */
    private final Integer revision;
    /**
     * The rights associated with the rule.
     * 
     */
    private final @Nullable List<String> rights;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String secondaryKey;

    @OutputCustomType.Constructor
    private SharedAccessAuthorizationRulePropertiesResponse(
        @OutputCustomType.Parameter("claimType") String claimType,
        @OutputCustomType.Parameter("claimValue") String claimValue,
        @OutputCustomType.Parameter("createdTime") String createdTime,
        @OutputCustomType.Parameter("keyName") String keyName,
        @OutputCustomType.Parameter("modifiedTime") String modifiedTime,
        @OutputCustomType.Parameter("primaryKey") String primaryKey,
        @OutputCustomType.Parameter("revision") Integer revision,
        @OutputCustomType.Parameter("rights") @Nullable List<String> rights,
        @OutputCustomType.Parameter("secondaryKey") String secondaryKey) {
        this.claimType = claimType;
        this.claimValue = claimValue;
        this.createdTime = createdTime;
        this.keyName = keyName;
        this.modifiedTime = modifiedTime;
        this.primaryKey = primaryKey;
        this.revision = revision;
        this.rights = rights;
        this.secondaryKey = secondaryKey;
    }

    /**
     * A string that describes the claim type
     * 
    */
    public String getClaimType() {
        return this.claimType;
    }
    /**
     * A string that describes the claim value
     * 
    */
    public String getClaimValue() {
        return this.claimValue;
    }
    /**
     * The created time for this rule
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * A string that describes the authorization rule.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * The last modified time for this rule
     * 
    */
    public String getModifiedTime() {
        return this.modifiedTime;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * The revision number for the rule
     * 
    */
    public Integer getRevision() {
        return this.revision;
    }
    /**
     * The rights associated with the rule.
     * 
    */
    public List<String> getRights() {
        return this.rights == null ? List.of() : this.rights;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedAccessAuthorizationRulePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String claimType;
        private String claimValue;
        private String createdTime;
        private String keyName;
        private String modifiedTime;
        private String primaryKey;
        private Integer revision;
        private @Nullable List<String> rights;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedAccessAuthorizationRulePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimType = defaults.claimType;
    	      this.claimValue = defaults.claimValue;
    	      this.createdTime = defaults.createdTime;
    	      this.keyName = defaults.keyName;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.primaryKey = defaults.primaryKey;
    	      this.revision = defaults.revision;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder claimType(String claimType) {
            this.claimType = Objects.requireNonNull(claimType);
            return this;
        }

        public Builder claimValue(String claimValue) {
            this.claimValue = Objects.requireNonNull(claimValue);
            return this;
        }

        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }

        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder rights(@Nullable List<String> rights) {
            this.rights = rights;
            return this;
        }

        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public SharedAccessAuthorizationRulePropertiesResponse build() {
            return new SharedAccessAuthorizationRulePropertiesResponse(claimType, claimValue, createdTime, keyName, modifiedTime, primaryKey, revision, rights, secondaryKey);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.AccessRights;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of an IoT hub shared access policy.
 * 
 */
public final class SharedAccessSignatureAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedAccessSignatureAuthorizationRuleArgs Empty = new SharedAccessSignatureAuthorizationRuleArgs();

    /**
     * The name of the shared access policy.
     * 
     */
    @InputImport(name="keyName", required=true)
      private final Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName;
    }

    /**
     * The primary key.
     * 
     */
    @InputImport(name="primaryKey")
      private final @Nullable Input<String> primaryKey;

    public Input<String> getPrimaryKey() {
        return this.primaryKey == null ? Input.empty() : this.primaryKey;
    }

    /**
     * The permissions assigned to the shared access policy.
     * 
     */
    @InputImport(name="rights", required=true)
      private final Input<AccessRights> rights;

    public Input<AccessRights> getRights() {
        return this.rights;
    }

    /**
     * The secondary key.
     * 
     */
    @InputImport(name="secondaryKey")
      private final @Nullable Input<String> secondaryKey;

    public Input<String> getSecondaryKey() {
        return this.secondaryKey == null ? Input.empty() : this.secondaryKey;
    }

    public SharedAccessSignatureAuthorizationRuleArgs(
        Input<String> keyName,
        @Nullable Input<String> primaryKey,
        Input<AccessRights> rights,
        @Nullable Input<String> secondaryKey) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.primaryKey = primaryKey;
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
        this.secondaryKey = secondaryKey;
    }

    private SharedAccessSignatureAuthorizationRuleArgs() {
        this.keyName = Input.empty();
        this.primaryKey = Input.empty();
        this.rights = Input.empty();
        this.secondaryKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedAccessSignatureAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyName;
        private @Nullable Input<String> primaryKey;
        private Input<AccessRights> rights;
        private @Nullable Input<String> secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedAccessSignatureAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.primaryKey = defaults.primaryKey;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder keyName(Input<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder keyName(String keyName) {
            this.keyName = Input.of(Objects.requireNonNull(keyName));
            return this;
        }

        public Builder primaryKey(@Nullable Input<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = Input.ofNullable(primaryKey);
            return this;
        }

        public Builder rights(Input<AccessRights> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder rights(AccessRights rights) {
            this.rights = Input.of(Objects.requireNonNull(rights));
            return this;
        }

        public Builder secondaryKey(@Nullable Input<String> secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }

        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = Input.ofNullable(secondaryKey);
            return this;
        }
        public SharedAccessSignatureAuthorizationRuleArgs build() {
            return new SharedAccessSignatureAuthorizationRuleArgs(keyName, primaryKey, rights, secondaryKey);
        }
    }
}

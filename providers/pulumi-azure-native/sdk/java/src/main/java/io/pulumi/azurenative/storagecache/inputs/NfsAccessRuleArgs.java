// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.enums.NfsAccessRuleAccess;
import io.pulumi.azurenative.storagecache.enums.NfsAccessRuleScope;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule to place restrictions on portions of the cache namespace being presented to clients.
 * 
 */
public final class NfsAccessRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsAccessRuleArgs Empty = new NfsAccessRuleArgs();

    /**
     * Access allowed by this rule.
     * 
     */
    @InputImport(name="access", required=true)
      private final Input<Either<String,NfsAccessRuleAccess>> access;

    public Input<Either<String,NfsAccessRuleAccess>> getAccess() {
        return this.access;
    }

    /**
     * GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
     * 
     */
    @InputImport(name="anonymousGID")
      private final @Nullable Input<String> anonymousGID;

    public Input<String> getAnonymousGID() {
        return this.anonymousGID == null ? Input.empty() : this.anonymousGID;
    }

    /**
     * UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
     * 
     */
    @InputImport(name="anonymousUID")
      private final @Nullable Input<String> anonymousUID;

    public Input<String> getAnonymousUID() {
        return this.anonymousUID == null ? Input.empty() : this.anonymousUID;
    }

    /**
     * Filter applied to the scope for this rule. The filter's format depends on its scope. 'default' scope matches all clients and has no filter value. 'network' scope takes a filter in CIDR format (for example, 10.99.1.0/24). 'host' takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Map root accesses to anonymousUID and anonymousGID.
     * 
     */
    @InputImport(name="rootSquash")
      private final @Nullable Input<Boolean> rootSquash;

    public Input<Boolean> getRootSquash() {
        return this.rootSquash == null ? Input.empty() : this.rootSquash;
    }

    /**
     * Scope for this rule. The scope and filter determine which clients match the rule.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<Either<String,NfsAccessRuleScope>> scope;

    public Input<Either<String,NfsAccessRuleScope>> getScope() {
        return this.scope;
    }

    /**
     * For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path '/'. If set to yes, clients can mount a deeper path, like '/a/b'.
     * 
     */
    @InputImport(name="submountAccess")
      private final @Nullable Input<Boolean> submountAccess;

    public Input<Boolean> getSubmountAccess() {
        return this.submountAccess == null ? Input.empty() : this.submountAccess;
    }

    /**
     * Allow SUID semantics.
     * 
     */
    @InputImport(name="suid")
      private final @Nullable Input<Boolean> suid;

    public Input<Boolean> getSuid() {
        return this.suid == null ? Input.empty() : this.suid;
    }

    public NfsAccessRuleArgs(
        Input<Either<String,NfsAccessRuleAccess>> access,
        @Nullable Input<String> anonymousGID,
        @Nullable Input<String> anonymousUID,
        @Nullable Input<String> filter,
        @Nullable Input<Boolean> rootSquash,
        Input<Either<String,NfsAccessRuleScope>> scope,
        @Nullable Input<Boolean> submountAccess,
        @Nullable Input<Boolean> suid) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.anonymousGID = anonymousGID;
        this.anonymousUID = anonymousUID;
        this.filter = filter;
        this.rootSquash = rootSquash;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.submountAccess = submountAccess;
        this.suid = suid;
    }

    private NfsAccessRuleArgs() {
        this.access = Input.empty();
        this.anonymousGID = Input.empty();
        this.anonymousUID = Input.empty();
        this.filter = Input.empty();
        this.rootSquash = Input.empty();
        this.scope = Input.empty();
        this.submountAccess = Input.empty();
        this.suid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsAccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,NfsAccessRuleAccess>> access;
        private @Nullable Input<String> anonymousGID;
        private @Nullable Input<String> anonymousUID;
        private @Nullable Input<String> filter;
        private @Nullable Input<Boolean> rootSquash;
        private Input<Either<String,NfsAccessRuleScope>> scope;
        private @Nullable Input<Boolean> submountAccess;
        private @Nullable Input<Boolean> suid;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsAccessRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.anonymousGID = defaults.anonymousGID;
    	      this.anonymousUID = defaults.anonymousUID;
    	      this.filter = defaults.filter;
    	      this.rootSquash = defaults.rootSquash;
    	      this.scope = defaults.scope;
    	      this.submountAccess = defaults.submountAccess;
    	      this.suid = defaults.suid;
        }

        public Builder access(Input<Either<String,NfsAccessRuleAccess>> access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder access(Either<String,NfsAccessRuleAccess> access) {
            this.access = Input.of(Objects.requireNonNull(access));
            return this;
        }

        public Builder anonymousGID(@Nullable Input<String> anonymousGID) {
            this.anonymousGID = anonymousGID;
            return this;
        }

        public Builder anonymousGID(@Nullable String anonymousGID) {
            this.anonymousGID = Input.ofNullable(anonymousGID);
            return this;
        }

        public Builder anonymousUID(@Nullable Input<String> anonymousUID) {
            this.anonymousUID = anonymousUID;
            return this;
        }

        public Builder anonymousUID(@Nullable String anonymousUID) {
            this.anonymousUID = Input.ofNullable(anonymousUID);
            return this;
        }

        public Builder filter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder rootSquash(@Nullable Input<Boolean> rootSquash) {
            this.rootSquash = rootSquash;
            return this;
        }

        public Builder rootSquash(@Nullable Boolean rootSquash) {
            this.rootSquash = Input.ofNullable(rootSquash);
            return this;
        }

        public Builder scope(Input<Either<String,NfsAccessRuleScope>> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(Either<String,NfsAccessRuleScope> scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder submountAccess(@Nullable Input<Boolean> submountAccess) {
            this.submountAccess = submountAccess;
            return this;
        }

        public Builder submountAccess(@Nullable Boolean submountAccess) {
            this.submountAccess = Input.ofNullable(submountAccess);
            return this;
        }

        public Builder suid(@Nullable Input<Boolean> suid) {
            this.suid = suid;
            return this;
        }

        public Builder suid(@Nullable Boolean suid) {
            this.suid = Input.ofNullable(suid);
            return this;
        }
        public NfsAccessRuleArgs build() {
            return new NfsAccessRuleArgs(access, anonymousGID, anonymousUID, filter, rootSquash, scope, submountAccess, suid);
        }
    }
}

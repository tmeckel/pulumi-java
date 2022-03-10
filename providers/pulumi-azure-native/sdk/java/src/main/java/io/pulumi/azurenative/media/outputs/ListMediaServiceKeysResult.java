// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListMediaServiceKeysResult {
    /**
     * The primary authorization endpoint.
     * 
     */
    private final @Nullable String primaryAuthEndpoint;
    /**
     * The primary key for the Media Service resource.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * The authorization scope.
     * 
     */
    private final @Nullable String scope;
    /**
     * The secondary authorization endpoint.
     * 
     */
    private final @Nullable String secondaryAuthEndpoint;
    /**
     * The secondary key for the Media Service resource.
     * 
     */
    private final @Nullable String secondaryKey;

    @OutputCustomType.Constructor
    private ListMediaServiceKeysResult(
        @OutputCustomType.Parameter("primaryAuthEndpoint") @Nullable String primaryAuthEndpoint,
        @OutputCustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @OutputCustomType.Parameter("scope") @Nullable String scope,
        @OutputCustomType.Parameter("secondaryAuthEndpoint") @Nullable String secondaryAuthEndpoint,
        @OutputCustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.primaryAuthEndpoint = primaryAuthEndpoint;
        this.primaryKey = primaryKey;
        this.scope = scope;
        this.secondaryAuthEndpoint = secondaryAuthEndpoint;
        this.secondaryKey = secondaryKey;
    }

    /**
     * The primary authorization endpoint.
     * 
    */
    public Optional<String> getPrimaryAuthEndpoint() {
        return Optional.ofNullable(this.primaryAuthEndpoint);
    }
    /**
     * The primary key for the Media Service resource.
     * 
    */
    public Optional<String> getPrimaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * The authorization scope.
     * 
    */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * The secondary authorization endpoint.
     * 
    */
    public Optional<String> getSecondaryAuthEndpoint() {
        return Optional.ofNullable(this.secondaryAuthEndpoint);
    }
    /**
     * The secondary key for the Media Service resource.
     * 
    */
    public Optional<String> getSecondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMediaServiceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primaryAuthEndpoint;
        private @Nullable String primaryKey;
        private @Nullable String scope;
        private @Nullable String secondaryAuthEndpoint;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMediaServiceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryAuthEndpoint = defaults.primaryAuthEndpoint;
    	      this.primaryKey = defaults.primaryKey;
    	      this.scope = defaults.scope;
    	      this.secondaryAuthEndpoint = defaults.secondaryAuthEndpoint;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder primaryAuthEndpoint(@Nullable String primaryAuthEndpoint) {
            this.primaryAuthEndpoint = primaryAuthEndpoint;
            return this;
        }

        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder secondaryAuthEndpoint(@Nullable String secondaryAuthEndpoint) {
            this.secondaryAuthEndpoint = secondaryAuthEndpoint;
            return this;
        }

        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public ListMediaServiceKeysResult build() {
            return new ListMediaServiceKeysResult(primaryAuthEndpoint, primaryKey, scope, secondaryAuthEndpoint, secondaryKey);
        }
    }
}

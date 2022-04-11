// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.enums.CacheIdentityType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cache identity properties.
 * 
 */
public final class CacheIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheIdentityArgs Empty = new CacheIdentityArgs();

    /**
     * The type of identity used for the cache
     * 
     */
    @Import(name="type")
      private final @Nullable Output<CacheIdentityType> type;

    public Output<CacheIdentityType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public CacheIdentityArgs(@Nullable Output<CacheIdentityType> type) {
        this.type = type;
    }

    private CacheIdentityArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CacheIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<CacheIdentityType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable CacheIdentityType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public CacheIdentityArgs build() {
            return new CacheIdentityArgs(type);
        }
    }
}

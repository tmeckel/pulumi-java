// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The `MembershipRole` expiry details.
 * 
 */
public final class ExpiryDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpiryDetailArgs Empty = new ExpiryDetailArgs();

    /**
     * The time at which the `MembershipRole` will expire.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> getExpireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    public ExpiryDetailArgs(@Nullable Output<String> expireTime) {
        this.expireTime = expireTime;
    }

    private ExpiryDetailArgs() {
        this.expireTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpiryDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expireTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpiryDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
        }

        public Builder expireTime(@Nullable Output<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = Codegen.ofNullable(expireTime);
            return this;
        }        public ExpiryDetailArgs build() {
            return new ExpiryDetailArgs(expireTime);
        }
    }
}

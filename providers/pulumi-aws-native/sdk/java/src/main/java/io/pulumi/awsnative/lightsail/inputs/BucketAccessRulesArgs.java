// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that sets the public accessibility of objects in the specified bucket.
 * 
 */
public final class BucketAccessRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketAccessRulesArgs Empty = new BucketAccessRulesArgs();

    /**
     * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual objects override the getObject option that is currently specified.
     * 
     */
    @InputImport(name="allowPublicOverrides")
      private final @Nullable Input<Boolean> allowPublicOverrides;

    public Input<Boolean> getAllowPublicOverrides() {
        return this.allowPublicOverrides == null ? Input.empty() : this.allowPublicOverrides;
    }

    /**
     * Specifies the anonymous access to all objects in a bucket.
     * 
     */
    @InputImport(name="getObject")
      private final @Nullable Input<String> getObject;

    public Input<String> getGetObject() {
        return this.getObject == null ? Input.empty() : this.getObject;
    }

    public BucketAccessRulesArgs(
        @Nullable Input<Boolean> allowPublicOverrides,
        @Nullable Input<String> getObject) {
        this.allowPublicOverrides = allowPublicOverrides;
        this.getObject = getObject;
    }

    private BucketAccessRulesArgs() {
        this.allowPublicOverrides = Input.empty();
        this.getObject = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowPublicOverrides;
        private @Nullable Input<String> getObject;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPublicOverrides = defaults.allowPublicOverrides;
    	      this.getObject = defaults.getObject;
        }

        public Builder allowPublicOverrides(@Nullable Input<Boolean> allowPublicOverrides) {
            this.allowPublicOverrides = allowPublicOverrides;
            return this;
        }

        public Builder allowPublicOverrides(@Nullable Boolean allowPublicOverrides) {
            this.allowPublicOverrides = Input.ofNullable(allowPublicOverrides);
            return this;
        }

        public Builder getObject(@Nullable Input<String> getObject) {
            this.getObject = getObject;
            return this;
        }

        public Builder getObject(@Nullable String getObject) {
            this.getObject = Input.ofNullable(getObject);
            return this;
        }
        public BucketAccessRulesArgs build() {
            return new BucketAccessRulesArgs(allowPublicOverrides, getObject);
        }
    }
}

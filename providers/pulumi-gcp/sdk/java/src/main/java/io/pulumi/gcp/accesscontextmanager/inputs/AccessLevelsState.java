// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelsState extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelsState Empty = new AccessLevelsState();

    /**
     * The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="accessLevels")
      private final @Nullable Input<List<AccessLevelsAccessLevelGetArgs>> accessLevels;

    public Input<List<AccessLevelsAccessLevelGetArgs>> getAccessLevels() {
        return this.accessLevels == null ? Input.empty() : this.accessLevels;
    }

    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    public AccessLevelsState(
        @Nullable Input<List<AccessLevelsAccessLevelGetArgs>> accessLevels,
        @Nullable Input<String> parent) {
        this.accessLevels = accessLevels;
        this.parent = parent;
    }

    private AccessLevelsState() {
        this.accessLevels = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AccessLevelsAccessLevelGetArgs>> accessLevels;
        private @Nullable Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.parent = defaults.parent;
        }

        public Builder accessLevels(@Nullable Input<List<AccessLevelsAccessLevelGetArgs>> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder accessLevels(@Nullable List<AccessLevelsAccessLevelGetArgs> accessLevels) {
            this.accessLevels = Input.ofNullable(accessLevels);
            return this;
        }

        public Builder parent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }
        public AccessLevelsState build() {
            return new AccessLevelsState(accessLevels, parent);
        }
    }
}

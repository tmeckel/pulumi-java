// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The set of data plane operations permitted through this Role Definition.
 * 
 */
public final class PermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionArgs Empty = new PermissionArgs();

    /**
     * An array of data actions that are allowed.
     * 
     */
    @InputImport(name="dataActions")
      private final @Nullable Input<List<String>> dataActions;

    public Input<List<String>> getDataActions() {
        return this.dataActions == null ? Input.empty() : this.dataActions;
    }

    /**
     * An array of data actions that are denied.
     * 
     */
    @InputImport(name="notDataActions")
      private final @Nullable Input<List<String>> notDataActions;

    public Input<List<String>> getNotDataActions() {
        return this.notDataActions == null ? Input.empty() : this.notDataActions;
    }

    public PermissionArgs(
        @Nullable Input<List<String>> dataActions,
        @Nullable Input<List<String>> notDataActions) {
        this.dataActions = dataActions;
        this.notDataActions = notDataActions;
    }

    private PermissionArgs() {
        this.dataActions = Input.empty();
        this.notDataActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dataActions;
        private @Nullable Input<List<String>> notDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataActions = defaults.dataActions;
    	      this.notDataActions = defaults.notDataActions;
        }

        public Builder dataActions(@Nullable Input<List<String>> dataActions) {
            this.dataActions = dataActions;
            return this;
        }

        public Builder dataActions(@Nullable List<String> dataActions) {
            this.dataActions = Input.ofNullable(dataActions);
            return this;
        }

        public Builder notDataActions(@Nullable Input<List<String>> notDataActions) {
            this.notDataActions = notDataActions;
            return this;
        }

        public Builder notDataActions(@Nullable List<String> notDataActions) {
            this.notDataActions = Input.ofNullable(notDataActions);
            return this;
        }
        public PermissionArgs build() {
            return new PermissionArgs(dataActions, notDataActions);
        }
    }
}
